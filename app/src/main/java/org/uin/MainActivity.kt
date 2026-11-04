package org.uin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var haloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        haloTextView = findViewById(R.id.halo)


        findViewById<Button>(R.id.button_center)
            .setOnClickListener {
                haloTextView.text = "hallo yang di tengah"
            }
        findViewById<Button>(R.id.button_right)
            .setOnClickListener {
                haloTextView.text = "hallo yang di kanan"
            }
        findViewById<Button>(R.id.button_left)
            .setOnClickListener {
                haloTextView.text = "hallo yang di kiri"
            }

        Executors.newSingleThreadScheduledExecutor()
            .scheduleWithFixedDelay({ haloTextView.text = ("anjirlah") },
                5, 5, TimeUnit.SECONDS)
    }
}