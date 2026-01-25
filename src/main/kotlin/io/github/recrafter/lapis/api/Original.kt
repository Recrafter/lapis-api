package io.github.recrafter.lapis.api

import com.llamalad7.mixinextras.injector.wrapoperation.Operation
import kotlin.jvm.functions.FunctionN

class Original<F : Function<*>> internal constructor(function: F) {

    val call: F = function
        get() {
            if (isDisabled) {
                error("Original operation is disabled and cannot be called.")
            }
            isCalled = true
            return field
        }

    private var isCalled: Boolean = false
    private var isDisabled: Boolean = false

    fun disable() {
        if (isCalled) {
            error("Cannot disable: original operation has already been called.")
        }
        isDisabled = true
    }

    companion object {
        @JvmStatic
        fun <F : Function<*>> of(@Suppress("unused") operation: Operation<*>, function: F): Original<F> =
            Original(function)

        @JvmStatic
        fun <R> of(operation: Operation<R>, arity: Int): Original<FunctionN<R>> =
            Original(object : FunctionN<R> {
                override val arity: Int = arity

                override fun invoke(vararg args: Any?): R = operation.call(*args)
            })
    }
}

fun <F : Function<*>> originalOf(function: () -> F): Original<F> =
    Original(function())
