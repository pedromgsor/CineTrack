package org.example.cinetrack

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform