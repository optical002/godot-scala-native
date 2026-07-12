<#
.SYNOPSIS
  Installs (or verifies) the native build toolchain required to build the
  godot-scala-native GDExtension .dll on a fresh Windows machine.

.DESCRIPTION
  Designed to be run as a single command, with nothing cloned:

      powershell -c "irm https://raw.githubusercontent.com/optical002/godot-scala-native/main/install-toolchain.ps1 | iex"

  For each dependency it DETECTS the current state, checks the version, and
  SKIPS anything already correct — so it is safe to re-run. It installs via
  winget when available (self-elevating for the installs that need admin), and
  falls back to Scoop (user-scoped, no admin) when winget is unavailable.

  It does NOT install Godot, does NOT clone the repo, and does NOT modify your
  global JAVA_HOME. It pins the build to JDK 17 by installing Temurin 17 to a
  fixed location and (if it can find a checkout) writing `-java-home` into the
  repo's `.sbtopts` files.

  Dependencies handled:
    * JDK 17            (Eclipse Temurin 17)          — major version must be 17
    * sbt               (launcher; self-fetches 1.9.7)
    * LLVM / Clang      (>= 16)
    * VS C++ Build Tools (Desktop C++ / VCTools workload)
    * Boehm GC (bdwgc)  via vcpkg  (provides libgc + gc.h for GC.boehm)
    * Git

.PARAMETER Check
  Report each dependency's state and exit WITHOUT installing anything.

