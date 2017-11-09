package com.example.jiayuanfa.dialogtest;

import android.content.Context;
import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;  // 这个库的Dialog通用
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        showDialog("I'm Dialog");

        context = this;
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Util.showToast(context,"T'm a toast");
            }
        });

        showSnackBar("I'm a snackBar");
    }

    /**
     * Dialog的用法
     * 注意：import android.support.v7.app.AlertDialog 这个包可以兼容所有版本的弹窗效果
     * @param content
     */
    private void showDialog(String content){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Title")
                .setMessage(content)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .show();
    }

    /**
     * 下方弹出一个SnackBar
     * @param content
     */
    private void showSnackBar(String content) {
        Snackbar.make(button, content,Snackbar.LENGTH_LONG)
                .setAction("Undo", new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                    }
                })
                .show();
    }
}
