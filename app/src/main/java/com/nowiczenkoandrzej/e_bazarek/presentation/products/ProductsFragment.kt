package com.nowiczenkoandrzej.e_bazarek.presentation.products

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nowiczenkoandrzej.e_bazarek.R
import com.nowiczenkoandrzej.e_bazarek.data.models.ProductResponse
import com.nowiczenkoandrzej.e_bazarek.databinding.FragmentProductsBinding
import com.nowiczenkoandrzej.e_bazarek.extensions.hide
import com.nowiczenkoandrzej.e_bazarek.extensions.quickToast
import com.nowiczenkoandrzej.e_bazarek.extensions.show
import com.nowiczenkoandrzej.e_bazarek.utils.DataState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect

@AndroidEntryPoint
class ProductsFragment : Fragment() {

    private latei