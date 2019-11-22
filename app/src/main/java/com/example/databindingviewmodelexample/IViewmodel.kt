package com.example.databindingviewmodelexample

import android.view.View
import androidx.databinding.ObservableField

interface IViewmodel {
    val title: ObservableField<String>
    val body: ObservableField<String>
    val buttonText: ObservableField<String>
    fun onClick(view: View? = null)
}