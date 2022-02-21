package com.rasenyer.drinkapp.ui.fragments.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import coil.load
import com.rasenyer.drinkapp.R
import com.rasenyer.drinkapp.data.remote.models.Drink
import com.rasenyer.drinkapp.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private val detailFragmentArgs: DetailFragmentArgs by navArgs()
    private lateinit var currentDrink: Drink

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        currentDrink = detailFragmentArgs.drink!!

        setViews()

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun setViews() {

        binding.mImageView.load(currentDrink.urlImage){
            placeholder(R.color.purple_200)
            error(R.color.purple_200)
            crossfade(true)
            crossfade(400)
        }
        binding.mTextViewName.text = currentDrink.name
        binding.mTextViewInstructions.text = currentDrink.instructions



        if (currentDrink.ingredient1 == null) {
            binding.mTextViewIngredient1.visibility = View.GONE
            binding.mTextViewMeasure1.visibility = View.GONE
        } else {
            binding.mTextViewIngredient1.visibility = View.VISIBLE
            binding.mTextViewMeasure1.visibility = View.VISIBLE
            binding.mTextViewIngredient1.text = currentDrink.ingredient1
            binding.mTextViewMeasure1.text = currentDrink.measure1
        }

        if (currentDrink.ingredient2 == null) {
            binding.mTextViewIngredient2.visibility = View.GONE
            binding.mTextViewMeasure2.visibility = View.GONE
        } else {
            binding.mTextViewIngredient2.visibility = View.VISIBLE
            binding.mTextViewMeasure2.visibility = View.VISIBLE
            binding.mTextViewIngredient2.text = currentDrink.ingredient2
            binding.mTextViewMeasure2.text = currentDrink.measure2
        }

        if (currentDrink.ingredient3 == null) {
            binding.mTextViewIngredient3.visibility = View.GONE
            binding.mTextViewMeasure3.visibility = View.GONE
        } else {
            binding.mTextViewIngredient3.visibility = View.VISIBLE
            binding.mTextViewMeasure3.visibility = View.VISIBLE
            binding.mTextViewIngredient3.text = currentDrink.ingredient3
            binding.mTextViewMeasure3.text = currentDrink.measure3
        }

        if (currentDrink.ingredient4 == null) {
            binding.mTextViewIngredient4.visibility = View.GONE
            binding.mTextViewMeasure4.visibility = View.GONE
        } else {
            binding.mTextViewIngredient4.visibility = View.VISIBLE
            binding.mTextViewMeasure4.visibility = View.VISIBLE
            binding.mTextViewIngredient4.text = currentDrink.ingredient4
            binding.mTextViewMeasure4.text = currentDrink.measure4
        }

        if (currentDrink.ingredient5 == null) {
            binding.mTextViewIngredient5.visibility = View.GONE
            binding.mTextViewMeasure5.visibility = View.GONE
        } else {
            binding.mTextViewIngredient5.visibility = View.VISIBLE
            binding.mTextViewMeasure5.visibility = View.VISIBLE
            binding.mTextViewIngredient5.text = currentDrink.ingredient5
            binding.mTextViewMeasure5.text = currentDrink.measure5
        }

        if (currentDrink.ingredient6 == null) {
            binding.mTextViewIngredient6.visibility = View.GONE
            binding.mTextViewMeasure6.visibility = View.GONE
        } else {
            binding.mTextViewIngredient6.visibility = View.VISIBLE
            binding.mTextViewMeasure6.visibility = View.VISIBLE
            binding.mTextViewIngredient6.text = currentDrink.ingredient6
            binding.mTextViewMeasure6.text = currentDrink.measure6
        }

        if (currentDrink.ingredient7 == null) {
            binding.mTextViewIngredient7.visibility = View.GONE
            binding.mTextViewMeasure7.visibility = View.GONE
        } else {
            binding.mTextViewIngredient7.visibility = View.VISIBLE
            binding.mTextViewMeasure7.visibility = View.VISIBLE
            binding.mTextViewIngredient7.text = currentDrink.ingredient7
            binding.mTextViewMeasure7.text = currentDrink.measure7
        }

        if (currentDrink.ingredient8 == null) {
            binding.mTextViewIngredient8.visibility = View.GONE
            binding.mTextViewMeasure8.visibility = View.GONE
        } else {
            binding.mTextViewIngredient8.visibility = View.VISIBLE
            binding.mTextViewMeasure8.visibility = View.VISIBLE
            binding.mTextViewIngredient8.text = currentDrink.ingredient8
            binding.mTextViewMeasure8.text = currentDrink.measure8
        }

        if (currentDrink.ingredient9 == null) {
            binding.mTextViewIngredient9.visibility = View.GONE
            binding.mTextViewMeasure9.visibility = View.GONE
        } else {
            binding.mTextViewIngredient9.visibility = View.VISIBLE
            binding.mTextViewMeasure9.visibility = View.VISIBLE
            binding.mTextViewIngredient9.text = currentDrink.ingredient9
            binding.mTextViewMeasure9.text = currentDrink.measure9
        }

        if (currentDrink.ingredient10 == null) {
            binding.mTextViewIngredient10.visibility = View.GONE
            binding.mTextViewMeasure10.visibility = View.GONE
        } else {
            binding.mTextViewIngredient10.visibility = View.VISIBLE
            binding.mTextViewMeasure10.visibility = View.VISIBLE
            binding.mTextViewIngredient10.text = currentDrink.ingredient10
            binding.mTextViewMeasure10.text = currentDrink.measure10
        }

        if (currentDrink.ingredient11 == null) {
            binding.mTextViewIngredient11.visibility = View.GONE
            binding.mTextViewMeasure11.visibility = View.GONE
        } else {
            binding.mTextViewIngredient11.visibility = View.VISIBLE
            binding.mTextViewMeasure11.visibility = View.VISIBLE
            binding.mTextViewIngredient11.text = currentDrink.ingredient11
            binding.mTextViewMeasure11.text = currentDrink.measure11
        }

        if (currentDrink.ingredient12 == null) {
            binding.mTextViewIngredient12.visibility = View.GONE
            binding.mTextViewMeasure12.visibility = View.GONE
        } else {
            binding.mTextViewIngredient12.visibility = View.VISIBLE
            binding.mTextViewMeasure12.visibility = View.VISIBLE
            binding.mTextViewIngredient12.text = currentDrink.ingredient12
            binding.mTextViewMeasure12.text = currentDrink.measure12
        }

        if (currentDrink.ingredient13 == null) {
            binding.mTextViewIngredient13.visibility = View.GONE
            binding.mTextViewMeasure13.visibility = View.GONE
        } else {
            binding.mTextViewIngredient13.visibility = View.VISIBLE
            binding.mTextViewMeasure13.visibility = View.VISIBLE
            binding.mTextViewIngredient13.text = currentDrink.ingredient13
            binding.mTextViewMeasure13.text = currentDrink.measure13
        }

        if (currentDrink.ingredient14 == null) {
            binding.mTextViewIngredient14.visibility = View.GONE
            binding.mTextViewMeasure14.visibility = View.GONE
        } else {
            binding.mTextViewIngredient14.visibility = View.VISIBLE
            binding.mTextViewMeasure14.visibility = View.VISIBLE
            binding.mTextViewIngredient14.text = currentDrink.ingredient14
            binding.mTextViewMeasure14.text = currentDrink.measure14
        }

        if (currentDrink.ingredient15 == null) {
            binding.mTextViewIngredient15.visibility = View.GONE
            binding.mTextViewMeasure15.visibility = View.GONE
        } else {
            binding.mTextViewIngredient15.visibility = View.VISIBLE
            binding.mTextViewMeasure15.visibility = View.VISIBLE
            binding.mTextViewIngredient15.text = currentDrink.ingredient15
            binding.mTextViewMeasure15.text = currentDrink.measure15
        }



    }

}