package io.github.recrafter.lapis.api

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

class Canceler internal constructor(private val callbackInfo: CallbackInfo) {

    fun call(): Nothing {
        callbackInfo.cancel()
        throw ReturnSignal()
    }
}
