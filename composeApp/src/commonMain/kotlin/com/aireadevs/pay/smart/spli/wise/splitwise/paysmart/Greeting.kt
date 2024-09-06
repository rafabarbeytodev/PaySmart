package com.aireadevs.pay.smart.spli.wise.splitwise.paysmart

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}