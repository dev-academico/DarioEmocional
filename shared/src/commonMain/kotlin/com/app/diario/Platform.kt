package com.app.diario

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
