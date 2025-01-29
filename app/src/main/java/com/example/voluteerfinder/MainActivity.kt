package com.example.volunteerfinder

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: VolunteerAdapter
    private val opportunities = listOf(
        VolunteerOpportunity("1", "Beach Cleanup", "Help clean the local beach"),
        VolunteerOpportunity("2", "Food Drive", "Assist in food collection for the needy"),
        VolunteerOpportunity("3", "Animal Shelter", "Care for rescued animals"),
        VolunteerOpportunity("4", "Tree Plantation", "Plant trees in the community park")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = VolunteerAdapter(opportunities) { opportunity ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("title", opportunity.title)
            intent.putExtra("description", opportunity.description)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }
}
