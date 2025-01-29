package com.example.volunteerfinder

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("title")
        val description = intent.getStringExtra("description")

        findViewById<TextView>(R.id.tv_detail_title).text = title
        findViewById<TextView>(R.id.tv_detail_description).text = description
    }
}
