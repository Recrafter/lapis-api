package io.github.recrafter.lapis.api

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable

class Returner<R> internal constructor(private val callbackInfoReturnable: CallbackInfoReturnable<R>) {

    fun call(value: R?): Nothing {
        callbackInfoReturnable.setReturnValue(value)
        throw ReturnSignal()
    }
}
