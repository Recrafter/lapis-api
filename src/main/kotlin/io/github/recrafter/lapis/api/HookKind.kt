package io.github.recrafter.lapis.api

enum class HookKind(internal val group: Group) {

    WrapMethod(Group.Wrap),
    WrapOperation(Group.Wrap),
    ModifyExpression(Group.Wrap),

    InjectMethodHead(Group.Inject),
    InjectMethodTail(Group.Inject);

    internal enum class Group {
        Wrap,
        Inject,
    }
}