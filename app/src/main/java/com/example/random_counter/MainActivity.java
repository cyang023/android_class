package com.example.random_counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView header_text, number_result_text, user_guess_text, user_number_text, random_number_text, answer_response;
    EditText user_guess_input;
    Button guess_button;

    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guess_button = findViewById(R.id.guess);
        header_text = findViewById(R.id.textViewHeader);
        number_result_text = findViewById(R.id.numberResult);
        user_guess_text = findViewById(R.id.userGuessText);
        user_number_text = findViewById(R.id.userNumber);
        random_number_text = findViewById(R.id.randomNumber);
        user_guess_input = findViewById(R.id.userGuessInput);
        answer_response = findViewById(R.id.answer);

        guess_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                randomNumber = generateRandomNumber();
                int userGuess = Integer.parseInt(user_guess_input.getText().toString());

                random_number_text.setText(""+randomNumber);
                user_number_text.setText(""+userGuess);
                answer_response.setText(((randomNumber == userGuess) ? "You're Right!": "WRONG!"));


            }
        });
    }

    public int generateRandomNumber(){
        randomNumber = (int)Math.floor(Math.random() * (10 -1 +1) + 1);
        return randomNumber;
    };


}