.PARAMETER RepoPath
  Path to a godot-scala-native checkout. If given (or auto-detected as the
  script's own directory when run from a clone), the JDK-17 `-java-home` pin is
  written into <RepoPath>\language-binding-scala\.sbtopts and
  <RepoPath>\harness-scala\.sbtopts.
#>
[CmdletBinding()]
param(
  [switch] $Check,
  [string] $RepoPath
)

$ErrorActionPreference = 'Stop'
Set-StrictMode -Version Latest

# ---------------------------------------------------------------------------
# Pinned versions / identifiers
# ---------------------------------------------------------------------------
$JdkMajor        = 17
$ClangMinMajor   = 16
$TemurinWingetId = 'EclipseAdoptium.Temurin.17.JDK'
$TemurinScoopPkg = 'temurin17-jdk'
$LlvmWingetId    = 'LLVM.LLVM'
$LlvmScoopPkg    = 'llvm'
$SbtWingetId     = 'sbt.sbt'
$SbtScoopPkg     = 'sbt'
$GitWingetId     = 'Git.Git'
$GitScoopPkg     = 'git'
$VsBuildToolsId  = 'Microsoft.VisualStudio.2022.BuildTools'
$VcWorkloadId    = 'Microsoft.VisualStudio.Component.VC.Tools.x86.x64'

$script:Summary  = New-Object System.Collections.Generic.List[object]

# ---------------------------------------------------------------------------
# Console helpers
# ---------------------------------------------------------------------------
function Write-Head($m) { Write-Host "`n== $m ==" -ForegroundColor Cyan }
function Write-Ok  ($m) { Write-Host "  [ ok ]   $m" -ForegroundColor Green }
function Write-Add ($m) { Write-Host "  [ +  ]   $m" -ForegroundColor Yellow }
function Write-Miss($m) { Write-Host "  [ !! ]   $m" -ForegroundColor Red }
function Write-Info($m) { Write-Host "  [ .. ]   $m" -ForegroundColor DarkGray }

function Note([string]$dep, [string]$state, [string]$detail) {
  $script:Summary.Add([pscustomobject]@{ Dep = $dep; State = $state; Detail = $detail })
}

# ---------------------------------------------------------------------------
# Package-manager detection & fallback
# ---------------------------------------------------------------------------
function Test-Command($name) {
  return [bool](Get-Command $name -ErrorAction SilentlyContinue)
}

function Test-IsAdmin {
  $id = [Security.Principal.WindowsIdentity]::GetCurrent()
  return ([Security.Principal.WindowsPrincipal]$id).IsInRole(
    [Security.Principal.WindowsBuiltInRole]::Administrator)
}

$script:PkgMgr = $null
function Get-PackageManager {
  if ($script:PkgMgr) { return $script:PkgMgr }
  if (Test-Command winget) {
    $script:PkgMgr = 'winget'
  } elseif (Test-Command scoop) {
    $script:PkgMgr = 'scoop'
  } else {
    Write-Info 'Neither winget nor scoop found; bootstrapping Scoop (user-scoped, no admin)...'
    try {
      Invoke-Expression (Invoke-RestMethod -Uri 'https://get.scoop.sh')
      $script:PkgMgr = 'scoop'
    } catch {
      throw "Could not find or install a package manager (winget/scoop): $($_.Exception.Message)"
    }
  }
  Write-Info "Using package manager: $($script:PkgMgr)"
  return $script:PkgMgr
}

# Refresh PATH from the machine + user registry so freshly installed tools are
# visible to this same session without a restart.
function Update-SessionPath {
  $machine = [Environment]::GetEnvironmentVariable('Path', 'Machine')
  $user    = [Environment]::GetEnvironmentVariable('Path', 'User')
  $env:Path = (@($machine, $user) | Where-Object { $_ }) -join ';'
}

function Install-Package {
  param(
    [Parameter(Mandatory)] [string] $WingetId,
    [string] $ScoopPkg,
    [string[]] $WingetExtraArgs
  )
  $mgr = Get-PackageManager
  if ($mgr -eq 'winget') {
    $wingetArgs = @('install', '--id', $WingetId, '--exact',
                    '--accept-source-agreements', '--accept-package-agreements',
                    '--silent')
    if ($WingetExtraArgs) { $wingetArgs += $WingetExtraArgs }
    Write-Info "winget $($wingetArgs -join ' ')"
    & winget @wingetArgs
    if ($LASTEXITCODE -ne 0 -and $LASTEXITCODE -ne -1978335189) {
      # -1978335189 == "no applicable upgrade / already installed"
      throw "winget failed for $WingetId (exit $LASTEXITCODE)"
    }
  } else {
    if (-not $ScoopPkg) { throw "No Scoop package mapping for $WingetId" }
    if ($ScoopPkg -match 'temurin|llvm') {
      & scoop bucket add versions 2>$null | Out-Null
      & scoop bucket add java    2>$null | Out-Null
    }
    Write-Info "scoop install $ScoopPkg"
    & scoop install $ScoopPkg
    if ($LASTEXITCODE -ne 0) { throw "scoop failed for $ScoopPkg (exit $LASTEXITCODE)" }
  }
  Update-SessionPath
}

# ---------------------------------------------------------------------------
# Self-elevation (winget installs of system packages need admin)
# ---------------------------------------------------------------------------
function Ensure-Elevated {
  if ($Check) { return }                       # check mode never installs
  if (Test-IsAdmin) { return }
  # Scoop path is user-scoped and needs no elevation.
  if ((Get-Command scoop -ErrorAction SilentlyContinue) -and
      -not (Get-Command winget -ErrorAction SilentlyContinue)) { return }

  Write-Info 'Elevation required for system installs; relaunching as Administrator...'
  # Re-fetch and re-run self elevated. When invoked via `irm|iex` there is no
  # script file on disk ($PSCommandPath is empty), so the elevated child
  # re-downloads the script and re-applies the same parameters. We forward them
  # by binding $args before splatting into the freshly-defined param() block.
  $selfUrl = 'https://raw.githubusercontent.com/optical002/godot-scala-native/main/install-toolchain.ps1'
  # (Elevation only runs in install mode — -Check returns before reaching here.)
  $pre = @()
  if ($RepoPath) { $pre += "`$args += @('-RepoPath','$RepoPath')" }
  $inner = "`$args=@(); $($pre -join '; '); & ([scriptblock]::Create((irm $selfUrl))) @args"
  Start-Process -FilePath 'powershell.exe' -Verb RunAs -ArgumentList @(
    '-NoProfile', '-ExecutionPolicy', 'Bypass', '-Command', $inner
  )
  Write-Info 'Continuing in the elevated window; this one will exit.'
  exit 0
}

# ---------------------------------------------------------------------------
# Per-dependency checks
# ---------------------------------------------------------------------------

# Returns the major version of the `java` currently on PATH, or $null.
function Get-JavaMajor {
  if (-not (Test-Command java)) { return $null }
  try {
    $out = (& java -version 2>&1) -join "`n"
  } catch { return $null }
  # e.g. 'openjdk version "17.0.13"' or '"1.8.0_402"'
  if ($out -match 'version\s+"([0-9]+)(?:\.([0-9]+))?') {
    $a = [int]$Matches[1]
    if ($a -eq 1 -and $Matches[2]) { return [int]$Matches[2] }  # 1.8 -> 8
    return $a
  }
  return $null
}

# Best-effort discovery of a Temurin 17 install directory.
function Find-Jdk17Home {
  $roots = @(
    "$env:ProgramFiles\Eclipse Adoptium",
    "${env:ProgramFiles(x86)}\Eclipse Adoptium",
    "$env:USERPROFILE\scoop\apps\$TemurinScoopPkg\current"
  )
  foreach ($r in $roots) {
    if (Test-Path $r) {
      $hit = Get-ChildItem -Path $r -Directory -ErrorAction SilentlyContinue |
             Where-Object { $_.Name -match 'jdk-?17' } |
             Sort-Object Name -Descending | Select-Object -First 1
      if ($hit) {
        $jdkDir = $hit.FullName
        if (Test-Path (Join-Path $jdkDir 'bin\java.exe')) { return $jdkDir }
      }
      # scoop 'current' is itself the JDK home
      if ((Split-Path $r -Leaf) -eq 'current' -and
          (Test-Path (Join-Path $r 'bin\java.exe'))) { return $r }
    }
  }
  return $null
}

function Ensure-Jdk17 {
  Write-Head 'JDK 17 (Eclipse Temurin)'
  $major = Get-JavaMajor
  $jdkHome = Find-Jdk17Home
  if ($jdkHome) {
    Write-Ok "JDK 17 present: $jdkHome"
    if ($major -and $major -ne $JdkMajor) {
      Write-Info "Default `java` on PATH is JDK $major; the build is pinned to 17 via .sbtopts, so this is fine."
    }
    Note 'JDK 17' 'ok' $jdkHome
    return $jdkHome
  }
  if ($major -eq $JdkMajor) {
    Write-Ok "JDK 17 is the default java on PATH (could not resolve its home dir)."
    Note 'JDK 17' 'ok' 'on PATH'
    return $null
  }
  if ($Check) { Write-Miss "JDK 17 not found (default java major = $major)"; Note 'JDK 17' 'missing' "java major=$major"; return $null }

  Write-Add 'Installing Eclipse Temurin 17...'
  Install-Package -WingetId $TemurinWingetId -ScoopPkg $TemurinScoopPkg
  $jdkHome = Find-Jdk17Home
  if ($jdkHome) { Write-Ok "Installed: $jdkHome"; Note 'JDK 17' 'installed' $jdkHome }
  else { Write-Miss 'Temurin 17 installed but home dir not found; set the pin manually.'; Note 'JDK 17' 'installed' 'home not resolved' }
  return $jdkHome
}

function Ensure-Sbt {
  Write-Head 'sbt'
  if (Test-Command sbt) {
    Write-Ok "sbt launcher present — the repo pins sbt.version=1.9.7 via project/build.properties, so the launcher self-fetches the right sbt."
    Note 'sbt' 'ok' 'launcher on PATH'
    return
  }
  if ($Check) { Write-Miss 'sbt not found'; Note 'sbt' 'missing' ''; return }
  Write-Add 'Installing sbt launcher...'
  Install-Package -WingetId $SbtWingetId -ScoopPkg $SbtScoopPkg
  Write-Ok 'sbt installed.'
  Note 'sbt' 'installed' ''
}

function Ensure-Clang {
  Write-Head "LLVM / Clang (>= $ClangMinMajor)"
  if (Test-Command clang) {
    $out = (& clang --version 2>&1) -join "`n"
    $major = if ($out -match 'clang version\s+([0-9]+)') { [int]$Matches[1] } else { 0 }
    if ($major -ge $ClangMinMajor) {
      Write-Ok "clang $major present."
      Note 'LLVM/Clang' 'ok' "clang $major"
      return
    }
    Write-Miss "clang $major is older than required $ClangMinMajor."
    if ($Check) { Note 'LLVM/Clang' 'outdated' "clang $major"; return }
  } elseif ($Check) {
    Write-Miss 'clang not found'; Note 'LLVM/Clang' 'missing' ''; return
  }
  Write-Add 'Installing LLVM/Clang...'
  Install-Package -WingetId $LlvmWingetId -ScoopPkg $LlvmScoopPkg
  Update-SessionPath
  if (Test-Command clang) { Write-Ok 'clang installed.'; Note 'LLVM/Clang' 'installed' '' }
  else { Write-Miss 'clang installed but not on PATH yet — open a new terminal after this run.'; Note 'LLVM/Clang' 'installed' 'PATH refresh needed' }
}

function Get-VsWhere {
  $p = Join-Path ${env:ProgramFiles(x86)} 'Microsoft Visual Studio\Installer\vswhere.exe'
  if (Test-Path $p) { return $p }
  return $null
}

function Test-VcBuildTools {
  $vswhere = Get-VsWhere
  if (-not $vswhere) { return $false }
  $found = & $vswhere -products '*' -requires $VcWorkloadId -property installationPath 2>$null
  return [bool]$found
}

function Ensure-VcBuildTools {
  Write-Head 'Visual Studio C++ Build Tools (VCTools workload)'
  if (Test-VcBuildTools) {
    Write-Ok 'Desktop C++ (VC.Tools.x86.x64) workload present.'
    Note 'VC Build Tools' 'ok' ''
    return
  }
  if ($Check) { Write-Miss 'VC++ Build Tools / VCTools workload not found'; Note 'VC Build Tools' 'missing' ''; return }
  Write-Add 'Installing VS 2022 Build Tools + Desktop C++ workload (multi-GB, may take a while)...'
  Install-Package -WingetId $VsBuildToolsId -ScoopPkg $null -WingetExtraArgs @(
    '--override', "--quiet --wait --norestart --nocache --add $VcWorkloadId --includeRecommended"
  )
  if (Test-VcBuildTools) { Write-Ok 'VC++ Build Tools installed.'; Note 'VC Build Tools' 'installed' '' }
  else { Write-Miss 'Build Tools install did not report the VCTools workload; verify in the VS Installer.'; Note 'VC Build Tools' 'installed' 'workload unverified' }
}

function Ensure-Git {
  Write-Head 'Git'
  if (Test-Command git) {
    $v = try { (& git --version 2>&1).Trim() } catch { '(present)' }
    Write-Ok $v
    Note 'Git' 'ok' $v
    return
  }
  if ($Check) { Write-Miss 'git not found'; Note 'Git' 'missing' ''; return }
  Write-Add 'Installing Git...'
  Install-Package -WingetId $GitWingetId -ScoopPkg $GitScoopPkg
  Write-Ok 'Git installed.'
  Note 'Git' 'installed' ''
}

# ---------------------------------------------------------------------------
# Boehm GC (bdwgc) via vcpkg — provides libgc + gc.h for GC.boehm
# ---------------------------------------------------------------------------
function Get-VcpkgRoot {
  if ($env:VCPKG_ROOT -and (Test-Path (Join-Path $env:VCPKG_ROOT 'vcpkg.exe'))) { return $env:VCPKG_ROOT }
  $default = Join-Path $env:USERPROFILE 'vcpkg'
  if (Test-Path (Join-Path $default 'vcpkg.exe')) { return $default }
  if (Test-Command vcpkg) { return (Split-Path (Get-Command vcpkg).Source) }
  return $null
}

function Ensure-Vcpkg {
  $root = Get-VcpkgRoot
  if ($root) { Write-Ok "vcpkg present: $root"; return $root }
  if ($Check) { Write-Miss 'vcpkg not found'; return $null }
  $root = Join-Path $env:USERPROFILE 'vcpkg'
  Write-Add "Bootstrapping vcpkg into $root ..."
  if (-not (Test-Path $root)) {
    & git clone --depth 1 https://github.com/microsoft/vcpkg.git $root
    if ($LASTEXITCODE -ne 0) { throw 'git clone of vcpkg failed' }
  }
  & (Join-Path $root 'bootstrap-vcpkg.bat') -disableMetrics
  if ($LASTEXITCODE -ne 0) { throw 'vcpkg bootstrap failed' }
  [Environment]::SetEnvironmentVariable('VCPKG_ROOT', $root, 'User')
  $env:VCPKG_ROOT = $root
  return $root
}

function Ensure-BoehmGc {
  Write-Head 'Boehm GC (bdwgc) via vcpkg  [required: GC.boehm links -lgc + gc.h]'
  $root = Get-VcpkgRoot
  $triplet = 'x64-windows'
  $installed = $false
  if ($root) {
    $h1 = Join-Path $root "installed\$triplet\include\gc\gc.h"
    $h2 = Join-Path $root "installed\$triplet\include\gc.h"
    $installed = (Test-Path $h1 -PathType Leaf) -or (Test-Path $h2 -PathType Leaf)
  }

  if ($installed) {
    Write-Ok "bdwgc already installed for $triplet."
  } elseif ($Check) {
    if ($root) { Write-Miss "bdwgc not installed under $root (triplet $triplet)" }
    else { Write-Miss 'vcpkg + bdwgc not found' }
    Note 'Boehm GC' 'missing' ''
    return
  } else {
    $root = Ensure-Vcpkg
    Write-Add "vcpkg install bdwgc:$triplet ..."
    & (Join-Path $root 'vcpkg.exe') install "bdwgc:$triplet"
    if ($LASTEXITCODE -ne 0) { throw "vcpkg install bdwgc:$triplet failed" }
    Write-Ok 'bdwgc installed.'
  }

  if ($root) {
    $inc = Join-Path $root "installed\$triplet\include"
    $lib = Join-Path $root "installed\$triplet\lib"
    $gcState = if ($installed) { 'ok' } else { 'installed' }
    Note 'Boehm GC' $gcState $root
    Write-Host ''
    Write-Info 'The build links Boehm GC via Scala Native''s GC.boehm (-lgc). Clang must'
    Write-Info 'find gc.h and libgc. Set these BEFORE `sbt godotBuild` (project-local,'
    Write-Info 'not global). PowerShell:'
    Write-Host "      `$env:C_INCLUDE_PATH = '$inc'" -ForegroundColor White
    Write-Host "      `$env:LIBRARY_PATH   = '$lib'" -ForegroundColor White
    $script:GcInclude = $inc
    $script:GcLib     = $lib
  }
}

# ---------------------------------------------------------------------------
# JDK-17 pin: write `-java-home` into a checkout's .sbtopts if we can find one.
# ---------------------------------------------------------------------------
$MARKER = '# vvv install-toolchain.ps1 manages the line below this marker (Windows only) vvv'

function Set-JavaHomePin {
  param([string]$JdkHome)

  if (-not $JdkHome) {
    Write-Info 'No resolved JDK 17 home; skipping .sbtopts pin. Add manually:'
    Write-Info '  -java-home <path-to-jdk-17>   (in both */.sbtopts)'
    return
  }

  # Determine repo root: explicit param, or the script's own dir if it looks
  # like a checkout (only meaningful when run from a clone, not via irm|iex).
  $repo = $RepoPath
  if (-not $repo -and $PSScriptRoot) {
    if (Test-Path (Join-Path $PSScriptRoot 'harness-scala\build.sbt')) { $repo = $PSScriptRoot }
  }
  if (-not $repo) {
    Write-Head 'JDK 17 pin'
    Write-Info 'No checkout detected (ran without a clone). After you clone the repo,'
    Write-Info 'append this line to BOTH language-binding-scala\.sbtopts and'
    Write-Info 'harness-scala\.sbtopts (below the manage marker):'
    Write-Host  "      -java-home $JdkHome" -ForegroundColor White
    Write-Info 'Or re-run this script with -RepoPath <checkout> to write it for you.'
    return
  }

  Write-Head "JDK 17 pin -> $repo"
  foreach ($rel in @('language-binding-scala\.sbtopts', 'harness-scala\.sbtopts')) {
    $path = Join-Path $repo $rel
    if (-not (Test-Path $path)) { Write-Miss "missing: $rel (is this the repo root?)"; continue }
    $text = Get-Content -Raw -Path $path
    $line = "-java-home $JdkHome"
    if ($text -match [regex]::Escape($MARKER)) {
      # Replace everything after the marker with our single managed line.
      $new = ($text -replace "(?s)$([regex]::Escape($MARKER)).*$", "$MARKER`n$line`n")
    } elseif ($text -match '(?m)^\s*-java-home\s') {
      $new = ($text -replace '(?m)^\s*-java-home\s.*$', $line)
    } else {
      $new = $text.TrimEnd() + "`n$line`n"
    }
    if ($new -ne $text) {
      Set-Content -Path $path -Value $new -NoNewline:$false -Encoding UTF8
      Write-Ok "pinned in $rel"
    } else {
      Write-Ok "$rel already pinned"
    }
  }
}

# ---------------------------------------------------------------------------
# Main
# ---------------------------------------------------------------------------
Write-Host ''
Write-Host '  godot-scala-native — Windows toolchain installer' -ForegroundColor Cyan
Write-Host '  (JDK 17 / sbt / LLVM-Clang / VC++ Build Tools / Boehm GC / Git)' -ForegroundColor DarkGray
if ($Check) { Write-Host '  MODE: check only — nothing will be installed.' -ForegroundColor Yellow }

$script:GcInclude = $null
$script:GcLib     = $null

Ensure-Elevated

$jdkHome = Ensure-Jdk17
Ensure-Sbt
Ensure-Clang
Ensure-VcBuildTools
Ensure-Git
Ensure-BoehmGc
Set-JavaHomePin -JdkHome $jdkHome

# ---------------------------------------------------------------------------
# Summary
# ---------------------------------------------------------------------------
Write-Head 'Summary'
$script:Summary | Format-Table -AutoSize | Out-String | Write-Host
$bad = @($script:Summary | Where-Object { $_.State -in @('missing','outdated') })

if ($Check) {
  if ($bad.Count) { Write-Miss "$($bad.Count) dependency(ies) need attention (see above)."; exit 1 }
  Write-Ok 'All dependencies present at the required versions.'
  exit 0
}

Write-Host ''
Write-Ok 'Toolchain step complete.'
Write-Host ''
Write-Info 'Next steps (in a NEW terminal so PATH changes take effect):'
Write-Info '  1) git clone https://github.com/optical002/godot-scala-native'
if ($script:GcInclude) {
  Write-Info '  2) Point clang at Boehm GC for this shell:'
  Write-Host "         `$env:C_INCLUDE_PATH = '$script:GcInclude'" -ForegroundColor White
  Write-Host "         `$env:LIBRARY_PATH   = '$script:GcLib'"     -ForegroundColor White
} else {
  Write-Info '  2) Ensure Boehm GC (gc.h / libgc) is on clang''s C_INCLUDE_PATH / LIBRARY_PATH.'
}
Write-Info '  3) cd godot-scala-native\language-binding-scala; sbt publishLocal'
Write-Info '  4) cd ..\harness-scala; sbt godotBuild   (produces godot\lib\scala-native-gdextension.dll)'
Write-Host ''
Write-Info 'NOTE: Boehm GC on Windows in Scala Native''s multithreaded mode is a known'
Write-Info 'rough edge upstream and is unproven in this repo — the first `sbt godotBuild`'
Write-Info 'is where you''ll confirm the .dll actually links.'
