package com.nowiczenkoandrzej.e_bazarek.extensions

import android.content.Context
import android.content.Intent
import android.view.View
import android.view.animation.AlphaAnimation
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.nowiczenkoandrzej.e_bazarek.presentation.activities.ContentActivity

fun Fragment.startApp(context: Context){
    Intent(context, ContentActivity::class.java).apply {
        flags = (Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CL