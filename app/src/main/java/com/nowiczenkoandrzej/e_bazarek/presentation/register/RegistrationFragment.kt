package com.nowiczenkoandrzej.e_bazarek.presentation.register

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.nowiczenkoandrzej.e_bazarek.utils.AccountState
import com.nowiczenkoandrzej.e_bazarek.databinding.FragmentRegistrationBinding
import com.nowiczenkoandrzej.e_bazarek.extensions.hide
import com.nowiczenkoandrzej.e_bazarek.extensions.quickToast
import com.nowiczenkoandrzej.e_bazarek.extensions.show
import com.nowiczenkoandrzej.e_bazarek.extensions.startApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegistrationFragment : Fragment() {

    private lateinit var binding: FragmentRegistrationBinding

    private val viewModel: RegistrationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedI