package com.nowiczenkoandrzej.e_bazarek.presentation.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.nowiczenkoandrzej.e_bazarek.utils.AccountState
import com.nowiczenkoandrzej.e_bazarek.databinding.FragmentLoginBinding
import com.nowic