package com.example.uzuriky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView mens_tShirts, kids_tShirts, female_Dresses;
    private ImageView female_Shoes, mens_Shoes, kids_Shoes;
    private ImageView female_Sandals, mens_Sandals, kids_Sandals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        mens_tShirts = (ImageView) findViewById(R.id.mens_t_shirts);
        kids_tShirts = (ImageView) findViewById(R.id.kids_t_shirts);
        female_Dresses = (ImageView) findViewById(R.id.female_dresses);

        female_Shoes = (ImageView) findViewById(R.id.shoes_for_women);
        mens_Shoes = (ImageView) findViewById(R.id.shoes_for_men);
        kids_Shoes = (ImageView) findViewById(R.id.shoes_for_kids);

        female_Sandals = (ImageView) findViewById(R.id.sandals_for_women);
        mens_Sandals = (ImageView) findViewById(R.id.sandals_for_men);
        kids_Sandals = (ImageView) findViewById(R.id.sandals_for_kids);

        mens_tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Men's tShirts");
                startActivity(intent);
            }
        });

        kids_tShirts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Kids tShirts");
                startActivity(intent);
            }
        });

        female_Dresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Female Dresses");
                startActivity(intent);
            }
        });

        female_Shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Female Shoes");
                startActivity(intent);
            }
        });

        mens_Shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Men's Shoes");
                startActivity(intent);
            }
        });

        kids_Shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Kids Shoes");
                startActivity(intent);
            }
        });

        female_Sandals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Female Sandals");
                startActivity(intent);
            }
        });

        mens_Sandals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Men's Sandals");
                startActivity(intent);
            }
        });

        kids_Sandals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Kids Sandals");
                startActivity(intent);
            }
        });


    }
}
