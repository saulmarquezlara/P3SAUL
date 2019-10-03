package sml.edu.tesoem.tics.p3saul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent principal = new Intent(MainActivity.this, FrmPrincipalActivity.class);
               startActivity(principal);
               finish();
            }
        },4000);
    }
}
