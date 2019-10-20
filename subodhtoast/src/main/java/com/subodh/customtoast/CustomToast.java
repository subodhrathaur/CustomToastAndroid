package com.subodh.customtoast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.subodhtoast.R;
import com.mr.canvas.R;

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

    public static Toast makeText(Context context, String message, int duration, int type/*, boolean androidIcon*/) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null, false);
        TextView l1 = (TextView) layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout = (LinearLayout) layout.findViewById(R.id.toast_type);
        ImageView img = (ImageView) layout.findViewById(R.id.toast_icon);
       // ImageView img1 = (ImageView) layout.findViewById(R.id.imageView4);
        l1.setText(message);
       /* if (androidIcon == true)
            img1.setVisibility(View.VISIBLE);
        else if (androidIcon == false)
            img1.setVisibility(View.GONE);*/
        switch (type) {
            case 1:
                linearLayout.setBackgroundResource(R.drawable.success_toast_shape);
                img.setImageResource(R.drawable.notepad);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.warning_toast_shape);
                img.setImageResource(R.drawable.notepad);
                break;
            case 3:
                linearLayout.setBackgroundResource(R.drawable.error_toast_shape);
                img.setImageResource(R.drawable.notepad);
                break;
            case 4:
                linearLayout.setBackgroundResource(R.drawable.info_toast_shape);
                img.setImageResource(R.drawable.notepad);
                break;
            case 5:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
                img.setVisibility(View.GONE);
                break;
            case 6:
                linearLayout.setBackgroundResource(R.drawable.confusing_toast_shape);
                img.setImageResource(R.drawable.notepad);
                break;
        }
        toast.setView(layout);
        return toast;
    }




    public static Toast makeText(Context context, String message, int duration, int type, int ImageResource, boolean androidIcon) {
        Toast toast = new Toast(context);
        View layout = LayoutInflater.from(context).inflate(R.layout.customtoast, null, false);
        TextView l1 = (TextView) layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout = (LinearLayout) layout.findViewById(R.id.toast_type);
        ImageView img = (ImageView) layout.findViewById(R.id.toast_icon);
        //ImageView img1 = (ImageView) layout.findViewById(R.id.imageView4);
        l1.setText(message);
        img.setImageResource(ImageResource);
       /* if (androidIcon == true)
            img1.setVisibility(View.VISIBLE);
        else if (androidIcon == false)
            img1.setVisibility(View.GONE);*/
        switch (type) {
            case 1:
                linearLayout.setBackgroundResource(R.drawable.success_toast_shape);
                break;
            case 2:
                linearLayout.setBackgroundResource(R.drawable.warning_toast_shape);
                break;
            case 3:
                linearLayout.setBackgroundResource(R.drawable.error_toast_shape);
                break;
            case 4:
                linearLayout.setBackgroundResource(R.drawable.info_toast_shape);
                break;
            case 5:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
                img.setVisibility(View.GONE);
                break;
            case 6:
                linearLayout.setBackgroundResource(R.drawable.confusing_toast_shape);
                break;
            default:
                linearLayout.setBackgroundResource(R.drawable.default_shape);
                img.setVisibility(View.GONE);
                break;
        }
        toast.setView(layout);
        return toast;
    }

}
