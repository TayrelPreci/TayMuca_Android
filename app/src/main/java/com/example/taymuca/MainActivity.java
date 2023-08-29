package com.example.taymuca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public Button BtnOds1, BtnOds2, BtnOds3, BtnMain;

        BtnOds1 = findViewById(R.id.BtnOds1);
        BtnOds1.setOnClickListener(new View.OnClickListener()) {
            @Override
                    public void OnClick(View View){
                Intent intent = new Intent(getApplicationContext(), ActivityOds1.class);
                startActivity(intent);
            }

        }


    }
}