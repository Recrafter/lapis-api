package io.github.recrafter.lapis.api

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable

class LapisReturner<R> private constructor(private val callbackInfoReturnable: CallbackInfoReturnable<R>) {

    fun call(value: R?): Nothing {
        callbackInfoReturnable.setReturnValue(value)
        throw LapisReturnSignal()
    }

    companion object {
        @JvmStatic
        fun <R> of(callbackInfoReturnable: CallbackInfoReturnable<R>): LapisReturner<R> =
            LapisReturner(callbackInfoReturnable)
    }
}
