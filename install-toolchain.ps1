<#
  godot-scala-native — Windows build-toolchain installer.

  Run via a single command (nothing needs to be cloned):

      powershell -c "irm https://raw.githubusercontent.com/optical002/godot-scala-native/main/install-toolchain.ps1 | iex"

  Installs (or, if already present, skips) the toolchain needed to build the
  GDExtension .dll:

      * JDK 17            (Eclipse Temurin 17)
      * sbt               (launcher; the repo pins sbt 1.9.7 itself)
      * LLVM / Clang      (>= 16)
      * VS C++ Build Tools (Desktop C++ / VCTools workload)
      * Boehm GC (bdwgc)  via vcpkg  (libgc + gc.h for GC.boehm)
      * Git

  It does NOT install Godot, does not clone the repo, and does not modify your
  environment beyond installing packages. Safe to re-run (idempotent).
#>

$ErrorActionPreference = 'Stop'

# --- console helpers ---------------------------------------------------------
function Write-Head($m) { Write-Host "`n== $m ==" -ForegroundColor Cyan }
function Write-Ok  ($m) { Write-Host "  [ ok ]  $m" -ForegroundColor Green }
function Write-Add ($m) { Write-Host "  [ +  ]  $m" -ForegroundColor Yellow }
function Write-Miss($m) { Write-Host "  [ !! ]  $m" -ForegroundColor Red }
function Write-Info($m) { Write-Host "  [ .. ]  $m" -ForegroundColor DarkGray }

function Test-Cmd($name) { [bool](Get-Command $name -ErrorAction SilentlyContinue) }

# Refresh PATH from the registry so freshly-installed tools are visible now.
function Update-Path {
  $m = [Environment]::GetEnvironmentVariable('Path', 'Machine')
  $u = [Environment]::GetEnvironmentVariable('Path', 'User')
  $env:Path = (@($m, $u) | Where-Object { $_ }) -join ';'
}

# --- package manager (winget, else bootstrap Scoop) --------------------------
$script:PkgMgr = $null
function Get-Pkg {
  if ($script:PkgMgr) { return $script:PkgMgr }
  if (Test-Cmd winget)     { $script:PkgMgr = 'winget' }
  elseif (Test-Cmd scoop)  { $script:PkgMgr = 'scoop' }
  else {
    Write-Info 'No winget/scoop found; bootstrapping Scoop (user-scoped, no admin)...'
    Invoke-Expression (Invoke-RestMethod 'https://get.scoop.sh')
    $script:PkgMgr = 'scoop'
  }
  Write-Info "Package manager: $($script:PkgMgr)"
  $script:PkgMgr
}

function Install-Pkg {
  param(
    [Parameter(Mandatory)][string] $WingetId,
    [string]   $ScoopPkg,
    [string[]] $WingetExtra
  )
  if ((Get-Pkg) -eq 'winget') {
    $a = @('install', '--id', $WingetId, '--exact', '--silent',
           '--accept-source-agreements', '--accept-package-agreements')
    if ($WingetExtra) { $a += $WingetExtra }
    Write-Info "winget $($a -join ' ')"
    & winget @a
    # -1978335189 = "already installed / no applicable upgrade"
    if ($LASTEXITCODE -ne 0 -and $LASTEXITCODE -ne -1978335189) {
      throw "winget failed for $WingetId (exit $LASTEXITCODE)"
    }
  } else {
    if (-not $ScoopPkg) { throw "No Scoop package for $WingetId (needs winget)" }
    if ($ScoopPkg -match 'temurin|llvm') {
      & scoop bucket add versions 2>$null | Out-Null
      & scoop bucket add java     2>$null | Out-Null
    }
    Write-Info "scoop install $ScoopPkg"
    & scoop install $ScoopPkg
    if ($LASTEXITCODE -ne 0) { throw "scoop failed for $ScoopPkg" }
  }
  Update-Path
}

# --- individual dependencies -------------------------------------------------
function Ensure-Jdk17 {
  Write-Head 'JDK 17 (Eclipse Temurin)'
  $roots = @(
    "$env:ProgramFiles\Eclipse Adoptium",
    "${env:ProgramFiles(x86)}\Eclipse Adoptium"
  )
  foreach ($r in $roots) {
    if (Test-Path $r) {
      $hit = Get-ChildItem $r -Directory -ErrorAction SilentlyContinue |
             Where-Object { $_.Name -match 'jdk-?17' } | Select-Object -First 1
      if ($hit -and (Test-Path (Join-Path $hit.FullName 'bin\java.exe'))) {
        Write-Ok "present: $($hit.FullName)"; return
      }
    }
  }
  Write-Add 'installing Temurin 17...'
  Install-Pkg -WingetId 'EclipseAdoptium.Temurin.17.JDK' -ScoopPkg 'temurin17-jdk'
  Write-Ok 'installed.'
}

function Ensure-Sbt {
  Write-Head 'sbt'
  if (Test-Cmd sbt) { Write-Ok 'present (repo pins sbt 1.9.7 via build.properties).'; return }
  Write-Add 'installing sbt...'
  Install-Pkg -WingetId 'sbt.sbt' -ScoopPkg 'sbt'
  Write-Ok 'installed.'
}

