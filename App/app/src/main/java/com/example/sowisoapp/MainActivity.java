package com.example.sowisoapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make full transparent statusBar
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                findViewById(R.id.logo).animate().y(100f).scaleX(.5f).scaleY(.5f).setInterpolator(new LinearOutSlowInInterpolator());
                findViewById(R.id.container1).setVisibility(View.VISIBLE);
                findViewById(R.id.container1).animate().alpha(1).setInterpolator(new LinearOutSlowInInterpolator());
                findViewById(R.id.CreateAccountButton).setVisibility(View.VISIBLE);
                findViewById(R.id.CreateAccountButton).animate().alpha(1).setInterpolator(new LinearOutSlowInInterpolator());
                findViewById(R.id.SignInButton).setVisibility(View.VISIBLE);
                findViewById(R.id.SignInButton).animate().alpha(1).setInterpolator(new LinearOutSlowInInterpolator());
//                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.go_up);
//                findViewById(R.id.logo).startAnimation(animation);
            }

        }, 1000); // 1s delay

        goToCreateAccount();

    }

    public static void setWindowFlag(Activity activity, final int bits, boolean on) {
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

    private void goToCreateAccount() {
        Button toCreateAccountButton = (Button)findViewById(R.id.CreateAccountButton);
        toCreateAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Create_Account.class));
            }
        });
    }
}
