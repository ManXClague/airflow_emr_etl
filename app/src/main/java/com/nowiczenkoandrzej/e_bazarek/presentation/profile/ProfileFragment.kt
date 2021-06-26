package com.nowiczenkoandrzej.e_bazarek.presentation.profile

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AlertDialog
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.nowiczenkoandrzej.e_bazarek.utils.DataState
import com.nowiczenkoandrzej.e_bazarek.R
import com.nowiczenkoandrzej.e_bazarek.data.models.UserResponse
import com.nowiczenkoandrzej.e_bazarek.databinding.FragmentProfileBinding
import com.nowiczenkoandrzej.e_bazarek.extensions.*
import com.nowiczenkoandrzej.e_bazarek.presentation.activities.LoginActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

@AndroidEntryPoint
class ProfileFragment : Fragment() {

    private lateinit