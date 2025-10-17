package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView tvName, tvEmail, tvPhone;
    private Button btnBack, btnEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Ánh xạ các view từ layout
        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhone = findViewById(R.id.tvPhone);
        btnBack = findViewById(R.id.btnBack);
        btnEdit = findViewById(R.id.btnEdit);

        // Lấy dữ liệu từ Intent
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("name", "Không có dữ liệu");
            String email = bundle.getString("email", "Không có dữ liệu");
            String phone = bundle.getString("phone", "Không có dữ liệu");

            // Hiển thị dữ liệu lên TextView
            tvName.setText("Tên: " + name);
            tvEmail.setText("Email: " + email);
            tvPhone.setText("Số điện thoại: " + phone);
        }

        // Nút quay lại màn hình 1
        btnBack.setOnClickListener(v -> {
            finish(); // Đóng activity hiện tại
        });

        // Nút chỉnh sửa (quay lại màn hình 1)
        btnEdit.setOnClickListener(v -> {
            finish();
        });
    }
}