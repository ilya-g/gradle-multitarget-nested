package org.test.commonlib

impl class DefaultServiceImpl : AbstractServiceImpl() {
    impl override fun method(): String = "default JVM impl"

    impl override fun typedMethod(): MyDate {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}