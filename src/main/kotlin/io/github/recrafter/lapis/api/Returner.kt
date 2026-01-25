package io.github.recrafter.lapis.api

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable

class Returner<R> private constructor(private val callbackInfoReturnable: CallbackInfoReturnable<R>) {

    fun call(value: R?): Nothing {
        callbackInfoReturnable.setReturnValue(value)
        throw ReturnSignal()
    }

    companion object {
        @JvmStatic
        fun <R> of(callbackInfoReturnable: CallbackInfoReturnable<R>): Returner<R> =
            Returner(callbackInfoReturnable)
    }
}
