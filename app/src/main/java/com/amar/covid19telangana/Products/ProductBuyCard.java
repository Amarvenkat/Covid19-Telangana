package com.amar.covid19telangana.Products;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.amar.covid19telangana.R;

public class ProductBuyCard extends AppCompatActivity {

    CardView msme,amazone,flipcart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_buy_card);

        msme = (CardView) findViewById(R.id.msmeproduct);
        amazone = (CardView)findViewById(R.id.amazon);
        flipcart = (CardView)findViewById(R.id.flipcart);

        msme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ProductBuyCard.this,OurProduct.class);
                startActivity(intent);

            }
        });

        amazone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ProductBuyCard.this,Amazon.class);
                startActivity(intent);

            }
        });

        flipcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductBuyCard.this,Flipcart.class);
                startActivity(intent);

            }
        });
    }
}
