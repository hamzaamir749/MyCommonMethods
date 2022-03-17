package com.coderpakistan.mycommonfunctionality

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.coderpakistan.commonfunctionality.showDebugLog
import com.coderpakistan.commonfunctionality.showErrorLog
import com.coderpakistan.commonfunctionality.showToastLong
import com.coderpakistan.commonfunctionality.showToastShort

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showErrorLog("Hi")
        showToastLong("hello")
        showToastShort("how")
        showDebugLog("are")
    }
}