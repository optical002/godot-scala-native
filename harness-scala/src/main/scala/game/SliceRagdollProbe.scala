package game

import scala.collection.mutable

import gdext.annotations.*
import gdext.api.*
import gdext.builtin.*
import gdext.classes.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/** Exercises the packed-array, mesh-array and ragdoll-simulation additions from
  * `slice_ragdoll_verify.gd`. Each `@func` returns "" on success or the failure
  * list, so the driving script can print a verdict per step.
  */
final class SliceRagdollProbe(
  var subsetNames: String = "",
  var cycles: Long = 1L,
  var boneToFree: String = ""
) extends Node3D {

  private val capturedPoses = mutable.ArrayBuffer.empty[Transform3D]

  @func def testPackedArrays(): String = run { c =>
    floatArrays(c)
    intArrays(c)
    vector3Arrays(c)
    largeArrays(c)
    allocStress(c)
    variantRoundTrip(c)
    enginePropertyRoundTrip(c)
  }

  @func def testArrayOps(): String = run { c =>
    val a = GArray.allocate()
    c.eq("empty size", a.size, 0)
    a.pushBack(7L)
    a.pushBack("text")
    a.pushBack("spine")
    a.pushBack(Vector3(1f, 2f, 3f))
    c.eq("size after push", a.size, 4)
    c.eq("int type", a.variantTypeAt(0), GDEXTENSION_VARIANT_TYPE_INT)
    c.eq("string type", a.variantTypeAt(1), GDEXTENSION_VARIANT_TYPE_STRING)
    c.eq("second string type", a.variantTypeAt(2), GDEXTENSION_VARIANT_TYPE_STRING)
    c.eq("vector3 type", a.variantTypeAt(3), GDEXTENSION_VARIANT_TYPE_VECTOR3)
    c.check("nothing nil", !(0 until 4).exists(a.isNilAt))
    a.set(0, 42L)
    c.eq("set then get", a.get[Long](0), 42L)
    a.set(0, "replaced")
    c.eq(
      "set changes type",
      a.variantTypeAt(0),
      GDEXTENSION_VARIANT_TYPE_STRING
    )
    c.eq("get string", a.get[String](0), "replaced")
    c.eq("get vector3", a.get[Vector3](3), Vector3(1f, 2f, 3f))
    c.throws[IndexOutOfBoundsException]("get -1")(a.get[Long](-1))
    c.throws[IndexOutOfBoundsException]("get size")(a.get[Long](4))
    c.throws[IndexOutOfBoundsException]("set size")(a.set(4, 1L))
    c.throws[IndexOutOfBoundsException]("type -1")(a.variantTypeAt(-1))
    a.free()

    var i = 0
    while (i < 2000) {
      val s = GArray.allocate()
      s.pushBack(i.toLong)
      s.pushBack("bone")
      s.set(0, (i * 2).toLong)
      if (s.get[Long](0) != i * 2L)
        c.fail(s"stress iteration $i read back wrong value")
      s.free()
      i += 1
    }
  }

  @func def testMeshArrays(): String = run { c =>
    val box = Gd.create[BoxMesh]()
    val arrays = box.surfaceGetArrays(0)
    c.eq("arrays size", arrays.size, MeshArray.Max)
    c.check("vertex present", !arrays.isNilAt(MeshArray.Vertex))
    c.check("index present", !arrays.isNilAt(MeshArray.Index))
    c.check("no bones", arrays.isNilAt(MeshArray.Bones))
    c.check("no custom0", arrays.isNilAt(MeshArray.Custom0))
    val vertices = arrays.get[PackedVector3Array](MeshArray.Vertex)
    val n = vertices.size
    c.check("box has vertices", n > 0)
    c.check(
      "box vertices within bounds",
      vertices.iterator.forall(v =>
        math.abs(v.x) <= 0.5001f && math.abs(v.y) <= 0.5001f && math.abs(
          v.z
        ) <= 0.5001f
      )
    )
    vertices.free()

    val outOfRange = box.surfaceGetArrays(1)
    c.eq("out-of-range surface is empty", outOfRange.size, 0)
    outOfRange.free()
    val negative = box.surfaceGetArrays(-1)
    c.eq("negative surface is empty", negative.size, 0)
    negative.free()

    val plain = Gd.create[ArrayMesh]()
    plain.addSurfaceFromArrays(MeshArray.PrimitiveTriangles, arrays, 0L)
    c.eq("plain surface count", plain.getSurfaceCount(), 1L)
    c.eq("plain vertex count", plain.surfaceGetArrayLen(0), n.toLong)
    c.check(
      "plain has no custom0",
      (plain.surfaceGetFormat(0).value & FormatCustom0) == 0L
    )

    val custom = PackedFloat32Array.ofSize(n)
    (0 until n).foreach(i => custom(i) = i * 0.25f - 3f)
    arrays.set(MeshArray.Custom0, custom)
    val withCustom = Gd.create[ArrayMesh]()
    withCustom.addSurfaceFromArrays(
      MeshArray.PrimitiveTriangles,
      arrays,
      custom0Flags
    )
    val format = withCustom.surfaceGetFormat(0).value
    c.check("custom0 format bit", (format & FormatCustom0) != 0L)
    c.eq(
      "custom0 is R_FLOAT",
      (format >> MeshArray.FormatCustom0Shift) & 7L,
      MeshArray.CustomRFloat
    )
    val back = withCustom.surfaceGetArrays(0)
    val readCustom = back.get[PackedFloat32Array](MeshArray.Custom0)
    c.eq("custom0 length", readCustom.size, n)
    c.check(
      "custom0 values",
      (0 until n).forall(i => readCustom(i) == i * 0.25f - 3f)
    )
    readCustom.free()
    back.free()
    custom.free()

    val short = GArray.allocate()
    short.pushBack(1L)
    c.throws[IllegalArgumentException]("wrong arrays size")(
      Gd.create[ArrayMesh]()
        .addSurfaceFromArrays(MeshArray.PrimitiveTriangles, short, 0L)
    )
    short.free()

    var i = 0
    while (i < 300) {
      val a = box.surfaceGetArrays(0)
      val f = PackedFloat32Array.ofSize(n)
      a.set(MeshArray.Custom0, f)
      val m = Gd.create[ArrayMesh]()
      m.addSurfaceFromArrays(MeshArray.PrimitiveTriangles, a, custom0Flags)
      if (m.getSurfaceCount() != 1L)
        c.fail(s"stress iteration $i lost its surface")
      f.free()
      a.free()
      i += 1
    }
    arrays.free()
  }

  @func def testMath(): String = run { c =>
    val skel = skeleton
    val parent = skel.getBoneGlobalPose(1)
    val child = skel.getBoneGlobalPose(2)
    c.check("compose matches engine", closeT(parent * skel.getBonePose(2), child))
    c.check("inverse round trip", closeT(child * child.affineInverse, Transform3D.identity))
    val p = Vector3(0.3f, -1.2f, 2.5f)
    c.check("xform matches to_global", close(skel.getGlobalTransform().xform(p), skel.toGlobal(p)))
    c.check("inverse matches to_local", close(skel.getGlobalTransform().affineInverse.xform(p), skel.toLocal(p)))
  }

  @func def testNullObject(): String = run { c =>
    val nullMesh = Gd.wrap[ArrayMesh](gdext.internal.engine.GodotObject.fromPtr(null))
    val nullSim =
      Gd.wrap[PhysicalBoneSimulator3D](gdext.internal.engine.GodotObject.fromPtr(null))
    c.throws[NullPointerException]("surfaceGetArrays on null")(nullMesh.surfaceGetArrays(0))
    val arrays = Gd.create[BoxMesh]().surfaceGetArrays(0)
    c.throws[NullPointerException]("addSurfaceFromArrays on null")(
      nullMesh.addSurfaceFromArrays(MeshArray.PrimitiveTriangles, arrays, 0L)
    )
    arrays.free()
    c.throws[NullPointerException]("start simulation on null")(nullSim.physicalBonesStartSimulation())
  }

  @func def testSkinnedCustom0(): String = run { c =>
    val skel = skeleton
    val body = node[MeshInstance3D]("Body")
    val mesh = body.getMesh().cast[ArrayMesh]
    val format = mesh.surfaceGetFormat(0).value
    c.check("source has bones", (format & FormatBones) != 0L)
    c.check("source has weights", (format & FormatWeights) != 0L)

    val rest = cpuSkinned(body, skel)
    val n = rest.size
    c.eq("vertex count", n.toLong, mesh.surfaceGetArrayLen(0))
    c.check("rest pose leaves vertices in place", (0 until n).forall(i => close(rest(i), restVertex(body, i))))

    val quarterTurnZ = Quaternion(0f, 0f, math.sin(math.Pi / 4).toFloat, math.cos(math.Pi / 4).toFloat)
    skel.setBonePoseRotation(1, quarterTurnZ)
    val posed = cpuSkinned(body, skel)
    val expected = (0 until n).map { i =>
      val v = restVertex(body, i)
      if (v.y < SpineStart - 1e-4f) v
      else {
        val local = v - Vector3(0f, SpineStart, 0f)
        Vector3(-local.y, SpineStart + local.x, local.z)
      }
    }
    c.check("cpu skinning matches the analytic pose", (0 until n).forall(i => close(posed(i), expected(i))))

    val distances = PackedFloat32Array.ofSize(n)
    (0 until n).foreach(i => distances(i) = posed(i).y - PlaneHeight)
    c.check("plane splits the mesh", posed.exists(_.y > PlaneHeight) && posed.exists(_.y < PlaneHeight))

    val arrays = mesh.surfaceGetArrays(0)
    c.check("bones slot present", !arrays.isNilAt(MeshArray.Bones))
    c.check("weights slot present", !arrays.isNilAt(MeshArray.Weights))
    val bonesBefore = arrays.get[PackedInt32Array](MeshArray.Bones)
    val weightsBefore = arrays.get[PackedFloat32Array](MeshArray.Weights)
    arrays.set(MeshArray.Custom0, distances)
    val sliced = Gd.create[ArrayMesh]()
    sliced.addSurfaceFromArrays(
      MeshArray.PrimitiveTriangles,
      arrays,
      custom0Flags | (format & MeshArray.FlagUse8BoneWeights)
    )
    arrays.free()
    body.setMesh(sliced)

    val slicedFormat = sliced.surfaceGetFormat(0).value
    c.check("sliced keeps bones", (slicedFormat & FormatBones) != 0L)
    c.check("sliced keeps weights", (slicedFormat & FormatWeights) != 0L)
    c.check("sliced has custom0", (slicedFormat & FormatCustom0) != 0L)
    val after = sliced.surfaceGetArrays(0)
    val bonesAfter = after.get[PackedInt32Array](MeshArray.Bones)
    val weightsAfter = after.get[PackedFloat32Array](MeshArray.Weights)
    c.eq("bone indices survive", bonesAfter.toSeq, bonesBefore.toSeq)
    c.check(
      "bone weights survive",
      weightsAfter.size == weightsBefore.size &&
        (0 until weightsAfter.size).forall(i => math.abs(weightsAfter(i) - weightsBefore(i)) < 1e-3f)
    )
    Seq(bonesBefore, weightsBefore, bonesAfter, weightsAfter).foreach(_.free())
    after.free()

    val reposed = cpuSkinned(body, skel)
    c.check("skinning survives the rebuild", (0 until n).forall(i => close(reposed(i), posed(i))))
    skel.resetBonePoses()

    val back = sliced.surfaceGetArrays(0)
    val readDistances = back.get[PackedFloat32Array](MeshArray.Custom0)
    c.check(
      "distances survive",
      (0 until n).forall(i => readDistances(i) == distances(i))
    )
    readDistances.free()
    back.free()
    distances.free()

    val shader = Gd.create[Shader]()
    shader.setCode(ClipShaderCode)
    val material = Gd.create[ShaderMaterial]()
    material.setShader(shader)
    material.set(
      "shader_parameter/cut_color",
      Color(0.6f, 0.05f, 0.05f, 1f)
    )
    c.eq(
      "shader parameter round trip",
      material.getAs[Color]("shader_parameter/cut_color"),
      Color(0.6f, 0.05f, 0.05f, 1f)
    )
    body.setSurfaceOverrideMaterial(0, material)
    body.set("instance_shader_parameters/side", -1.0)
    c.eq(
      "instance uniform round trip",
      body.getAs[Double]("instance_shader_parameters/side"),
      -1.0
    )
  }

  @func def testStartAll(): String = run { c =>
    val sim = simulator
    sim.setActive(true)
    sim.physicalBonesStartSimulation()
    c.check("simulating", sim.isSimulatingPhysics())
    c.check(
      "every bone simulating",
      physicalBones.forall(_.isSimulatingPhysics())
    )
  }

  @func def testStop(): String = run { c =>
    val sim = simulator
    sim.physicalBonesStopSimulation()
    c.check("stopped", !sim.isSimulatingPhysics())
    c.check(
      "no bone simulating",
      !physicalBones.exists(_.isSimulatingPhysics())
    )
  }

  @func def testStartSubset(): String = run { c =>
    val wanted = subsetNames.split(",").map(_.trim).filter(_.nonEmpty).toSeq
    val sim = simulator
    sim.setActive(true)
    sim.physicalBonesStartSimulation(wanted)
    physicalBones.foreach { b =>
      val name = b.getAs[String]("bone_name")
      c.eq(
        s"bone $name simulating",
        b.isSimulatingPhysics(),
        wanted.contains(name)
      )
    }
  }

  @func def testUnknownBoneSubset(): String = run { c =>
    val sim = simulator
    sim.physicalBonesStartSimulation(Seq("no_such_bone", ""))
    c.check("unknown names still report simulating", sim.isSimulatingPhysics())
    sim.physicalBonesStopSimulation()
    c.check("stopped after unknown names", !sim.isSimulatingPhysics())
  }

  @func def testStartStopCycles(): String = run { c =>
    val sim = simulator
    var i = 0L
    while (i < cycles) {
      sim.physicalBonesStartSimulation()
      if (!sim.isSimulatingPhysics()) c.fail(s"cycle $i did not start")
      sim.physicalBonesStopSimulation()
      if (sim.isSimulatingPhysics()) c.fail(s"cycle $i did not stop")
      i += 1
    }
  }

  @func def testImpulse(): String = run { c =>
    physicalBones.foreach { b =>
      b.applyCentralImpulse(Vector3(0f, 0f, 0.5f))
      b.applyImpulse(Vector3(0.2f, 0f, 0f), Vector3(0f, 0.1f, 0f))
      b.setLinearVelocity(b.getLinearVelocity() + Vector3(0f, 0f, 0.1f))
    }
    c.check("still simulating", simulator.isSimulatingPhysics())
  }

  @func def freeBone(): String = run { c =>
    val name = boneToFree
    physicalBones.find(_.getAs[String]("bone_name") == name) match {
      case Some(b) =>
        simulator.removeChild(b)
        b.queueFree()
      case None => c.fail(s"no physical bone named $name")
    }
  }

  @func def setDormant(): String = run { c =>
    val sim = simulator
    sim.setActive(false)
    sim.setProcessMode(Node.ProcessMode.Disabled)
    physicalBones.foreach { b =>
      b.setCollisionLayer(0L)
      b.setCollisionMask(0L)
    }
    c.eq("disabled", sim.getProcessMode(), 4L)
  }

  @func def wake(): String = run { c =>
    val sim = simulator
    sim.setProcessMode(Node.ProcessMode.Inherit)
    val skel = skeleton
    val skelGlobal = skel.getGlobalTransform()
    physicalBones.foreach { b =>
      b.setCollisionLayer(1L)
      b.setCollisionMask(1L)
      b.setGlobalTransform(skelGlobal * skel.getBoneGlobalPose(b.getBoneId()) * b.getBodyOffset())
    }
    c.eq("enabled", sim.getProcessMode(), 0L)
  }

  @func def physicalBoneCount(): Long = physicalBones.size.toLong

  @func def testPosesFinite(): String = run { c =>
    val skel = skeleton
    (0L until skel.getBoneCount()).foreach { i =>
      val o = skel.getBoneGlobalPose(i).origin
      c.check(s"bone $i finite", finite(o.x) && finite(o.y) && finite(o.z))
      c.check(
        s"bone $i sane",
        math.abs(o.x) < 100f && math.abs(o.y) < 100f && math.abs(o.z) < 100f
      )
    }
  }

  @func def armPoseCapture(): String = run { c =>
    val sim = simulator
    if (!captureConnected) {
      val err = sim.connect(
        "modification_processed",
        () => if (captureRequested) captureLivePoses()
      )
      c.eq("connect modification_processed", err, 0L)
      captureConnected = true
    }
    capturedPoses.clear()
    captureRequested = true
  }

  @func def capturedPoseCount(): Long = capturedPoses.size.toLong

  @func def freezeCapturedPose(): String = run { c =>
    val skel = skeleton
    c.eq("captured every bone", capturedPoses.size.toLong, skel.getBoneCount())
    val sim = simulator
    sim.physicalBonesStopSimulation()
    sim.setActive(false)
    capturedPoses.zipWithIndex.foreach((pose, i) => skel.setBonePose(i.toLong, pose))
    c.check("stopped after freeze", !sim.isSimulatingPhysics())
  }

  @func def testPoseRetained(): String = run { c =>
    val skel = skeleton
    capturedPoses.zipWithIndex.foreach { (pose, i) =>
      c.check(s"bone $i kept its frozen pose", closeT(skel.getBonePose(i.toLong), pose))
    }
  }

  @func def frozenHeadHeight(): Double = {
    val skel = skeleton
    skel.getGlobalTransform().xform(skel.getBoneGlobalPose(skel.findBone("head")).origin).y.toDouble
  }

  private var captureConnected = false
  private var captureRequested = false

  private def captureLivePoses(): Unit = {
    val skel = skeleton
    capturedPoses.clear()
    (0L until skel.getBoneCount()).foreach(i => capturedPoses += skel.getBonePose(i))
    captureRequested = false
  }

  private val PlaneHeight = 0.4f
  private val SpineStart = 0.6f
  private val FormatCustom0 = 64L
  private val FormatBones = 1L << 10
  private val FormatWeights = 1L << 11
  private val custom0Flags =
    MeshArray.CustomRFloat << MeshArray.FormatCustom0Shift

  private val ClipShaderCode =
    """shader_type spatial;
      |render_mode cull_disabled;
      |uniform vec4 cut_color : source_color = vec4(0.6, 0.05, 0.05, 1.0);
      |instance uniform float side = 1.0;
      |varying float dist;
      |void vertex() { dist = CUSTOM0.r * side; }
      |void fragment() {
      |  if (dist < 0.0) { discard; }
      |  ALBEDO = FRONT_FACING ? vec3(0.8) : cut_color.rgb;
      |}
      |""".stripMargin

  private def cpuSkinned(body: MeshInstance3D, skel: Skeleton3D): Vector[Vector3] = {
    val mesh = body.getMesh().cast[ArrayMesh]
    val skin = body.getSkin()
    val binds = (0L until skin.getBindCount()).map { b =>
      val direct = skin.getBindBone(b)
      val bone =
        if (direct >= 0) direct
        else skel.findBone(skin.getBindName(b))
      skel.getBoneGlobalPose(bone) * skin.getBindPose(b)
    }
    val arrays = mesh.surfaceGetArrays(0)
    val vertices = arrays.get[PackedVector3Array](MeshArray.Vertex)
    val bones = arrays.get[PackedInt32Array](MeshArray.Bones)
    val weights = arrays.get[PackedFloat32Array](MeshArray.Weights)
    val perVertex = bones.size / vertices.size
    val out = (0 until vertices.size).map { i =>
      val v = vertices(i)
      (0 until perVertex).foldLeft(Vector3.zero) { (acc, k) =>
        val w = weights(i * perVertex + k)
        if (w <= 0f) acc else acc + binds(bones(i * perVertex + k)).xform(v) * w
      }
    }.toVector
    Seq(vertices, bones, weights).foreach(_.free())
    arrays.free()
    out
  }

  private def restVertex(body: MeshInstance3D, i: Int): Vector3 = {
    val arrays = body.getMesh().cast[ArrayMesh].surfaceGetArrays(0)
    val vertices = arrays.get[PackedVector3Array](MeshArray.Vertex)
    val v = vertices(i)
    vertices.free()
    arrays.free()
    v
  }

  private def floatArrays(c: Checks): Unit = {
    val a = PackedFloat32Array.empty()
    c.eq("f32 empty", a.size, 0)
    c.check("f32 isEmpty", a.isEmpty)
    a.resize(5)
    c.check("f32 zero filled", a.iterator.forall(_ == 0f))
    (0 until 5).foreach(i => a(i) = i * 1.5f)
    c.eq("f32 values", a.toSeq, Seq(0f, 1.5f, 3f, 4.5f, 6f))
    a.resize(8)
    c.eq("f32 grow keeps prefix", a.toSeq.take(5), Seq(0f, 1.5f, 3f, 4.5f, 6f))
    c.eq("f32 grow zero fills", a.toSeq.drop(5), Seq(0f, 0f, 0f))
    a.resize(2)
    c.eq("f32 shrink", a.toSeq, Seq(0f, 1.5f))
    a(1) = Float.NaN
    c.check("f32 NaN stored", a(1).isNaN)
    a(1) = Float.MaxValue
    c.eq("f32 max stored", a(1), Float.MaxValue)
    c.throws[IndexOutOfBoundsException]("f32 get -1")(a(-1))
    c.throws[IndexOutOfBoundsException]("f32 get size")(a(2))
    c.throws[IndexOutOfBoundsException]("f32 set size")(a(2) = 1f)
    c.throws[IllegalArgumentException]("f32 negative resize")(a.resize(-1))
    a.resize(0)
    c.throws[IndexOutOfBoundsException]("f32 get on empty")(a(0))
    a.free()
    c.throws[IllegalStateException]("f32 size after free")(a.size)
    c.throws[IllegalStateException]("f32 get after free")(a(0))
    a.free()
  }

  private def intArrays(c: Checks): Unit = {
    val a = PackedInt32Array.ofSize(4)
    a(0) = Int.MinValue
    a(1) = -1
    a(2) = 0
    a(3) = Int.MaxValue
    c.eq("i32 extremes", a.toSeq, Seq(Int.MinValue, -1, 0, Int.MaxValue))
    c.throws[IndexOutOfBoundsException]("i32 get size")(a(4))
    a.free()
    c.throws[IllegalStateException]("i32 resize after free")(a.resize(1))
  }

  private def vector3Arrays(c: Checks): Unit = {
    val a = PackedVector3Array.ofSize(3)
    c.check("v3 zero filled", a.iterator.forall(_ == Vector3.zero))
    a(0) = Vector3(1f, 2f, 3f)
    a(2) = Vector3(-4f, 5.5f, -6.25f)
    c.eq(
      "v3 values",
      a.toSeq,
      Seq(Vector3(1f, 2f, 3f), Vector3.zero, Vector3(-4f, 5.5f, -6.25f))
    )
    a.resize(1)
    c.eq("v3 shrink", a.toSeq, Seq(Vector3(1f, 2f, 3f)))
    c.throws[IndexOutOfBoundsException]("v3 get size")(a(1))
    a.free()
  }

  private def largeArrays(c: Checks): Unit = {
    val n = 200000
    val f = PackedFloat32Array.ofSize(n)
    val v = PackedVector3Array.ofSize(n)
    var i = 0
    while (i < n) {
      f(i) = i.toFloat
      v(i) = Vector3(i.toFloat, -i.toFloat, 1f)
      i += 1
    }
    c.eq("large f32 last", f(n - 1), (n - 1).toFloat)
    c.eq(
      "large v3 last",
      v(n - 1),
      Vector3((n - 1).toFloat, -(n - 1).toFloat, 1f)
    )
    c.eq(
      "large v3 mid",
      v(n / 2),
      Vector3((n / 2).toFloat, -(n / 2).toFloat, 1f)
    )
    f.free()
    v.free()
  }

  private def allocStress(c: Checks): Unit = {
    var i = 0
    while (i < 3000) {
      val f = PackedFloat32Array.ofSize(64)
      val v = PackedVector3Array.ofSize(64)
      val n = PackedInt32Array.ofSize(64)
      f(63) = i.toFloat
      v(63) = Vector3(i.toFloat, 0f, 0f)
      n(63) = i
      if (f(63) != i.toFloat || v(63).x != i.toFloat || n(63) != i)
        c.fail(s"alloc stress iteration $i read back wrong value")
      f.free()
      v.free()
      n.free()
      i += 1
    }
  }

  private def variantRoundTrip(c: Checks): Unit = {
    val holder = GArray.allocate()
    val f = PackedFloat32Array.ofSize(3)
    f(0) = 1f; f(1) = 2f; f(2) = 3f
    holder.pushBack(f)
    val copy = holder.get[PackedFloat32Array](0)
    c.eq("variant copy", copy.toSeq, Seq(1f, 2f, 3f))
    copy(0) = 99f
    val again = holder.get[PackedFloat32Array](0)
    c.eq("copy-on-write isolates the array slot", again(0), 1f)
    c.eq("original unaffected by copy", f(0), 1f)
    c.throws[ClassCastException]("wrong packed type")(
      holder.get[PackedVector3Array](0)
    )
    holder.pushBack(3L)
    c.throws[ClassCastException]("int is not a packed array")(
      holder.get[PackedInt32Array](1)
    )
    val v = PackedVector3Array.ofSize(2)
    v(1) = Vector3(0f, 1f, 0f)
    holder.set(1, v)
    c.eq(
      "set packed into slot",
      holder.variantTypeAt(1),
      GDEXTENSION_VARIANT_TYPE_PACKED_VECTOR3_ARRAY
    )
    val vBack = holder.get[PackedVector3Array](1)
    c.eq("v3 round trip", vBack(1), Vector3(0f, 1f, 0f))
    Seq(f, copy, again, v, vBack).foreach(_.free())
    holder.free()
  }

  private def enginePropertyRoundTrip(c: Checks): Unit = {
    val shape = Gd.create[ConvexPolygonShape3D]()
    val points = PackedVector3Array.ofSize(4)
    points(0) = Vector3(0f, 0f, 0f)
    points(1) = Vector3(1f, 0f, 0f)
    points(2) = Vector3(0f, 1f, 0f)
    points(3) = Vector3(0f, 0f, 1f)
    shape.set("points", points)
    val back = shape.getAs[PackedVector3Array]("points")
    c.eq("engine property point count", back.size, 4)
    c.check(
      "engine property holds the points",
      points.toSeq.forall(back.toSeq.contains)
    )
    points.free()
    back.free()
  }

  private def skeleton: Skeleton3D = node[Skeleton3D]("Skel")
  private def simulator: PhysicalBoneSimulator3D =
    node[PhysicalBoneSimulator3D]("Sim")

  private def physicalBones: Seq[PhysicalBone3D] = {
    val sim = simulator
    (0L until sim.getChildCount(false)).flatMap { i =>
      val child = sim.getChild(i, false)
      Option(child.cast[PhysicalBone3D])
    }
  }

  private def node[T <: Node](
    name: String
  )(using gdext.internal.engine.ClassMeta[T]): T = {
    val found = findChild(name, true, false)
    if (found == null)
      throw new IllegalStateException(s"scene is missing node '$name'")
    found.cast[T]
  }

  private def close(a: Vector3, b: Vector3): Boolean =
    math.abs(a.x - b.x) < 1e-3f && math.abs(a.y - b.y) < 1e-3f && math.abs(
      a.z - b.z
    ) < 1e-3f

  private def closeT(a: Transform3D, b: Transform3D): Boolean =
    close(a.origin, b.origin) && close(a.basis.x, b.basis.x) &&
      close(a.basis.y, b.basis.y) && close(a.basis.z, b.basis.z)

  private def finite(f: Float): Boolean = !f.isNaN && !f.isInfinite

  private def run(body: Checks => Unit): String = {
    val c = new Checks
    // Every RefCounted reference a step adopts (meshes, materials, shapes,
    // engine Ref<T> returns) is released when the step ends.
    try Gd.scoped(body(c))
    catch {
      case t: Throwable =>
        c.fail(s"unexpected ${t.getClass.getSimpleName}: ${t.getMessage}")
    }
    c.failures.mkString("; ")
  }

  final private class Checks {
    val failures = mutable.ArrayBuffer.empty[String]
    def fail(msg: String): Unit = failures += msg
    def check(label: String, ok: Boolean): Unit = if (!ok) fail(label)
    def eq[A](label: String, actual: A, expected: A): Unit =
      if (actual != expected) fail(s"$label: expected $expected, got $actual")
    def throws[E <: Throwable](
      label: String
    )(body: => Any)(using ct: scala.reflect.ClassTag[E]): Unit =
      try {
        body
        fail(
          s"$label: expected ${ct.runtimeClass.getSimpleName}, nothing thrown"
        )
      } catch {
        case e if ct.runtimeClass.isInstance(e) => ()
        case e: Throwable                       =>
          fail(s"$label: expected ${ct.runtimeClass.getSimpleName}, got $e")
      }
  }
}
