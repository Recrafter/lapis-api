package io.github.recrafter.lapis.api

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

class LapisCanceler private constructor(private val callbackInfo: CallbackInfo) {

    fun call(): Nothing {
        callbackInfo.cancel()
        throw LapisReturnSignal()
    }

    companion object {
        @JvmStatic
        fun of(callbackInfo: CallbackInfo): LapisCanceler =
            LapisCanceler(callbackInfo)
    }
}
