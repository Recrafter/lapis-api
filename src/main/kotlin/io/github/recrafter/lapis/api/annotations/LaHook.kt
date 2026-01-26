package io.github.recrafter.lapis.api.annotations

import io.github.recrafter.lapis.api.LapisWrapKind
import kotlin.annotation.Target

@La
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class LaHook(val wrap: LapisWrapKind)
