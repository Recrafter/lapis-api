package io.github.recrafter.lapis.api

open class LapisDescriptor<O, F : Function<*>>(function: F) {
    val invoke: F = function
}