function Ensure-Clang {
  Write-Head 'LLVM / Clang (>= 16)'
  if (Test-Cmd clang) {
    $out = (& clang --version 2>&1) -join "`n"
    $maj = if ($out -match 'clang version\s+(\d+)') { [int]$Matches[1] } else { 0 }
    if ($maj -ge 16) { Write-Ok "clang $maj present."; return }
    Write-Miss "clang $maj is older than 16; upgrading."
  }
  Write-Add 'installing LLVM/Clang...'
  Install-Pkg -WingetId 'LLVM.LLVM' -ScoopPkg 'llvm'
  Update-Path
  if (Test-Cmd clang) { Write-Ok 'installed.' }
  else { Write-Miss 'installed but not on PATH yet — open a new terminal.' }
}

function Ensure-VcBuildTools {
  Write-Head 'Visual Studio C++ Build Tools (VCTools workload)'
  $vswhere = Join-Path ${env:ProgramFiles(x86)} 'Microsoft Visual Studio\Installer\vswhere.exe'
  $wl = 'Microsoft.VisualStudio.Component.VC.Tools.x86.x64'
  if ((Test-Path $vswhere) -and (& $vswhere -products '*' -requires $wl -property installationPath 2>$null)) {
    Write-Ok 'Desktop C++ workload present.'; return
  }
  Write-Add 'installing VS 2022 Build Tools + Desktop C++ (multi-GB, slow)...'
  Install-Pkg -WingetId 'Microsoft.VisualStudio.2022.BuildTools' -WingetExtra @(
    '--override', "--quiet --wait --norestart --nocache --add $wl --includeRecommended"
  )
  Write-Ok 'installed (verify in the VS Installer if unsure).'
}

function Ensure-Git {
  Write-Head 'Git'
  if (Test-Cmd git) { Write-Ok ((& git --version 2>&1).Trim()); return }
  Write-Add 'installing Git...'
  Install-Pkg -WingetId 'Git.Git' -ScoopPkg 'git'
  Write-Ok 'installed.'
}

function Ensure-BoehmGc {
  Write-Head 'Boehm GC (bdwgc) via vcpkg  [GC.boehm links -lgc + gc.h]'
  $triplet = 'x64-windows'

  # locate or bootstrap vcpkg
  $root = $null
  if ($env:VCPKG_ROOT -and (Test-Path (Join-Path $env:VCPKG_ROOT 'vcpkg.exe'))) { $root = $env:VCPKG_ROOT }
  elseif (Test-Path (Join-Path $env:USERPROFILE 'vcpkg\vcpkg.exe')) { $root = Join-Path $env:USERPROFILE 'vcpkg' }

  if (-not $root) {
    $root = Join-Path $env:USERPROFILE 'vcpkg'
    Write-Add "bootstrapping vcpkg into $root ..."
    if (-not (Test-Path $root)) {
      & git clone --depth 1 https://github.com/microsoft/vcpkg.git $root
      if ($LASTEXITCODE -ne 0) { throw 'git clone of vcpkg failed' }
    }
    & (Join-Path $root 'bootstrap-vcpkg.bat') -disableMetrics
    if ($LASTEXITCODE -ne 0) { throw 'vcpkg bootstrap failed' }
    [Environment]::SetEnvironmentVariable('VCPKG_ROOT', $root, 'User')
    $env:VCPKG_ROOT = $root
  } else {
    Write-Info "vcpkg: $root"
  }

  $installed = (Test-Path (Join-Path $root "installed\$triplet\include\gc\gc.h")) -or
               (Test-Path (Join-Path $root "installed\$triplet\include\gc.h"))
  if ($installed) {
    Write-Ok "bdwgc already installed ($triplet)."
  } else {
    Write-Add "vcpkg install bdwgc:$triplet ..."
    & (Join-Path $root 'vcpkg.exe') install "bdwgc:$triplet"
    if ($LASTEXITCODE -ne 0) { throw "vcpkg install bdwgc:$triplet failed" }
    Write-Ok 'bdwgc installed.'
  }

  $inc = Join-Path $root "installed\$triplet\include"
  $lib = Join-Path $root "installed\$triplet\lib"
  Write-Info 'Before building, point clang at Boehm GC (this shell only):'
  Write-Host  "      `$env:C_INCLUDE_PATH = '$inc'" -ForegroundColor White
  Write-Host  "      `$env:LIBRARY_PATH   = '$lib'" -ForegroundColor White
}

# --- main --------------------------------------------------------------------
Write-Host ''
Write-Host '  godot-scala-native — Windows toolchain installer' -ForegroundColor Cyan
Write-Host '  (JDK 17 / sbt / LLVM-Clang / VC++ Build Tools / Boehm GC / Git)' -ForegroundColor DarkGray

Ensure-Jdk17
Ensure-Sbt
Ensure-Clang
Ensure-VcBuildTools
Ensure-Git
Ensure-BoehmGc

Write-Host ''
Write-Ok 'Toolchain step complete.'
