package com.test.pokedex

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class ActivitySplashscreen : AppCompatActivity() {

    val SPLASHSCREEN_DURATION:Long = 3000
    private lateinit var handler: Handler


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        handler = Handler()

        handler.postDelayed(Runnable {
            var intent: Intent = Intent(this,ActivityLogin::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                    or Intent.FLAG_ACTIVITY_NEW_TASK
                    or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            finish()
            this.startActivity(intent)

        },SPLASHSCREEN_DURATION)



    }
}
