package io.github.recrafter.lapis.api

class LapisHandle<@Suppress("unused") F : Function<*>> internal constructor() {

    companion object {
        @JvmStatic
        fun of(): LapisHandle<Nothing> =
            LapisHandle()
    }
}

fun <F : Function<*>> handleOf(@Suppress("unused") function: () -> F): LapisHandle<F> =
    LapisHandle()
