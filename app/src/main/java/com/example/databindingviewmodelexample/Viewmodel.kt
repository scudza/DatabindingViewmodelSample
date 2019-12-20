package com.example.databindingviewmodelexample

import android.view.View
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class Viewmodel : ViewModel(), IViewmodel {

    var myInt = 0
    override val buttonText: ObservableField<String> = ObservableField("Click me")
    override val title: ObservableField<String> = ObservableField("Golly gosh, sunny shipmate.")
    override var body: ObservableField<String> = ObservableField(myInt.toString())

    override fun onClick(view: View?) {
        myInt++
        body.set(myInt.toString())
    }
}