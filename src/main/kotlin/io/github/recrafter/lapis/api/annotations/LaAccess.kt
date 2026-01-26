package io.github.recrafter.lapis.api.annotations

@La
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class LaAccess(val vanillaName: String = "")
