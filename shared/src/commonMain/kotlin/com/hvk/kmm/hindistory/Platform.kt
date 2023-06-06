package com.hvk.kmm.hindistory

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform