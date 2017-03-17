package org.test.commonlib


impl fun headerReturningCommonType(): Service = ServiceImpl()

impl fun headerWithPair(keyValue: Pair<String, Int>) {
    println(keyValue)
}