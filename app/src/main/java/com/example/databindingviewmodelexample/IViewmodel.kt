package com.example.databindingviewmodelexample

import android.graphics.drawable.Drawable
import android.view.View

interface IViewmodel {
    val title: String
    val body: String
    val buttonText: String
    fun onClick(view: View? = null)
}