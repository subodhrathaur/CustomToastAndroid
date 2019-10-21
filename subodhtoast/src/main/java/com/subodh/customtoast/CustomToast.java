package com.subodh.customtoast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.subodhtoast.R;

public class CustomToast extends Toast {
    public static int SUCCESS = 1;
    public static int WARNING = 2;
    public static int ERROR = 3;
    public static int INFO = 4;
    public static int DEFAULT = 5;
    public static int CONFUSING = 6;

    public CustomToast(Context context) {
        super(context);
    }

    public static Toast makeText(Context context, String message, int duration, int type) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null, false);
        TextView msg = (TextView) layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout = (LinearLayout) layout.findViewById(R.id.toast_type);
        ImageView img = (ImageView) layout.findViewById(R.id.toast_icon);
        msg.setText(message);
        switch (type) {
            case 1:
                linearLayout.setBackgroundResource(R.drawable.success_toast_shape);
                img.setImageResource(R.drawable.tick);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.warning_toast_shape);
                img.setImageResource(R.drawable.danger);
                break;
            case 3:
                linearLayout.setBackgroundResource(R.drawable.error_toast_shape);
                img.setImageResource(R.drawable.close);
                break;
            case 4:
                linearLayout.setBackgroundResource(R.drawable.info_toast_shape);
                img.setImageResource(R.drawable.information);
                break;
            case 5:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
                img.setVisibility(View.GONE);
                break;
            case 6:
                linearLayout.setBackgroundResource(R.drawable.confusing_toast_shape);
                img.setImageResource(R.drawable.confused);
                break;
        }
        toast.setView(layout);
        return toast;
    }
}