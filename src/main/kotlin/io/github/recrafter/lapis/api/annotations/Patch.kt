package io.github.recrafter.lapis.api.annotations

import io.github.recrafter.lapis.api.PatchSide
import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class Patch(
    val target: KClass<*>,
    val side: PatchSide = PatchSide.Common,
    val widener: String = "",
)
