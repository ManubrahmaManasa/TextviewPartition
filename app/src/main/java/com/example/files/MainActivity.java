package com.example.files;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.myTextView);
        String fullText = "Block1 Block2";

        Spannable spannable = new SpannableString(fullText);

// Create a ClickableSpan for the first block
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                // Handle the click event for the first block
                Toast.makeText(getApplicationContext(), "Clicked block 1", Toast.LENGTH_SHORT).show();
            }
        };
        BackgroundColorSpan bgSpan1 = new BackgroundColorSpan(Color.RED);
        spannable.setSpan(clickableSpan1, 0, 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(bgSpan1, 0, 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

// Create a ClickableSpan for the second block
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View widget) {
                // Handle the click event for the second block
                Toast.makeText(getApplicationContext(), "Clicked block 2", Toast.LENGTH_SHORT).show();
            }
        };
        BackgroundColorSpan bgSpan2 = new BackgroundColorSpan(Color.BLUE);
        spannable.setSpan(clickableSpan2, 6, 13, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannable.setSpan(bgSpan2, 6, 13, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

// Set the clickable spannable to the TextView
        textView.setText(spannable);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}