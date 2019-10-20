package com.subodh.customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun successtoast(view: View) {
    CustomToast.makeText(applicationContext,"Success",Toast.LENGTH_SHORT,CustomToast.SUCCESS).show()
    }
    fun warningtoast(view: View) {
        CustomToast.makeText(applicationContext,"Warning",Toast.LENGTH_SHORT,CustomToast.WARNING).show()
    }
    fun errortoast(view: View) {
        CustomToast.makeText(applicationContext,"Error",Toast.LENGTH_SHORT,CustomToast.ERROR).show()
    }
    fun infotoast(view: View) {
        CustomToast.makeText(applicationContext,"Info",Toast.LENGTH_SHORT,CustomToast.INFO).show()
    }
    fun defaulttoast(view: View) {
        CustomToast.makeText(applicationContext,"Defaullt",Toast.LENGTH_SHORT,CustomToast.DEFAULT).show()
    }
    fun confusingtoast(view: View) {
        CustomToast.makeText(applicationContext,"Confusing",Toast.LENGTH_SHORT,CustomToast.CONFUSING).show()
    }
}
