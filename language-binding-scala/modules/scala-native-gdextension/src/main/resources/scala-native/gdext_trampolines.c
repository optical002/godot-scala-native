// Addresses of the binding's per-call engine callbacks.
//
// The callbacks themselves are Scala methods marked `@exported` (see
// ClassRegistration and MethodRegistration). An exported method takes its
// arguments as plain C values, whereas a CFuncPtr built from a Scala lambda
// boxes every argument on entry -- one heap object per argument per call,
// which on `_process` is one per node per frame. Scala cannot take the
// address of an exported method, so these helpers do.
//
// Each callback declares its pointer parameters as int64_t. Pointers and
// 64-bit integers are passed in the same registers on every 64-bit target
// Godot supports, so Godot can call them through its own function types.

#include <stdint.h>

extern void gdext_scala_virtual_process(int64_t, int64_t, int64_t);
extern void gdext_scala_virtual_physics_process(int64_t, int64_t, int64_t);
extern void gdext_scala_virtual_input(int64_t, int64_t, int64_t);
extern void gdext_scala_virtual_shortcut_input(int64_t, int64_t, int64_t);
extern void gdext_scala_virtual_unhandled_input(int64_t, int64_t, int64_t);
extern void gdext_scala_virtual_unhandled_key_input(int64_t, int64_t, int64_t);
extern void gdext_scala_method_call(int64_t, int64_t, int64_t, int64_t,
                                    int64_t, int64_t);

void *gdext_addr_virtual_process(void) {
    return (void *)&gdext_scala_virtual_process;
}
void *gdext_addr_virtual_physics_process(void) {
    return (void *)&gdext_scala_virtual_physics_process;
}
void *gdext_addr_virtual_input(void) {
    return (void *)&gdext_scala_virtual_input;
}
void *gdext_addr_virtual_shortcut_input(void) {
    return (void *)&gdext_scala_virtual_shortcut_input;
}
void *gdext_addr_virtual_unhandled_input(void) {
    return (void *)&gdext_scala_virtual_unhandled_input;
}
void *gdext_addr_virtual_unhandled_key_input(void) {
    return (void *)&gdext_scala_virtual_unhandled_key_input;
}
void *gdext_addr_method_call(void) {
    return (void *)&gdext_scala_method_call;
}
