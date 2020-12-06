package com.example.koogleplay.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.koogleplay.R
import kotlinx.android.synthetic.main.item_game_for_you.view.*

class ForYouVerticalAdapter : RecyclerView.Adapter<ForYouVerticalAdapter.VerticalHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VerticalHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_game_for_you, parent, false)
    )

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: VerticalHolder, position: Int) {
        holder.bind()
    }

    class VerticalHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        fun bind() {
            with(itemView) {
                this.rv_horizontal.layoutManager = LinearLayoutManager(
                    itemView.context, RecyclerView.HORIZONTAL, false
                )

                this.rv_horizontal.adapter = ForYouHorizontalAdapter()

            }
        }
    }
}

