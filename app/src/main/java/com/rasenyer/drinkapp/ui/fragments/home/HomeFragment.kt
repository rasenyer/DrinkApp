package com.rasenyer.drinkapp.ui.fragments.home

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProvider
import com.rasenyer.drinkapp.R
import com.rasenyer.drinkapp.data.remote.models.Drink
import com.rasenyer.drinkapp.databinding.FragmentHomeBinding
import com.rasenyer.drinkapp.ui.fragments.home.adapter.DrinkAdapter

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var drinkAdapter: DrinkAdapter

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        drinkAdapter = DrinkAdapter()

    }

    override fun onResume() {
        super.onResume()

        val drinksNames = resources.getStringArray(R.array.drink_names)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.text_view, drinksNames)
        binding.mAutoCompleteTextViewDrinkName.setAdapter(arrayAdapter)

        binding.mAutoCompleteTextViewDrinkName.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable?) {
                getDrinksByName(binding.mAutoCompleteTextViewDrinkName.text.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

        })

        getDrinksByName(binding.mAutoCompleteTextViewDrinkName.text.toString())

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun getDrinksByName(name: String?) {

        homeViewModel.getDrinksByName(name)
        observeDrinks()
        setUpRecyclerView()

    }

    private fun observeDrinks() {

        homeViewModel.observeDrinks().observe(viewLifecycleOwner) {
            drinkAdapter.setDrinks(it as ArrayList<Drink>)
        }

    }

    private fun setUpRecyclerView() {

        binding.mRecyclerView.apply {
            adapter = drinkAdapter
        }

    }

}