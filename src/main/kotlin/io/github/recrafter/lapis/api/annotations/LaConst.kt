package io.github.recrafter.lapis.api.annotations

@La
@Target(AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.SOURCE)
annotation class LaConst(
    val int: Int,
    val float: Float,
    val long: Long,
    val double: Double,
    val string: String,
)
