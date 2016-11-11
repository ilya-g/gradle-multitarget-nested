package org.test.commonlib

import kotlin.js.*

typealias MyDate = Date

class ServiceImpl : Service {
    override fun method(): String {
        return Date().toString()
    }

    override fun typedMethod(): MyDate = Date()
}
