package io.github.recrafter.lapis.api

class Handle<@Suppress("unused") F : Function<*>> internal constructor() {

    companion object {
        @JvmStatic
        fun of(): Handle<Nothing> =
            Handle()
    }
}

fun <F : Function<*>> handleOf(@Suppress("unused") function: () -> F): Handle<F> =
    Handle()
