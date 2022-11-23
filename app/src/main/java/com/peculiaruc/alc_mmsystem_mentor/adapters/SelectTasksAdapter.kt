package com.peculiaruc.alc_mmsystem_mentor.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.peculiaruc.alc_mmsystem_mentor.R

class SelectTasksAdapter(private val tasks: List<ItemTasks>) : RecyclerView.Adapter<SelectTasksAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_mentor_select_tasks, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val task = tasks[position]
        holder.titleText.text = task.title
        holder.image.setImageResource(task.image)
    }

    override fun getItemCount(): Int {
        return tasks.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleText: TextView = itemView.findViewById(R.id.ist_txt)
        val image: ImageView = itemView.findViewById(R.id.box_icon)
    }
}