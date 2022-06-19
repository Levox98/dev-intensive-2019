package ru.skillbranch.devintensive.extensions

import java.text.SimpleDateFormat
import java.util.*

const val SECONDS = 1000L
const val MINUTES = 60 * SECONDS
const val HOURS = 60 * MINUTES
const val DAYS = 24 * HOURS

fun Date.format(pattern: String = "HH:mm:ss dd:MM:yy"): String {
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

fun Date.add(value: Int, units: String): Date {
    var time =this.time

    when (units) {
        "second", "seconds" -> value * SECONDS
        "minute", "minutes" -> value * MINUTES
        "hour", "hours" -> value * HOURS
        "day", "days" -> value * DAYS
        else -> throw IllegalStateException("Invalid unit")
    }

    return this
}