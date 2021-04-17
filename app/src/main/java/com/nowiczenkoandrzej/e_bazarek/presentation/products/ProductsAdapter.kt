package com.nowiczenkoandrzej.e_bazarek.presentation.products

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nowiczenkoandrzej.e_bazarek.R
import com.nowiczenkoandrzej.e_bazarek.data.models.ProductResponse

class ProductsAdapter(): RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {

    private val products = ArrayList<ProductResponse>()

    fun setProducts(list: List<ProductResponse>){
        products.clear()
        products.addAll(list)
        notifyData