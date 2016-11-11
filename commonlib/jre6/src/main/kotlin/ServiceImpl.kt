package org.test.commonlib

import org.joda.time.*

typealias MyDate = LocalDate

class ServiceImpl : Service {
    override fun method(): String {
        return LocalDate.now().toString()
    }

    override fun typedMethod(): MyDate = LocalDate.now()
}
