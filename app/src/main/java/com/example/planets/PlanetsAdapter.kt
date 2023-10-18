package com.example.planets

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.planets.databinding.PlanetsItemBinding

class PlanetsAdapter : RecyclerView.Adapter<PlanetsAdapter.ViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = PlanetsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(PlanetData("Terra", "único planeta com vida"))
    }

    override fun getItemCount(): Int {
        return 8
    }

    class ViewHolder (val binding: PlanetsItemBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(planetData: PlanetData){
            binding.tvTitle.text = planetData.name
            binding.tvTitle.text = planetData.description
        }

    }
}