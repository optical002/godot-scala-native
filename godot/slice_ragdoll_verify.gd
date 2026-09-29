extends SceneTree

# Headless verification of the packed-array, mesh-array and ragdoll additions.
# Builds a three-bone skinned column with a physical skeleton over a floor, then
# drives SliceRagdollProbe (Scala) through each step, stepping physics between
# them. Prints "SLICE RAGDOLL VERIFY: PASS" only if every step passed.

const BONES := ["root", "spine", "head"]
const SEGMENT := 0.6

var _probe: Node3D
var _skel: Skeleton3D
var _failures := 0


func _initialize() -> void:
	_run.call_deferred()


func _run() -> void:
	if not ClassDB.class_exists("SliceRagdollProbe"):
		print("FAIL: SliceRagdollProbe is not registered")
		print("SLICE RAGDOLL VERIFY: FAIL")
		quit(1)
		return

	print("physics engine: %s" % ProjectSettings.get_setting("physics/3d/physics_engine"))
	_build_scene()
	await _frames(2)

	_step("packed arrays", _probe.test_packed_arrays())
	_step("garray", _probe.test_array_ops())
	_step("mesh arrays", _probe.test_mesh_arrays())
	_step("transform math", _probe.test_math())
	_step("null object guard", _probe.test_null_object())
	_step("skinned custom0", _probe.test_skinned_custom0())

	_step("unknown bone subset", _probe.test_unknown_bone_subset())
	_step("start/stop cycles", _with("cycles", 50).test_start_stop_cycles())
	_step("subset spine,head", _with("subset_names", "spine,head").test_start_subset())
	await _physics(10)
	_step("stop after subset", _probe.test_stop())

	_step("dormant", _probe.set_dormant())
	await _physics(10)
	_step("wake", _probe.wake())
	var head_body: PhysicalBone3D = _skel.get_node("Sim/PB_head")
	var head_before := head_body.global_position.y
	_step("start all", _probe.test_start_all())
	_step("impulse", _probe.test_impulse())
	await _physics(90)
	var head_after := head_body.global_position.y
	_check("ragdoll fell (head body %.3f -> %.3f)" % [head_before, head_after], head_after < head_before - 0.2)
	_check("bone pose reads the animation pose, not the ragdoll", absf(_bone_global_y("head") - 2.2) < 0.01)
	_step("poses finite after fall", _probe.test_poses_finite())

	_step("arm pose capture", _probe.arm_pose_capture())
	await _frames(3)
	_check("pose captured from modification_processed", _probe.captured_pose_count() == BONES.size())
	_step("freeze captured pose", _probe.freeze_captured_pose())
	var frozen_y: float = _probe.frozen_head_height()
	_check("frozen head sits at the fallen height (%.3f)" % frozen_y, absf(frozen_y - head_after) < 0.35)
	await _physics(30)
	await _frames(5)
	_step("pose retained after freeze", _probe.test_pose_retained())
	_check("frozen head still fallen after frames (%.3f)" % _probe.frozen_head_height(), _probe.frozen_head_height() < head_before - 0.2)

	_skel.reset_bone_poses()
	_step("dormant again", _probe.set_dormant())
	await _physics(5)
	_step("wake again", _probe.wake())
	_step("remove head bone", _with("bone_to_free", "head").free_bone())
	_check("head bone removed immediately", _probe.physical_bone_count() == 2)
	_step("start in the same frame as the removal", _probe.test_start_all())
	await _physics(60)
	_step("poses finite without head bone", _probe.test_poses_finite())
	_step("stop without head bone", _probe.test_stop())

	for i in 20:
		_probe.test_start_all()
		await _physics(1)
		_probe.test_stop()
	_step("poses finite after rapid restarts", _probe.test_poses_finite())

	print("SLICE RAGDOLL VERIFY: %s" % ("PASS" if _failures == 0 else "FAIL (%d)" % _failures))
	quit(0 if _failures == 0 else 1)


func _with(property: String, value: Variant) -> Node3D:
	_probe.set(property, value)
	return _probe


