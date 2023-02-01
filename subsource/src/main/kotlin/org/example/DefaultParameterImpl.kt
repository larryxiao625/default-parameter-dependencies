package org.example

class DefaultParameterImpl : DefaultParameter() {
}

class DefaultParameterLazy : Lazy<DefaultParameter> {
    private var cached: DefaultParameter? = null
    override val value: DefaultParameter
        get() {
            cached = DefaultParameterImpl()
            return cached as DefaultParameterImpl
        }

    override fun isInitialized(): Boolean {
        return cached != null
    }
}


fun delegation(): DefaultParameterLazy {
    return DefaultParameterLazy()
}