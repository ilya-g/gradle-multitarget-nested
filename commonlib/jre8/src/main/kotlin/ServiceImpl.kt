package org.test.commonlib

import java.time.*
import kotlin.streams.toList

typealias MyDate = LocalDate

class ServiceImpl : Service {
    override fun method(): String {
        listOf("a", "b").stream().toList()
        return LocalDate.now().toString()
    }

    override fun typedMethod(): MyDate = LocalDate.now()
}
