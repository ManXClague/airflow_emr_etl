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

    private lateinit var binding: FragmentProfileBinding
    private lateinit var actionBarMenu: MenuItem

    private val viewModel: ProfileViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribeObserver()
        addMenu()
        setListeners()
    }


    private fun subscribeObserver(){
        lifecycleScope.launchWhenStarted {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                viewModel.userState.collect{ state ->
                    when(state){
                        is DataState.Success -> bindUserData(state.data!!)
                        is DataState.Loading -> displayUserLoading()
                        is DataState.Error -> displayUserError(state.message!!)
                    }
                }
            }
        }
    }

    private fun bindUserData(user: UserResponse){
        binding.userDataProgressBar.hide()
        binding.userContainer.show()
        if(user.image == ""){
            binding.ivAvatar.setImageResource(R.drawable.ic_baseline_default_avatar)
        }
        binding.tvName.text = user.name
        binding.tvEmail.text = user.email
        binding.tvRating.text = user.score.toString()

    }

    private fun displayUserLoading(){
        binding.userContainer.hide()
        binding.userDataProgressBar.show()
    }

    private fun displa