package com.example.dagger

import android.content.ContentValues.TAG
import android.util.Log

class UserRepository {


    fun saveuser(email: String, password: String) {
        Log.d(TAG, "saveuser: $email, $password")

    }



}