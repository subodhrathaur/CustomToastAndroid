package com.subodh.customtoast

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.android.subodhtoast.R

class CustomToast(context: Context?) : Toast(context) {
    companion object {
        var SUCCESS = 1
        var WARNING = 2
        var ERROR = 3
        var INFO = 4
        var DEFAULT = 5
        var CONFUSING = 6
        fun makeText(
            context: Context?,
            message: String?,
            duration: Int,
            type: Int
        ): Toast {
            val toast = Toast(context)
            toast.duration = duration
            val layout =
                LayoutInflater.from(context).inflate(R.layout.customtoast, null, false)
            val msg = layout.findViewById<View>(R.id.toast_text) as TextView
            val linearLayout =
                layout.findViewById<View>(R.id.toast_type) as LinearLayout
            val img =
                layout.findViewById<View>(R.id.toast_icon) as ImageView
            msg.text = message
            when (type) {
                1 -> {
                    linearLayout.setBackgroundResource(R.drawable.success_toast_shape)
                    img.setImageResource(R.drawable.ic_success)
                }
                2 -> {
                    linearLayout.setBackgroundResource(R.drawable.warning_toast_shape)
                    img.setImageResource(R.drawable.ic_warning)
                }
                3 -> {
                    linearLayout.setBackgroundResource(R.drawable.error_toast_shape)
                    img.setImageResource(R.drawable.ic_close)
                }
                4 -> {
                    linearLayout.setBackgroundResource(R.drawable.info_toast_shape)
                    img.setImageResource(R.drawable.ic_info)
                }
                5 -> {
                    linearLayout.setBackgroundResource(R.drawable.default_shape)
                    img.visibility = View.GONE
                }
                6 -> {
                    linearLayout.setBackgroundResource(R.drawable.confusing_toast_shape)
                    img.setImageResource(R.drawable.ic_confuse)
                }
            }
            toast.view = layout
            return toast
        }
    }
}