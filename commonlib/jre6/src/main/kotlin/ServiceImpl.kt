package org.test.commonlib

import org.joda.time.*

impl class MyDate(val date: LocalDate) {
    constructor() : this(LocalDate())
}

//impl typealias MyDate = LocalDateWrapper

class ServiceImpl : Service {
    override fun method(): String {
        return LocalDate.now().toString()
    }

    override fun typedMethod(): MyDate = MyDate(LocalDate.now())
}
