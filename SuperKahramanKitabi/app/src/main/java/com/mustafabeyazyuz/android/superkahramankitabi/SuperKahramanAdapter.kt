package com.mustafabeyazyuz.android.superkahramankitabi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mustafabeyazyuz.android.superkahramankitabi.databinding.RecylerRowBinding
import java.util.ArrayList

class SuperKahramanAdapter (val superKahramanListesi : ArrayList<SuperKahraman>) : RecyclerView.Adapter<SuperKahramanAdapter.superKahramanViewHolder>(){
    class superKahramanViewHolder(val  binding : RecylerRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): superKahramanViewHolder {
        val binding = RecylerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return superKahramanViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return superKahramanListesi.size
    }

    override fun onBindViewHolder(holder: superKahramanViewHolder, position: Int) {
        holder.binding.textViewRecylerView.text = superKahramanListesi[position].isim
    }
}