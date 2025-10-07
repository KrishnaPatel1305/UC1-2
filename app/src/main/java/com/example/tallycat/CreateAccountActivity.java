package com.example.tallycat;

import android.content.Intent; // Make sure this is imported
import android.os.Bundle;
import android.view.View;
import android.widget.TextView; // Make sure this is imported
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        // --- Start of New Code to Add ---

        // 1. Find the TextView by its ID from the layout
        TextView loginLink = findViewById(R.id.loginLink);

        // 2. Set an OnClickListener to handle clicks
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 3. Create an Intent to open MainActivity
                Intent intent = new Intent(CreateAccountActivity.this, MainActivity.class);

                // Optional: Clear the activity stack
                // This makes it so the user can't press the "back" button to return to the create account page.
                // It's good practice for login/logout flows.
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);

                startActivity(intent);
            }
        });

        // --- End of New Code to Add ---
    }
}
