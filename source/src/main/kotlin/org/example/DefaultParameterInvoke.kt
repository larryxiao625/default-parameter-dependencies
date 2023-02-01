package org.example

object DefaultParameterInvoke : DefaultParameterInvokeInterface {

    private val impl: DefaultParameterImpl by delegation()
    fun invokeDefaultParameter() {
        impl.defaultParameterTest("aaaa", defaultParameter1 = "aaaaa", defaultParameter4 = "aaaaa")
    }
}