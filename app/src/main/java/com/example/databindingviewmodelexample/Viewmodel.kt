package com.example.databindingviewmodelexample

import android.view.View
import androidx.lifecycle.ViewModel

class Viewmodel : ViewModel(), IViewmodel {
    override val buttonText: String = ""
    override val title: String = ""
    override val body: String = ""

    override fun onClick(view: View?) {

    }
}