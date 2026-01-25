package io.github.recrafter.lapis.api

enum class HookKind {
    WrapMethod,
    WrapOperation,
    ModifyExpression,

    InjectMethodHead,
    InjectMethodTail;
}
