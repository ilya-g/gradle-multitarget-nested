package org.test.commonlib

interface Service {
    fun method(): String

    fun typedMethod(): MyDate
}


header class MyDate


abstract class AbstractServiceImpl : Service

header class DefaultServiceImpl : AbstractServiceImpl() {
    override fun method(): String
    override fun typedMethod(): MyDate
}