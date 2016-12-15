package org.test.commonlib

import kotlin.js.*

impl typealias MyDate = Date

class ServiceImpl : Service {
    override fun method(): String {
        return Date().toString()
    }

    override fun typedMethod(): MyDate = MyDate()
}
