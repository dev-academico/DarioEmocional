package com.app.diario

class Greeting {
    private val platform = getPlatform()

    fun greet(): String = sayHello(platform.name)
}
