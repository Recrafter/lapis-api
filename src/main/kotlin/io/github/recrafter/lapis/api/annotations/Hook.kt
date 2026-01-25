package io.github.recrafter.lapis.api.annotations

import io.github.recrafter.lapis.api.HookKind
import kotlin.annotation.Target

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class Hook(val kind: HookKind)
