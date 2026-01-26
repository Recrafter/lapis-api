package io.github.recrafter.lapis.api.annotations

@La
@Target(AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.SOURCE)
annotation class LaArgument(val index: Int)
