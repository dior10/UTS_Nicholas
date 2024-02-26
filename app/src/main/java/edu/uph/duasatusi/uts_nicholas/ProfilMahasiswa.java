package edu.uph.duasatusi.uts_nicholas;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ProfilMahasiswa extends AppCompatActivity {

    private EditText editTextStudentID;
    private EditText editTextNama;
    private EditText editTextJurusan;
    private EditText editTextTahunMasuk;
    private EditText editTextKampus;
    private EditText editTextStatusMahasiswa;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_mahasiswa);

        // Inisialisasi elemen UI
        editTextStudentID = findViewById(R.id.editTextText);
        editTextNama = findViewById(R.id.editTextText2);
        editTextJurusan = findViewById(R.id.editTextText3);
        editTextTahunMasuk = findViewById(R.id.editTextText4);
        editTextKampus = findViewById(R.id.editTextText7);
        editTextStatusMahasiswa= findViewById(R.id.textView10);
        buttonSubmit = findViewById(R.id.button);

        // Menambahkan listener klik ke tombol Submit
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mendapatkan nilai dari EditText
                String studentID = editTextStudentID.getText().toString();
                String nama = editTextNama.getText().toString();
                String jurusan = editTextJurusan.getText().toString();
                String tahunMasuk = editTextTahunMasuk.getText().toString();
                String kampus = editTextKampus.getText().toString();
                String statusMahasiswa = editTextStatusMahasiswa.getText().toString();

                // Menampilkan pesan Toast
                String message = "Data mahasiswa:\n" +
                        "Student ID: " + studentID + "\n" +
                        "Nama: " + nama + "\n" +
                        "Jurusan: " + jurusan + "\n" +
                        "Tahun Masuk: " + tahunMasuk + "\n" +
                        "Kampus: " + kampus + "\n" +
                        "Status Mahasiswa: " + statusMahasiswa;
                showToast(message);
                // Create an Intent to navigate to MainActivity3
                Intent intent = new Intent(ProfilMahasiswa.this, MainActivity.class);

                // Start the MainActivity3 activity
                startActivity(intent);
            }
        });
    }

    // Metode untuk menampilkan pesan Toast
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}