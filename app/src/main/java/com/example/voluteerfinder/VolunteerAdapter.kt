package com.example.volunteerfinder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VolunteerAdapter(
    private val opportunities: List<VolunteerOpportunity>,
    private val onItemClick: (VolunteerOpportunity) -> Unit
) : RecyclerView.Adapter<VolunteerAdapter.VolunteerViewHolder>() {

    class VolunteerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.tv_title)
        val description: TextView = view.findViewById(R.id.tv_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VolunteerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_volunteer, parent, false)
        return VolunteerViewHolder(view)
    }

    override fun onBindViewHolder(holder: VolunteerViewHolder, position: Int) {
        val opportunity = opportunities[position]
        holder.title.text = opportunity.title
        holder.description.text = opportunity.description
        holder.itemView.setOnClickListener { onItemClick(opportunity) }
    }

    override fun getItemCount(): Int = opportunities.size
}
