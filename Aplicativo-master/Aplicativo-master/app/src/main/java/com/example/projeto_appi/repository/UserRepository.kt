package com.example.projeto_appi.repository

import android.content.ContentValues
import android.content.Context
import com.example.projeto_appi.models.User
import com.example.projeto_appi.models.UserDAO

class UserRepository(context: Context) {
    companion object {
        private val table_name = "users"
    }
    val db = UserDAO(context).writableDatabase

    fun insert(user:User):Long {
        val contentValues = ContentValues(). apply {
            put("email",user.email)
            put("password",user.password)
        }
        return db.insert(table_name,"",contentValues)
    }
}