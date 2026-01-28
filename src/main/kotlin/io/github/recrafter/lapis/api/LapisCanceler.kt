package io.github.recrafter.lapis.api

class LapisCanceler private constructor(private val cancel: () -> Unit) {

    fun invoke(): Nothing {
        cancel()
        throw LapisReturnSignal()
    }

    companion object {
        @JvmStatic
        fun of(cancel: () -> Unit): LapisCanceler =
            LapisCanceler(cancel)
    }
}
