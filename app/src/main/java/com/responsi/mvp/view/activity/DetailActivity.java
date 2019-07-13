package com.responsi.mvp.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.responsi.mvp.R;

public class DetailActivity extends AppCompatActivity implements DetailView{

    private Intent i;
    private String nama, phone, gbr, email,  gender;
    private TextView tvNama, tvPhone, tvEmail, tvAlmt, tvGender;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getData();
        findView();
        setData();
    }

    private void setData() {
        tvNama.setText(nama);
        tvPhone.setText(phone);
        tvEmail.setText(nama);
        tvGender.setText(nama);
    }

    private void findView() {
        tvNama = findViewById(R.id.tvDetailNama);
        tvPhone = findViewById(R.id.tvDetailPhone);
        tvEmail = findViewById(R.id.tvDetailEmail);
        tvGender = findViewById(R.id.tvDetailGender);
        img = findViewById(R.id.imgDetail);
    }

    private void getData() {
        i = getIntent();
        nama = i.getStringExtra("nama");
        phone = i.getStringExtra("phone");
        gbr = i.getStringExtra("gbr");
        email = i.getStringExtra("email");
        gender = i.getStringExtra("gender");
    }

    @Override
    public void setImg(String img) {

    }
}
