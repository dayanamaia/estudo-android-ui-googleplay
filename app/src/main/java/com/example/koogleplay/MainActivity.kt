    package com.example.koogleplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tmpList.adapter = TmpListAdapter()
    }

    class TmpListAdapter : RecyclerView.Adapter<TmpListView>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TmpListView {
            return TmpListView(
                    LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1,
                            parent, false)
            )
        }

        override fun getItemCount(): Int {
            return 30
        }

        override fun onBindViewHolder(holder: TmpListView, position: Int) {
            (holder.itemView as TextView).text = "$position pos"
        }
    }

    class TmpListView(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}