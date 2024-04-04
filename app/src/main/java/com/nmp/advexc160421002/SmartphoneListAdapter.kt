package com.nmp.advexc160421002

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nmp.advexc160421002.databinding.ActivitySmartphoneListItemBinding

class SmartphoneListAdapter (val smartphoneList:ArrayList<Smartphone>)
    : RecyclerView.Adapter<SmartphoneListAdapter.SmartphoneViewHolder>(){

    class SmartphoneViewHolder(var binding: ActivitySmartphoneListItemBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):SmartphoneViewHolder {
        val binding = ActivitySmartphoneListItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return SmartphoneViewHolder(binding)

    }

    override fun getItemCount(): Int {
    return smartphoneList.size
    }

    override fun onBindViewHolder(holder: SmartphoneViewHolder, position: Int) {
        //holder.binding.imgView.setImageDrawable()
        holder.binding.txtBrand.text = smartphoneList[position].brand
        holder.binding.txtModel.text = smartphoneList[position].model
        holder.binding.txtRelease.text = smartphoneList[position].releaseYear.toString()
        holder.binding.txtDisplay.text = smartphoneList[position].displaySize
        holder.binding.txtColor.text = smartphoneList[position].colors.toString()
        holder.binding.txtSpec.text = smartphoneList[position].specification.toString()
    }
}