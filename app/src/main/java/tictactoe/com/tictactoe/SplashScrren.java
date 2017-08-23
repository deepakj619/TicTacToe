package tictactoe.com.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScrren extends AppCompatActivity {

    Thread splashTread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_scrren);
        splashTread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    while (waited < 3500) {
                        sleep(100);
                        waited += 100;
                    }
                    Intent intent = new Intent(SplashScrren.this,
                            SelectionScreen.class);
                    startActivity(intent);
                    SplashScrren.this.finish();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
                    SplashScrren.this.finish();
                }

            }
        };
        splashTread.start();
    }

}