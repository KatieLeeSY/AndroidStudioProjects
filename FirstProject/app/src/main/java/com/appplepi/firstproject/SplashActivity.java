package com.appplepi.firstproject;

        import android.os.Bundle;
        import android.os.Handler;
        import android.os.Message;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler() {
            @Override
            public void handlerMessage(Message msg){
                finish();
            }
        };

        handler.sendEmptyMessageDelayed(0,3000)

        getSupportActionBar().hide();
    }
}