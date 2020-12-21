package com.example.finalandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.infos.view.*
class infoAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var infos = emptyList<Info>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.infos, parent, false)
        return ContactViewHolder(v)
    }

    override fun getItemCount(): Int {
        return infos.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        holder as ContactViewHolder
        val currentItem = infos[position]
        holder.itemView.titleTextView.text = currentItem.title

        holder.itemView.toInfos.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_thirdFragment_to_fourthFragment)
        }
    }
    fun setData(list: List<Info>){
        this.infos = list
        notifyDataSetChanged()
    }
    inner class ContactViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        //...
    }
}