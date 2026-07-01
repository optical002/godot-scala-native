// Binding-side C glue for making Scala-Native GC allocation safe on threads
// the engine (Godot) created — i.e. threads Scala Native never registered as
// GC "mutator" threads.
//
// WHY THIS EXISTS
// ---------------
// Referencing java.lang.Thread anywhere in the program flips Scala Native into
// multithreaded mode. In that mode the commix (and immix) GC keeps per-thread
// allocation state in a thread-local `currentMutatorThread`, set only for the
// main thread (at GC init) and for threads SN itself creates (via
// scalanative_GC_pthread_create). When Godot invokes one of our class callbacks
// (create/free instance, a property getter/setter, a virtual) from one of ITS
// OWN threads — e.g. the editor's resource-import / inspector workers — that
// thread's `currentMutatorThread` is NULL, so the very first allocation
// (`scalanative_GC_alloc_small` -> `Allocator_Alloc` -> currentMutatorThread->
// allocator) dereferences NULL and SIGSEGVs.
//
// SN 0.5 exposes no public API to register an ALREADY-EXISTING foreign thread.
// But the commix/immix GC functions that do it (`MutatorThread_init` /
// `MutatorThread_delete`) and the `currentMutatorThread` thread-local have
// external linkage within the same shared object, so we declare them here and
// wrap them. This file is compiled INTO the binding's .so (not a fork of Scala
// Native), so the references resolve at link time.

#if defined(__linux__) && !defined(_GNU_SOURCE)
#define _GNU_SOURCE // for syscall()
#endif

#include <stddef.h>
#include <stdint.h>

#if defined(__linux__)
#include <sys/syscall.h>
#include <unistd.h>
#endif

// --- diagnostic: real OS thread id (distinguishes foreign vs main thread) ---
long scalanative_gdext_gettid(void) {
#if defined(__linux__)
    return (long)syscall(SYS_gettid);
#else
    return 0;
#endif
}

// Only the commix/immix collectors keep a per-thread mutator; the `none` and
// `boehm` collectors don't need (or have) this machinery, so the register/
// unregister wrappers compile to no-ops there.
#if defined(SCALANATIVE_GC_COMMIX) || defined(SCALANATIVE_GC_IMMIX)

// External (same-.so) symbols from Scala Native's GC. Declared here rather than
// pulling in SN's internal GC headers (which aren't on the include path).
//   - currentMutatorThread: thread-local pointer to the calling thread's GC
//     mutator state; NULL on a thread the GC has never seen.
//   - MutatorThread_init: allocate + install the calling thread's mutator state
//     (so allocation works) and add it to the GC's mutator-thread list.
//   - MutatorThread_delete: tear it down again.
typedef void word_t;
extern _Thread_local void *currentMutatorThread;
extern void MutatorThread_init(word_t **stackBottom);
extern void MutatorThread_delete(void *self);

// Register the CALLING (foreign) thread with the GC if it isn't already, so it
// may allocate Scala objects safely. Idempotent: returns 1 if it newly
// registered the thread (caller is then responsible for a matching
// unregister), 0 if the thread was already a mutator (do NOT unregister).
int scalanative_gdext_gc_register_current_thread(void) {
    if (currentMutatorThread != NULL)
        return 0;
    // Approximate this thread's stack bottom from a local. The GC scans from
    // here; for short-lived callback frames this conservatively covers the live
    // roots on the stack.
    word_t *stackBottom = (word_t *)&stackBottom;
    MutatorThread_init(&stackBottom);
    return 1;
}

void scalanative_gdext_gc_unregister_current_thread(void) {
    if (currentMutatorThread != NULL)
        MutatorThread_delete(currentMutatorThread);
}

#else // GC.none / boehm: nothing to register.

int scalanative_gdext_gc_register_current_thread(void) { return 0; }
void scalanative_gdext_gc_unregister_current_thread(void) {}

#endif