func _step(label: String, result: String) -> void:
	_check(label + ("" if result.is_empty() else ": " + result), result.is_empty())


func _check(label: String, ok: bool) -> void:
	if ok:
		print("ok   " + label)
	else:
		_failures += 1
		print("FAIL " + label)


func _frames(n: int) -> void:
	for i in n:
		await process_frame


func _physics(n: int) -> void:
	for i in n:
		await physics_frame


func _bone_global_y(name: String) -> float:
	var idx := _skel.find_bone(name)
	return (_skel.global_transform * _skel.get_bone_global_pose(idx)).origin.y


func _build_scene() -> void:
	_probe = ClassDB.instantiate("SliceRagdollProbe")
	root.add_child(_probe)

	var floor_body := StaticBody3D.new()
	var floor_shape := CollisionShape3D.new()
	var box := BoxShape3D.new()
	box.size = Vector3(20, 1, 20)
	floor_shape.shape = box
	floor_body.add_child(floor_shape)
	floor_body.position = Vector3(0, -0.5, 0)
	_probe.add_child(floor_body)

	_skel = Skeleton3D.new()
	_skel.name = "Skel"
	_skel.position = Vector3(0, 1.0, 0)
	for i in BONES.size():
		_skel.add_bone(BONES[i])
		if i > 0:
			_skel.set_bone_parent(i, i - 1)
			_skel.set_bone_rest(i, Transform3D(Basis(), Vector3(0, SEGMENT, 0)))
		else:
			_skel.set_bone_rest(i, Transform3D())
	_skel.reset_bone_poses()
	_probe.add_child(_skel)

	var body := MeshInstance3D.new()
	body.name = "Body"
	body.mesh = _column_mesh()
	_skel.add_child(body)
	body.skeleton = NodePath("..")
	body.skin = _skel.create_skin_from_rest_transforms()

	var sim := PhysicalBoneSimulator3D.new()
	sim.name = "Sim"
	sim.active = false
	_skel.add_child(sim)
	for i in BONES.size():
		var pb := PhysicalBone3D.new()
		pb.name = "PB_" + BONES[i]
		pb.bone_name = BONES[i]
		pb.joint_type = PhysicalBone3D.JOINT_TYPE_NONE if i == 0 else PhysicalBone3D.JOINT_TYPE_CONE
		pb.can_sleep = true
		pb.angular_damp = 2.0
		var shape := CollisionShape3D.new()
		var capsule := CapsuleShape3D.new()
		capsule.radius = 0.12
		capsule.height = SEGMENT * 0.8
		shape.shape = capsule
		shape.position = Vector3(0, SEGMENT * 0.5, 0)
		pb.add_child(shape)
		sim.add_child(pb)
		pb.global_transform = _skel.global_transform * _skel.get_bone_global_pose(i)


func _column_mesh() -> ArrayMesh:
	var st := SurfaceTool.new()
	st.begin(Mesh.PRIMITIVE_TRIANGLES)
	var rings := 7
	var h := 0.1
	var ring_step := SEGMENT * BONES.size() / (rings - 1)
	var corners := [Vector3(-h, 0, -h), Vector3(h, 0, -h), Vector3(h, 0, h), Vector3(-h, 0, h)]
	for r in rings:
		var y := r * ring_step
		var bone := mini(int(y / SEGMENT), BONES.size() - 1)
		for c in corners:
			st.set_bones(PackedInt32Array([bone, 0, 0, 0]))
			st.set_weights(PackedFloat32Array([1.0, 0.0, 0.0, 0.0]))
			st.set_uv(Vector2(0, float(r) / (rings - 1)))
			st.add_vertex(c + Vector3(0, y, 0))
	for r in rings - 1:
		for c in 4:
			var a := r * 4 + c
			var b := r * 4 + (c + 1) % 4
			var a2 := a + 4
			var b2 := b + 4
			st.add_index(a); st.add_index(b); st.add_index(a2)
			st.add_index(b); st.add_index(b2); st.add_index(a2)
	st.generate_normals()
	return st.commit()
