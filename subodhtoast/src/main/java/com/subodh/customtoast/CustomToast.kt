package com.subodh.customtoast

import android.app.Activity
import android.app.Application
import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

import com.android.subodhtoast.R

public class CustomToast(context: Context) : Toast(context) {
   public companion object {

       public var SUCCESS = 1
       public var WARNING = 2
       public var ERROR = 3
       public var INFO = 4
       public var DEFAULT = 5
       public var CONFUSING = 6

       public fun makeText(
            context: Context,
            message: String,
            duration: Int,
            type: Int
        ): Toast {
            val toast = Toast(context)
            toast.duration = duration
            val layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null, false)
            val l1 = layout.findViewById<View>(R.id.toast_text) as TextView
            val linearLayout = layout.findViewById<View>(R.id.toast_type) as LinearLayout
            val img = layout.findViewById<View>(R.id.toast_icon) as ImageView
            l1.text = message
            when (type) {
                1 -> {
                    linearLayout.setBackgroundResource(R.drawable.success_toast_shape)
                    img.setImageResource(R.drawable.tick)
                }
                2 -> {
                    linearLayout.setBackgroundResource(R.drawable.warning_toast_shape)
                    img.setImageResource(R.drawable.danger)
                }
                3 -> {
                    linearLayout.setBackgroundResource(R.drawable.error_toast_shape)
                    img.setImageResource(R.drawable.close)
                }
                4 -> {
                    linearLayout.setBackgroundResource(R.drawable.info_toast_shape)
                    img.setImageResource(R.drawable.information)
                }
                5 -> {
                    linearLayout.setBackgroundResource(R.drawable.default_shape)
                    img.visibility = View.GONE
                }
                6 -> {
                    linearLayout.setBackgroundResource(R.drawable.confusing_toast_shape)
                    img.setImageResource(R.drawable.confused)
                }
            }
            toast.view = layout
            return toast
        }


       public fun makeText(
            context: Context,
            message: String,
            duration: Int,
            type: Int,
            ImageResource: Int,
            androidIcon: Boolean
        ): Toast {
            val toast = Toast(context)
           toast.duration = duration
            val layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null, false)
            val l1 = layout.findViewById<View>(R.id.toast_text) as TextView
            val linearLayout = layout.findViewById<View>(R.id.toast_type) as LinearLayout
            val img = layout.findViewById<View>(R.id.toast_icon) as ImageView
            l1.text = message
            img.setImageResource(ImageResource)
            when (type) {
                1 -> linearLayout.setBackgroundResource(R.drawable.success_toast_shape)
                2 -> linearLayout.setBackgroundResource(R.drawable.warning_toast_shape)
                3 -> linearLayout.setBackgroundResource(R.drawable.error_toast_shape)
                4 -> linearLayout.setBackgroundResource(R.drawable.info_toast_shape)
                5 -> {
                    linearLayout.setBackgroundResource(R.drawable.default_shape)
                    img.visibility = View.GONE
                }
                6 -> linearLayout.setBackgroundResource(R.drawable.confusing_toast_shape)
                else -> {
                    linearLayout.setBackgroundResource(R.drawable.default_shape)
                    img.visibility = View.GONE
                }
            }
            toast.view = layout
            return toast
        }
    }

}
