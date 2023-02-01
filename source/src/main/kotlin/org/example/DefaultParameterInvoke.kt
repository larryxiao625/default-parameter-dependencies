package org.example

object DefaultParameterInvoke : DefaultParameterInvokeInterface {

    private val impl by delegation<DefaultParameterImpl>()
    fun invokeDefaultParameter() {
        impl.defaultParameterTest("aaaa", defaultParameter1 = "aaaaa")
    }
}