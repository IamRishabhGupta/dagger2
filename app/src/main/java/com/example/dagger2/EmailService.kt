package com.example.dagger2

import android.util.Log

class EmailService {

fun send(to:String,from:String,subject:String,body:String){

    Log.d("EmailService","Sending email to $to from $from with subject $subject and body $body")
}


}