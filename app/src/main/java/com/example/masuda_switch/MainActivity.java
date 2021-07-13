package com.example.masuda_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setMainScreen();
    }

    private void setMainScreen(){
        setContentView(R.layout.activity_main);

        Button start_button = findViewById(R.id.start_button);
        start_button.setOnClickListener(v -> setGameScreen());
    }

    private void setGameScreen(){
        setContentView(R.layout.activity_game);

        Button exit_button = findViewById(R.id.exit_button);
        exit_button.setOnClickListener(v -> setMainScreen());

        Button pc_screen = findViewById(R.id.pc_screen);
        pc_screen.setOnClickListener(v -> setPCScreen());
    }

    private void setPCScreen(){
        setContentView(R.layout.activity_game_pc);

        Button close_button = findViewById(R.id.close_button);
        close_button.setOnClickListener(v -> setGameScreen());
    }
}