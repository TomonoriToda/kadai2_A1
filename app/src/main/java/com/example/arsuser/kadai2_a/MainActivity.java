package com.example.arsuser.kadai2_a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener,GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener{
    // GestureDetectorインスタンス変数
    GestureDetector gestureDetector;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // GestureDetectorインスタンス作成
        gestureDetector = new GestureDetector(this, this);



    }


    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        // gestureDetector#onTouchEventメソッドでタッチイベントの判別・振り分けを行う
        gestureDetector.onTouchEvent(ev);

        return false;
    }




    @Override
    public boolean onTouch(View view, MotionEvent event) {
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Toast.makeText(getBaseContext(),"タップがされました。",Toast.LENGTH_SHORT).show();
        View v = findViewById(R.id.TextView1);
        ColorDrawable d = (ColorDrawable)v.getBackground();
        int color = Color.rgb(255, 0, 0);
        v.setBackgroundColor(color);
        TextView messeage;
        messeage = (TextView)this.findViewById(R.id.TextView1);
        messeage.setText("タップされましたYo!!");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        Toast.makeText(getBaseContext(),"ダブルタップがされました。",Toast.LENGTH_SHORT).show();
        View v = findViewById(R.id.TextView1);
        ColorDrawable d = (ColorDrawable)v.getBackground();
        int color = Color.rgb(0, 255, 0);
        v.setBackgroundColor(color);
        TextView messeage;
        messeage = (TextView)this.findViewById(R.id.TextView1);
        messeage.setText("ダブルタップされましたYo!!");
         return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        View v = findViewById(R.id.TextView1);
        ColorDrawable d = (ColorDrawable)v.getBackground();
        int color = d.getColor();
        color = Color.rgb(0, 0, 255);
        v.setBackgroundColor(color);
        TextView messeage;
        messeage = (TextView)this.findViewById(R.id.TextView1);
        messeage.setText("ロングプレスされたYo!!");
    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }
}
