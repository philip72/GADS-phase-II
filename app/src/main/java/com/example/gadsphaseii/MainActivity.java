package com.example.gadsphaseii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar Leaderboard = findViewById(R.id.LEADERBOARD);
        setSupportActionBar(Leaderboard);
        button = findViewById(R.id.toolbar_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSubmittedActivity();
            }
        });

    }
    public void  openSubmittedActivity(){
        Intent intent = new Intent(this, SubmittedActivity.class);
        startActivity(intent);
    }
}