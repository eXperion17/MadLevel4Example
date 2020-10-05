package com.example.madlevel2example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel3example.R
import kotlinx.android.synthetic.main.item_reminder.view.*

class ReminderAdapter(private val reminders:List<Reminder>) : RecyclerView.Adapter<ReminderAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val binding = ItemReminderBinding.bind(itemView);

        fun databind(reminder: Reminder) {
            //binding.tvReminder.text = reminder.reminderText;
            itemView.tvReminder.text = reminder.reminderText;
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate((R.layout.item_reminder), parent, false)
        );
    }


    override fun getItemCount(): Int {
        return reminders.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(reminders[position]);
    }

}