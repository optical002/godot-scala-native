package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRFaceTracker`, extends `XRTracker`. */
abstract class XRFaceTracker extends XRTracker {
  override def godotClassName: String = "XRFaceTracker"

  /** XRFaceTracker.get_blend_shape */
  final def getBlendShape(blendShape: gdext.classes.XRFaceTracker.BlendShapeEntry): Double = {
    if (gdext.classes.XRFaceTracker.mb_get_blend_shape == null) gdext.classes.XRFaceTracker.mb_get_blend_shape = MethodBind.get("XRFaceTracker", "get_blend_shape", 330010046L)
    Ptrcall.call1[Long, Double](gdext.classes.XRFaceTracker.mb_get_blend_shape, livePtr, blendShape)
  }

  /** XRFaceTracker.set_blend_shape */
  final def setBlendShape(blendShape: gdext.classes.XRFaceTracker.BlendShapeEntry, weight: Double): Unit = {
    if (gdext.classes.XRFaceTracker.mb_set_blend_shape == null) gdext.classes.XRFaceTracker.mb_set_blend_shape = MethodBind.get("XRFaceTracker", "set_blend_shape", 2352588791L)
    Ptrcall.callVoid2(gdext.classes.XRFaceTracker.mb_set_blend_shape, livePtr, blendShape, weight)
  }

}

object XRFaceTracker {
  private[classes] var mb_get_blend_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_shape: GDExtensionMethodBindPtr = null

  /** Godot enum `XRFaceTracker.BlendShapeEntry`. */
  opaque type BlendShapeEntry <: Long = Long

  object BlendShapeEntry {
    final val EyeLookOutRight: BlendShapeEntry = 0L.asInstanceOf[BlendShapeEntry]
    final val EyeLookInRight: BlendShapeEntry = 1L.asInstanceOf[BlendShapeEntry]
    final val EyeLookUpRight: BlendShapeEntry = 2L.asInstanceOf[BlendShapeEntry]
    final val EyeLookDownRight: BlendShapeEntry = 3L.asInstanceOf[BlendShapeEntry]
    final val EyeLookOutLeft: BlendShapeEntry = 4L.asInstanceOf[BlendShapeEntry]
    final val EyeLookInLeft: BlendShapeEntry = 5L.asInstanceOf[BlendShapeEntry]
    final val EyeLookUpLeft: BlendShapeEntry = 6L.asInstanceOf[BlendShapeEntry]
    final val EyeLookDownLeft: BlendShapeEntry = 7L.asInstanceOf[BlendShapeEntry]
    final val EyeClosedRight: BlendShapeEntry = 8L.asInstanceOf[BlendShapeEntry]
    final val EyeClosedLeft: BlendShapeEntry = 9L.asInstanceOf[BlendShapeEntry]
    final val EyeSquintRight: BlendShapeEntry = 10L.asInstanceOf[BlendShapeEntry]
    final val EyeSquintLeft: BlendShapeEntry = 11L.asInstanceOf[BlendShapeEntry]
    final val EyeWideRight: BlendShapeEntry = 12L.asInstanceOf[BlendShapeEntry]
    final val EyeWideLeft: BlendShapeEntry = 13L.asInstanceOf[BlendShapeEntry]
    final val EyeDilationRight: BlendShapeEntry = 14L.asInstanceOf[BlendShapeEntry]
    final val EyeDilationLeft: BlendShapeEntry = 15L.asInstanceOf[BlendShapeEntry]
    final val EyeConstrictRight: BlendShapeEntry = 16L.asInstanceOf[BlendShapeEntry]
    final val EyeConstrictLeft: BlendShapeEntry = 17L.asInstanceOf[BlendShapeEntry]
    final val BrowPinchRight: BlendShapeEntry = 18L.asInstanceOf[BlendShapeEntry]
    final val BrowPinchLeft: BlendShapeEntry = 19L.asInstanceOf[BlendShapeEntry]
    final val BrowLowererRight: BlendShapeEntry = 20L.asInstanceOf[BlendShapeEntry]
    final val BrowLowererLeft: BlendShapeEntry = 21L.asInstanceOf[BlendShapeEntry]
    final val BrowInnerUpRight: BlendShapeEntry = 22L.asInstanceOf[BlendShapeEntry]
    final val BrowInnerUpLeft: BlendShapeEntry = 23L.asInstanceOf[BlendShapeEntry]
    final val BrowOuterUpRight: BlendShapeEntry = 24L.asInstanceOf[BlendShapeEntry]
    final val BrowOuterUpLeft: BlendShapeEntry = 25L.asInstanceOf[BlendShapeEntry]
    final val NoseSneerRight: BlendShapeEntry = 26L.asInstanceOf[BlendShapeEntry]
    final val NoseSneerLeft: BlendShapeEntry = 27L.asInstanceOf[BlendShapeEntry]
    final val NasalDilationRight: BlendShapeEntry = 28L.asInstanceOf[BlendShapeEntry]
    final val NasalDilationLeft: BlendShapeEntry = 29L.asInstanceOf[BlendShapeEntry]
    final val NasalConstrictRight: BlendShapeEntry = 30L.asInstanceOf[BlendShapeEntry]
    final val NasalConstrictLeft: BlendShapeEntry = 31L.asInstanceOf[BlendShapeEntry]
    final val CheekSquintRight: BlendShapeEntry = 32L.asInstanceOf[BlendShapeEntry]
    final val CheekSquintLeft: BlendShapeEntry = 33L.asInstanceOf[BlendShapeEntry]
    final val CheekPuffRight: BlendShapeEntry = 34L.asInstanceOf[BlendShapeEntry]
    final val CheekPuffLeft: BlendShapeEntry = 35L.asInstanceOf[BlendShapeEntry]
    final val CheekSuckRight: BlendShapeEntry = 36L.asInstanceOf[BlendShapeEntry]
    final val CheekSuckLeft: BlendShapeEntry = 37L.asInstanceOf[BlendShapeEntry]
    final val JawOpen: BlendShapeEntry = 38L.asInstanceOf[BlendShapeEntry]
    final val MouthClosed: BlendShapeEntry = 39L.asInstanceOf[BlendShapeEntry]
    final val JawRight: BlendShapeEntry = 40L.asInstanceOf[BlendShapeEntry]
    final val JawLeft: BlendShapeEntry = 41L.asInstanceOf[BlendShapeEntry]
    final val JawForward: BlendShapeEntry = 42L.asInstanceOf[BlendShapeEntry]
    final val JawBackward: BlendShapeEntry = 43L.asInstanceOf[BlendShapeEntry]
    final val JawClench: BlendShapeEntry = 44L.asInstanceOf[BlendShapeEntry]
    final val JawMandibleRaise: BlendShapeEntry = 45L.asInstanceOf[BlendShapeEntry]
    final val LipSuckUpperRight: BlendShapeEntry = 46L.asInstanceOf[BlendShapeEntry]
    final val LipSuckUpperLeft: BlendShapeEntry = 47L.asInstanceOf[BlendShapeEntry]
    final val LipSuckLowerRight: BlendShapeEntry = 48L.asInstanceOf[BlendShapeEntry]
    final val LipSuckLowerLeft: BlendShapeEntry = 49L.asInstanceOf[BlendShapeEntry]
    final val LipSuckCornerRight: BlendShapeEntry = 50L.asInstanceOf[BlendShapeEntry]
    final val LipSuckCornerLeft: BlendShapeEntry = 51L.asInstanceOf[BlendShapeEntry]
    final val LipFunnelUpperRight: BlendShapeEntry = 52L.asInstanceOf[BlendShapeEntry]
    final val LipFunnelUpperLeft: BlendShapeEntry = 53L.asInstanceOf[BlendShapeEntry]
    final val LipFunnelLowerRight: BlendShapeEntry = 54L.asInstanceOf[BlendShapeEntry]
    final val LipFunnelLowerLeft: BlendShapeEntry = 55L.asInstanceOf[BlendShapeEntry]
    final val LipPuckerUpperRight: BlendShapeEntry = 56L.asInstanceOf[BlendShapeEntry]
    final val LipPuckerUpperLeft: BlendShapeEntry = 57L.asInstanceOf[BlendShapeEntry]
    final val LipPuckerLowerRight: BlendShapeEntry = 58L.asInstanceOf[BlendShapeEntry]
    final val LipPuckerLowerLeft: BlendShapeEntry = 59L.asInstanceOf[BlendShapeEntry]
    final val MouthUpperUpRight: BlendShapeEntry = 60L.asInstanceOf[BlendShapeEntry]
    final val MouthUpperUpLeft: BlendShapeEntry = 61L.asInstanceOf[BlendShapeEntry]
    final val MouthLowerDownRight: BlendShapeEntry = 62L.asInstanceOf[BlendShapeEntry]
    final val MouthLowerDownLeft: BlendShapeEntry = 63L.asInstanceOf[BlendShapeEntry]
    final val MouthUpperDeepenRight: BlendShapeEntry = 64L.asInstanceOf[BlendShapeEntry]
    final val MouthUpperDeepenLeft: BlendShapeEntry = 65L.asInstanceOf[BlendShapeEntry]
    final val MouthUpperRight: BlendShapeEntry = 66L.asInstanceOf[BlendShapeEntry]
    final val MouthUpperLeft: BlendShapeEntry = 67L.asInstanceOf[BlendShapeEntry]
    final val MouthLowerRight: BlendShapeEntry = 68L.asInstanceOf[BlendShapeEntry]
    final val MouthLowerLeft: BlendShapeEntry = 69L.asInstanceOf[BlendShapeEntry]
    final val MouthCornerPullRight: BlendShapeEntry = 70L.asInstanceOf[BlendShapeEntry]
    final val MouthCornerPullLeft: BlendShapeEntry = 71L.asInstanceOf[BlendShapeEntry]
    final val MouthCornerSlantRight: BlendShapeEntry = 72L.asInstanceOf[BlendShapeEntry]
    final val MouthCornerSlantLeft: BlendShapeEntry = 73L.asInstanceOf[BlendShapeEntry]
    final val MouthFrownRight: BlendShapeEntry = 74L.asInstanceOf[BlendShapeEntry]
    final val MouthFrownLeft: BlendShapeEntry = 75L.asInstanceOf[BlendShapeEntry]
    final val MouthStretchRight: BlendShapeEntry = 76L.asInstanceOf[BlendShapeEntry]
    final val MouthStretchLeft: BlendShapeEntry = 77L.asInstanceOf[BlendShapeEntry]
    final val MouthDimpleRight: BlendShapeEntry = 78L.asInstanceOf[BlendShapeEntry]
    final val MouthDimpleLeft: BlendShapeEntry = 79L.asInstanceOf[BlendShapeEntry]
    final val MouthRaiserUpper: BlendShapeEntry = 80L.asInstanceOf[BlendShapeEntry]
    final val MouthRaiserLower: BlendShapeEntry = 81L.asInstanceOf[BlendShapeEntry]
    final val MouthPressRight: BlendShapeEntry = 82L.asInstanceOf[BlendShapeEntry]
    final val MouthPressLeft: BlendShapeEntry = 83L.asInstanceOf[BlendShapeEntry]
    final val MouthTightenerRight: BlendShapeEntry = 84L.asInstanceOf[BlendShapeEntry]
    final val MouthTightenerLeft: BlendShapeEntry = 85L.asInstanceOf[BlendShapeEntry]
    final val TongueOut: BlendShapeEntry = 86L.asInstanceOf[BlendShapeEntry]
    final val TongueUp: BlendShapeEntry = 87L.asInstanceOf[BlendShapeEntry]
    final val TongueDown: BlendShapeEntry = 88L.asInstanceOf[BlendShapeEntry]
    final val TongueRight: BlendShapeEntry = 89L.asInstanceOf[BlendShapeEntry]
    final val TongueLeft: BlendShapeEntry = 90L.asInstanceOf[BlendShapeEntry]
    final val TongueRoll: BlendShapeEntry = 91L.asInstanceOf[BlendShapeEntry]
    final val TongueBlendDown: BlendShapeEntry = 92L.asInstanceOf[BlendShapeEntry]
    final val TongueCurlUp: BlendShapeEntry = 93L.asInstanceOf[BlendShapeEntry]
    final val TongueSquish: BlendShapeEntry = 94L.asInstanceOf[BlendShapeEntry]
    final val TongueFlat: BlendShapeEntry = 95L.asInstanceOf[BlendShapeEntry]
    final val TongueTwistRight: BlendShapeEntry = 96L.asInstanceOf[BlendShapeEntry]
    final val TongueTwistLeft: BlendShapeEntry = 97L.asInstanceOf[BlendShapeEntry]
    final val SoftPalateClose: BlendShapeEntry = 98L.asInstanceOf[BlendShapeEntry]
    final val ThroatSwallow: BlendShapeEntry = 99L.asInstanceOf[BlendShapeEntry]
    final val NeckFlexRight: BlendShapeEntry = 100L.asInstanceOf[BlendShapeEntry]
    final val NeckFlexLeft: BlendShapeEntry = 101L.asInstanceOf[BlendShapeEntry]
    final val EyeClosed: BlendShapeEntry = 102L.asInstanceOf[BlendShapeEntry]
    final val EyeWide: BlendShapeEntry = 103L.asInstanceOf[BlendShapeEntry]
    final val EyeSquint: BlendShapeEntry = 104L.asInstanceOf[BlendShapeEntry]
    final val EyeDilation: BlendShapeEntry = 105L.asInstanceOf[BlendShapeEntry]
    final val EyeConstrict: BlendShapeEntry = 106L.asInstanceOf[BlendShapeEntry]
    final val BrowDownRight: BlendShapeEntry = 107L.asInstanceOf[BlendShapeEntry]
    final val BrowDownLeft: BlendShapeEntry = 108L.asInstanceOf[BlendShapeEntry]
    final val BrowDown: BlendShapeEntry = 109L.asInstanceOf[BlendShapeEntry]
    final val BrowUpRight: BlendShapeEntry = 110L.asInstanceOf[BlendShapeEntry]
    final val BrowUpLeft: BlendShapeEntry = 111L.asInstanceOf[BlendShapeEntry]
    final val BrowUp: BlendShapeEntry = 112L.asInstanceOf[BlendShapeEntry]
    final val NoseSneer: BlendShapeEntry = 113L.asInstanceOf[BlendShapeEntry]
    final val NasalDilation: BlendShapeEntry = 114L.asInstanceOf[BlendShapeEntry]
    final val NasalConstrict: BlendShapeEntry = 115L.asInstanceOf[BlendShapeEntry]
    final val CheekPuff: BlendShapeEntry = 116L.asInstanceOf[BlendShapeEntry]
    final val CheekSuck: BlendShapeEntry = 117L.asInstanceOf[BlendShapeEntry]
    final val CheekSquint: BlendShapeEntry = 118L.asInstanceOf[BlendShapeEntry]
    final val LipSuckUpper: BlendShapeEntry = 119L.asInstanceOf[BlendShapeEntry]
    final val LipSuckLower: BlendShapeEntry = 120L.asInstanceOf[BlendShapeEntry]
    final val LipSuck: BlendShapeEntry = 121L.asInstanceOf[BlendShapeEntry]
    final val LipFunnelUpper: BlendShapeEntry = 122L.asInstanceOf[BlendShapeEntry]
    final val LipFunnelLower: BlendShapeEntry = 123L.asInstanceOf[BlendShapeEntry]
    final val LipFunnel: BlendShapeEntry = 124L.asInstanceOf[BlendShapeEntry]
    final val LipPuckerUpper: BlendShapeEntry = 125L.asInstanceOf[BlendShapeEntry]
    final val LipPuckerLower: BlendShapeEntry = 126L.asInstanceOf[BlendShapeEntry]
    final val LipPucker: BlendShapeEntry = 127L.asInstanceOf[BlendShapeEntry]
    final val MouthUpperUp: BlendShapeEntry = 128L.asInstanceOf[BlendShapeEntry]
    final val MouthLowerDown: BlendShapeEntry = 129L.asInstanceOf[BlendShapeEntry]
    final val MouthOpen: BlendShapeEntry = 130L.asInstanceOf[BlendShapeEntry]
    final val MouthRight: BlendShapeEntry = 131L.asInstanceOf[BlendShapeEntry]
    final val MouthLeft: BlendShapeEntry = 132L.asInstanceOf[BlendShapeEntry]
    final val MouthSmileRight: BlendShapeEntry = 133L.asInstanceOf[BlendShapeEntry]
    final val MouthSmileLeft: BlendShapeEntry = 134L.asInstanceOf[BlendShapeEntry]
    final val MouthSmile: BlendShapeEntry = 135L.asInstanceOf[BlendShapeEntry]
    final val MouthSadRight: BlendShapeEntry = 136L.asInstanceOf[BlendShapeEntry]
    final val MouthSadLeft: BlendShapeEntry = 137L.asInstanceOf[BlendShapeEntry]
    final val MouthSad: BlendShapeEntry = 138L.asInstanceOf[BlendShapeEntry]
    final val MouthStretch: BlendShapeEntry = 139L.asInstanceOf[BlendShapeEntry]
    final val MouthDimple: BlendShapeEntry = 140L.asInstanceOf[BlendShapeEntry]
    final val MouthTightener: BlendShapeEntry = 141L.asInstanceOf[BlendShapeEntry]
    final val MouthPress: BlendShapeEntry = 142L.asInstanceOf[BlendShapeEntry]
    final val Max: BlendShapeEntry = 143L.asInstanceOf[BlendShapeEntry]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BlendShapeEntry = value.asInstanceOf[BlendShapeEntry]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BlendShapeEntry] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 35L, 36L, 37L, 38L, 39L, 40L, 41L, 42L, 43L, 44L, 45L, 46L, 47L, 48L, 49L, 50L, 51L, 52L, 53L, 54L, 55L, 56L, 57L, 58L, 59L, 60L, 61L, 62L, 63L, 64L, 65L, 66L, 67L, 68L, 69L, 70L, 71L, 72L, 73L, 74L, 75L, 76L, 77L, 78L, 79L, 80L, 81L, 82L, 83L, 84L, 85L, 86L, 87L, 88L, 89L, 90L, 91L, 92L, 93L, 94L, 95L, 96L, 97L, 98L, 99L, 100L, 101L, 102L, 103L, 104L, 105L, 106L, 107L, 108L, 109L, 110L, 111L, 112L, 113L, 114L, 115L, 116L, 117L, 118L, 119L, 120L, 121L, 122L, 123L, 124L, 125L, 126L, 127L, 128L, 129L, 130L, 131L, 132L, 133L, 134L, 135L, 136L, 137L, 138L, 139L, 140L, 141L, 142L, 143L).asInstanceOf[scala.IArray[BlendShapeEntry]]

    extension (self: BlendShapeEntry)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "EyeLookOutRight"
        case 1L => "EyeLookInRight"
        case 2L => "EyeLookUpRight"
        case 3L => "EyeLookDownRight"
        case 4L => "EyeLookOutLeft"
        case 5L => "EyeLookInLeft"
        case 6L => "EyeLookUpLeft"
        case 7L => "EyeLookDownLeft"
        case 8L => "EyeClosedRight"
        case 9L => "EyeClosedLeft"
        case 10L => "EyeSquintRight"
        case 11L => "EyeSquintLeft"
        case 12L => "EyeWideRight"
        case 13L => "EyeWideLeft"
        case 14L => "EyeDilationRight"
        case 15L => "EyeDilationLeft"
        case 16L => "EyeConstrictRight"
        case 17L => "EyeConstrictLeft"
        case 18L => "BrowPinchRight"
        case 19L => "BrowPinchLeft"
        case 20L => "BrowLowererRight"
        case 21L => "BrowLowererLeft"
        case 22L => "BrowInnerUpRight"
        case 23L => "BrowInnerUpLeft"
        case 24L => "BrowOuterUpRight"
        case 25L => "BrowOuterUpLeft"
        case 26L => "NoseSneerRight"
        case 27L => "NoseSneerLeft"
        case 28L => "NasalDilationRight"
        case 29L => "NasalDilationLeft"
        case 30L => "NasalConstrictRight"
        case 31L => "NasalConstrictLeft"
        case 32L => "CheekSquintRight"
        case 33L => "CheekSquintLeft"
        case 34L => "CheekPuffRight"
        case 35L => "CheekPuffLeft"
        case 36L => "CheekSuckRight"
        case 37L => "CheekSuckLeft"
        case 38L => "JawOpen"
        case 39L => "MouthClosed"
        case 40L => "JawRight"
        case 41L => "JawLeft"
        case 42L => "JawForward"
        case 43L => "JawBackward"
        case 44L => "JawClench"
        case 45L => "JawMandibleRaise"
        case 46L => "LipSuckUpperRight"
        case 47L => "LipSuckUpperLeft"
        case 48L => "LipSuckLowerRight"
        case 49L => "LipSuckLowerLeft"
        case 50L => "LipSuckCornerRight"
        case 51L => "LipSuckCornerLeft"
        case 52L => "LipFunnelUpperRight"
        case 53L => "LipFunnelUpperLeft"
        case 54L => "LipFunnelLowerRight"
        case 55L => "LipFunnelLowerLeft"
        case 56L => "LipPuckerUpperRight"
        case 57L => "LipPuckerUpperLeft"
        case 58L => "LipPuckerLowerRight"
        case 59L => "LipPuckerLowerLeft"
        case 60L => "MouthUpperUpRight"
        case 61L => "MouthUpperUpLeft"
        case 62L => "MouthLowerDownRight"
        case 63L => "MouthLowerDownLeft"
        case 64L => "MouthUpperDeepenRight"
        case 65L => "MouthUpperDeepenLeft"
        case 66L => "MouthUpperRight"
        case 67L => "MouthUpperLeft"
        case 68L => "MouthLowerRight"
        case 69L => "MouthLowerLeft"
        case 70L => "MouthCornerPullRight"
        case 71L => "MouthCornerPullLeft"
        case 72L => "MouthCornerSlantRight"
        case 73L => "MouthCornerSlantLeft"
        case 74L => "MouthFrownRight"
        case 75L => "MouthFrownLeft"
        case 76L => "MouthStretchRight"
        case 77L => "MouthStretchLeft"
        case 78L => "MouthDimpleRight"
        case 79L => "MouthDimpleLeft"
        case 80L => "MouthRaiserUpper"
        case 81L => "MouthRaiserLower"
        case 82L => "MouthPressRight"
        case 83L => "MouthPressLeft"
        case 84L => "MouthTightenerRight"
        case 85L => "MouthTightenerLeft"
        case 86L => "TongueOut"
        case 87L => "TongueUp"
        case 88L => "TongueDown"
        case 89L => "TongueRight"
        case 90L => "TongueLeft"
        case 91L => "TongueRoll"
        case 92L => "TongueBlendDown"
        case 93L => "TongueCurlUp"
        case 94L => "TongueSquish"
        case 95L => "TongueFlat"
        case 96L => "TongueTwistRight"
        case 97L => "TongueTwistLeft"
        case 98L => "SoftPalateClose"
        case 99L => "ThroatSwallow"
        case 100L => "NeckFlexRight"
        case 101L => "NeckFlexLeft"
        case 102L => "EyeClosed"
        case 103L => "EyeWide"
        case 104L => "EyeSquint"
        case 105L => "EyeDilation"
        case 106L => "EyeConstrict"
        case 107L => "BrowDownRight"
        case 108L => "BrowDownLeft"
        case 109L => "BrowDown"
        case 110L => "BrowUpRight"
        case 111L => "BrowUpLeft"
        case 112L => "BrowUp"
        case 113L => "NoseSneer"
        case 114L => "NasalDilation"
        case 115L => "NasalConstrict"
        case 116L => "CheekPuff"
        case 117L => "CheekSuck"
        case 118L => "CheekSquint"
        case 119L => "LipSuckUpper"
        case 120L => "LipSuckLower"
        case 121L => "LipSuck"
        case 122L => "LipFunnelUpper"
        case 123L => "LipFunnelLower"
        case 124L => "LipFunnel"
        case 125L => "LipPuckerUpper"
        case 126L => "LipPuckerLower"
        case 127L => "LipPucker"
        case 128L => "MouthUpperUp"
        case 129L => "MouthLowerDown"
        case 130L => "MouthOpen"
        case 131L => "MouthRight"
        case 132L => "MouthLeft"
        case 133L => "MouthSmileRight"
        case 134L => "MouthSmileLeft"
        case 135L => "MouthSmile"
        case 136L => "MouthSadRight"
        case 137L => "MouthSadLeft"
        case 138L => "MouthSad"
        case 139L => "MouthStretch"
        case 140L => "MouthDimple"
        case 141L => "MouthTightener"
        case 142L => "MouthPress"
        case 143L => "Max"
        case other => other.toString
      }
  }
}
