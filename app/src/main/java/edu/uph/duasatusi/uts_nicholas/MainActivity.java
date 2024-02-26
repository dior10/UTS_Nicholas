package edu.uph.duasatusi.uts_nicholas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button1 LinearLayout by its ID
        LinearLayout button1 = findViewById(R.id.linear1);

        // Set an OnClickListener on button1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to MainActivity2
                Intent intent = new Intent(MainActivity.this, History.class);

                // Start the MainActivity2 activity
                startActivity(intent);
            }
        });

        // Find the button3 LinearLayout by its ID
        LinearLayout button3 = findViewById(R.id.linear2);

        // Set an OnClickListener on button3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to MainActivity3

                Intent intent = new Intent(MainActivity.this, ProfilMahasiswa.class);

                // Start the MainActivity3 activity
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == requestCode && resultCode == RESULT_OK && data != null) {
            String studentID = data.getStringExtra("studentID");
            String name = data.getStringExtra("name");
            String major = data.getStringExtra("major");
            String year = data.getStringExtra("year");
            String status = data.getStringExtra("status");
            String campus = data.getStringExtra("campus");

            String message = "Student ID: " + studentID + "\n" +
                    "Name: " + name + "\n" +
                    "Major: " + major + "\n" +
                    "Year: " + year + "\n" +
                    "Status: " + status + "\n" +
                    "Campus: " + campus;

            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }
}