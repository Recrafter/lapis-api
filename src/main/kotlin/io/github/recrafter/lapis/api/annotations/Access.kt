package io.github.recrafter.lapis.api.annotations

@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class Access(val vanillaName: String = "")
