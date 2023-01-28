package org.example

class DefaultParameterInvoke {

    fun invokeDefaultParameter() {
        DefaultParameterImpl().defaultParameterTest("aaaa", defaultParameter1 = "aaaaa")
    }
}