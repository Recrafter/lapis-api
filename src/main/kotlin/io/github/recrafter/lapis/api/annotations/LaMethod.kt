package io.github.recrafter.lapis.api.annotations

import kotlin.annotation.Target

@La
@Target(AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.SOURCE)
annotation class LaMethod
