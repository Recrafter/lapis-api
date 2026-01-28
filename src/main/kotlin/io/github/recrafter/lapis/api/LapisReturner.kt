package io.github.recrafter.lapis.api

class LapisReturner<R> private constructor(private val cancel: (R?) -> Unit) {

    fun invoke(value: R?): Nothing {
        cancel(value)
        throw LapisReturnSignal()
    }

    companion object {
        @JvmStatic
        fun <R> of(cancel: (R?) -> Unit): LapisReturner<R> =
            LapisReturner(cancel)
    }
}
