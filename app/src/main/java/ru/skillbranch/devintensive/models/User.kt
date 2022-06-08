package ru.skillbranch.devintensive.models

import java.util.*

class User(
    val id: String,
    val firstName: String?,
    val lastName: String?,
    val avatar: String?,
    val rating: Int = 0,
    val respect: Int = 0,
    val lastVisit: Date? = null,
    val isOnline: Boolean = false
    ) {

    constructor(id: String, firstName: String?, lastName: String?): this(
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )

    companion object Factory {
        var lastId = -1
        fun makeUser(fullName: String): User {
            lastId++
            val (firstName, lastName) = fullName.split(" ")
            return User(id = "$lastId", firstName = firstName, lastName = lastName)
        }
    }
}