// format: off
package gdext.internal.types

import scala.scalanative.unsafe.*

object Tags {
  // Helper for function pointer types - all function pointers are just void pointers at runtime
  // We create this once to avoid HKTypeLambda issues with polymorphic Tag.Ptr
  private val voidPtrTag: Tag[CVoidPtr] = Tag.Byte.asInstanceOf[Tag[CVoidPtr]]

  def funcPtrTag[T]: Tag[T] = voidPtrTag.asInstanceOf[Tag[T]]

  // CStruct23 = CStruct2[CStruct22[T1..T22], T23]
  def materializeCStruct23Tag[T1: Tag, T2: Tag, T3: Tag, T4: Tag, T5: Tag, T6: Tag, T7: Tag, T8: Tag, T9: Tag, T10: Tag, T11: Tag, T12: Tag, T13: Tag, T14: Tag, T15: Tag, T16: Tag, T17: Tag, T18: Tag, T19: Tag, T20: Tag, T21: Tag, T22: Tag, T23: Tag]: Tag[CStruct23[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23]] = {
    Tag.materializeCStruct2Tag[CStruct22[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22], T23](
      using Tag.materializeCStruct22Tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22],
      summon[Tag[T23]]
    ).asInstanceOf[Tag[CStruct23[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23]]]
  }

  // CStruct24 = CStruct2[CStruct23[T1..T23], T24]
  def materializeCStruct24Tag[T1: Tag, T2: Tag, T3: Tag, T4: Tag, T5: Tag, T6: Tag, T7: Tag, T8: Tag, T9: Tag, T10: Tag, T11: Tag, T12: Tag, T13: Tag, T14: Tag, T15: Tag, T16: Tag, T17: Tag, T18: Tag, T19: Tag, T20: Tag, T21: Tag, T22: Tag, T23: Tag, T24: Tag]: Tag[CStruct24[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24]] = {
    Tag.materializeCStruct2Tag[CStruct23[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23], T24](
      using materializeCStruct23Tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23],
      summon[Tag[T24]]
    ).asInstanceOf[Tag[CStruct24[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24]]]
  }

  // CStruct25 = CStruct2[CStruct24[T1..T24], T25]
  def materializeCStruct25Tag[T1: Tag, T2: Tag, T3: Tag, T4: Tag, T5: Tag, T6: Tag, T7: Tag, T8: Tag, T9: Tag, T10: Tag, T11: Tag, T12: Tag, T13: Tag, T14: Tag, T15: Tag, T16: Tag, T17: Tag, T18: Tag, T19: Tag, T20: Tag, T21: Tag, T22: Tag, T23: Tag, T24: Tag, T25: Tag]: Tag[CStruct25[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25]] = {
    Tag.materializeCStruct2Tag[CStruct24[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24], T25](
      using materializeCStruct24Tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24],
      summon[Tag[T25]]
    ).asInstanceOf[Tag[CStruct25[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25]]]
  }

  // CStruct26 = CStruct2[CStruct25[T1..T25], T26]
  def materializeCStruct26Tag[T1: Tag, T2: Tag, T3: Tag, T4: Tag, T5: Tag, T6: Tag, T7: Tag, T8: Tag, T9: Tag, T10: Tag, T11: Tag, T12: Tag, T13: Tag, T14: Tag, T15: Tag, T16: Tag, T17: Tag, T18: Tag, T19: Tag, T20: Tag, T21: Tag, T22: Tag, T23: Tag, T24: Tag, T25: Tag, T26: Tag]: Tag[CStruct26[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26]] = {
    Tag.materializeCStruct2Tag[CStruct25[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25], T26](
      using materializeCStruct25Tag[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25],
      summon[Tag[T26]]
    ).asInstanceOf[Tag[CStruct26[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22, T23, T24, T25, T26]]]
  }
}
