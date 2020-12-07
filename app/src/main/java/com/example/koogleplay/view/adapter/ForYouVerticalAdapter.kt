package com.example.koogleplay.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.koogleplay.R
import com.example.koogleplay.model.Category
import kotlinx.android.synthetic.main.item_game_for_you.view.*

class ForYouVerticalAdapter(
    private val categories: MutableList<Category> = mutableListOf()
) : RecyclerView.Adapter<ForYouVerticalAdapter.VerticalHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = VerticalHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_game_for_you, parent, false)
    )

    fun add(categories: List<Category>) {
        this.categories.clear()
        this.categories.addAll(categories)
        this.notifyDataSetChanged()
    }

    override fun getItemCount(): Int = categories.size

    override fun onBindViewHolder(holder: VerticalHolder, position: Int) {
        holder.bind(categories[position])
    }

    class VerticalHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        fun bind(category: Category) {
            with(itemView) {
                this.txt_title.text = category.title
                this.txt_subtitle.text = category.subtitle

                this.rv_horizontal.layoutManager = LinearLayoutManager(
                    itemView.context, RecyclerView.HORIZONTAL, false
                )

                this.rv_horizontal.adapter = ForYouHorizontalAdapter(category.games)

            }
        }
    }
}

