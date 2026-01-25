package io.github.recrafter.lapis.api

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

class Canceler private constructor(private val callbackInfo: CallbackInfo) {

    fun call(): Nothing {
        callbackInfo.cancel()
        throw ReturnSignal()
    }

    companion object {
        @JvmStatic
        fun of(callbackInfo: CallbackInfo): Canceler =
            Canceler(callbackInfo)
    }
}
