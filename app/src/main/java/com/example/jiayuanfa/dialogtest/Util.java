package com.example.jiayuanfa.dialogtest;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by JiaYuanFa on 2017/11/9.
 * 工具类
 */

public class Util {

    public static Toast toast;

    /**
     * 封装一个Toast类，先判空，后弹出，避免按钮重复点击，造成重复显示的不好的用户体验
     * @param context
     * @param content
     */
    public static void showToast(Context context, String content) {
        if (toast == null) {
            toast = Toast.makeText(context,content,Toast.LENGTH_SHORT);
        }else {
            toast.setText(content);
        }
        toast.show();
    }
}
