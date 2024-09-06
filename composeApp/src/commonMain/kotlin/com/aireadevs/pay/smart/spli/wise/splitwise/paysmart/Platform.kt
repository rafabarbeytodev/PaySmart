package com.aireadevs.pay.smart.spli.wise.splitwise.paysmart

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform