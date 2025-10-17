package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText edtName, edtEmail, edtPhone;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các view từ layout
        edtName = findViewById(R.id.edtName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPhone = findViewById(R.id.edtPhone);
        btnNext = findViewById(R.id.btnNext);

        // Xử lý sự kiện click nút "Tiếp theo"
        btnNext.setOnClickListener(v -> {
            String name = edtName.getText().toString().trim();
            String email = edtEmail.getText().toString().trim();
            String phone = edtPhone.getText().toString().trim();

            // Kiểm tra dữ liệu không được để trống
            if (name.isEmpty() || email.isEmpty() || phone.isEmpty()) {
                Toast.makeText(MainActivity.this, "Vui lòng điền đầy đủ thông tin!",
                        Toast.LENGTH_SHORT).show();
                return;
            }

            // Tạo Intent để chuyển sang màn hình 2
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            // Truyền dữ liệu qua Bundle
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            bundle.putString("email", email);
            bundle.putString("phone", phone);
            intent.putExtras(bundle);

            startActivity(intent);
        });
    }
}