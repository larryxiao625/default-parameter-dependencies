package org.example

object DefaultParameterInvoke : DefaultParameterInvokeInterface {

    private val impl by delegation()
    fun invokeDefaultParameter() {
        impl.defaultParameterTest("aaaa", defaultParameter1 = "aaaaa")
    }
}