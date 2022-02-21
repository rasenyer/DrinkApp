package com.rasenyer.drinkapp.ui.fragments.home.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.rasenyer.drinkapp.R
import com.rasenyer.drinkapp.databinding.ItemDrinkBinding
import com.rasenyer.drinkapp.data.remote.models.Drink
import com.rasenyer.drinkapp.ui.fragments.home.HomeFragmentDirections

class DrinkAdapter: RecyclerView.Adapter<DrinkAdapter.MyViewHolder>() {

    private var drinks = ArrayList<Drink>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ItemDrinkBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(myViewHolder: MyViewHolder, position: Int) {

        val drink = drinks[position]

        myViewHolder.binding.mImageView.load(drink.urlImage){
            placeholder(R.color.purple_200)
            error(R.color.purple_200)
            crossfade(true)
            crossfade(400)
        }
        myViewHolder.binding.mTextViewName.text = drink.name

        myViewHolder.itemView.setOnClickListener {
            val direction = HomeFragmentDirections.actionHomeFragmentToDetailFragment(drink)
            it.findNavController().navigate(direction)
        }

    }

    override fun getItemCount(): Int {
        return drinks.size
    }

    class MyViewHolder(val binding: ItemDrinkBinding): RecyclerView.ViewHolder(binding.root)

    @SuppressLint("NotifyDataSetChanged")
    fun setDrinks(newDrinks: ArrayList<Drink>) {

        drinks = newDrinks
        notifyDataSetChanged()

    }

}