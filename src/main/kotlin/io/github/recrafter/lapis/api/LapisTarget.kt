package io.github.recrafter.lapis.api

import com.llamalad7.mixinextras.injector.wrapoperation.Operation
import kotlin.jvm.functions.FunctionN

class LapisTarget<F : Function<*>> internal constructor(function: F) {

    val call: F = function
        get() {
            if (isDisabled) {
                error("Target function is disabled and cannot be called.")
            }
            isCalled = true
            return field
        }

    private var isCalled: Boolean = false
    private var isDisabled: Boolean = false

    fun disable() {
        if (isCalled) {
            error("Cannot disable: target function has already been called.")
        }
        isDisabled = true
    }

    companion object {
        @JvmStatic
        fun <F : Function<*>> of(@Suppress("unused") operation: Operation<*>, function: F): LapisTarget<F> =
            LapisTarget(function)

        @JvmStatic
        fun <R> of(operation: Operation<R>, arity: Int): LapisTarget<FunctionN<R>> =
            LapisTarget(object : FunctionN<R> {
                override val arity: Int = arity

                override fun invoke(vararg args: Any?): R = operation.call(*args)
            })
    }
}

fun <F : Function<*>> targetOf(function: () -> F): LapisTarget<F> =
    LapisTarget(function())
