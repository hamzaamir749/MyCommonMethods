package com.coderpakistan.commonfunctionality

import android.app.Activity
import android.content.Context
import android.util.Log
import android.widget.Toast

fun Context.showErrorLog(message: String) {
    Log.e("TESTING", "showErrorLog: $message")
}

fun Activity.showDebugLog(message: String) {
    Log.d("TESTING", "showErrorLog: $message")
}

fun Activity.showErrorLog(message: String) {
    Log.e("TESTING", "showErrorLog: $message")
}

fun Context.showDebugLog(message: String) {
    Log.d("TESTING", "showErrorLog: $message")
}

fun Context.showToastLong(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Activity.showToastLong(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Context.showToastShort(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Activity.showToastShort(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}