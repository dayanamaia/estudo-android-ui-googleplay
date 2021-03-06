package com.example.koogleplay.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.koogleplay.R
import com.example.koogleplay.model.Game
import kotlinx.android.synthetic.main.item_game.view.*
import kotlinx.android.synthetic.main.item_game_for_you.view.*

class ForYouHorizontalAdapter(private val games: MutableList<Game>): RecyclerView.Adapter<ForYouHorizontalAdapter.HorizontalHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = HorizontalHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_game, parent, false)
    )

    override fun getItemCount(): Int = games.size

    override fun onBindViewHolder(holder: HorizontalHolder, position: Int) {
        holder.bind(games[position])
    }

    class HorizontalHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        fun bind(game: Game) {
            with(itemView) {
                item_title.text = game.title
                item_subTitle.text = game.subtitle
            }
        }
    }
}