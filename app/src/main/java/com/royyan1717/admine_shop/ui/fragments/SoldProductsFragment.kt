package com.royyan1717.admine_shop.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.royyan1717.admine_shop.R

class SoldProductsFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    /*homeViewModel =
        ViewModelProviders.of(this).get(HomeViewModel::class.java)*/

    val root = inflater.inflate(R.layout.fragment_sold_products, container, false)
    val textView: TextView = root.findViewById(R.id.text_sold_products)
    textView.text = "This is sold products Fragment"

    /*homeViewModel.text.observe(viewLifecycleOwner, Observer {
        textView.text = it
    })*/

    return root
  }
  // END
}