package com.example.petshop.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.petshop.R;
import com.example.petshop.models.Product;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {
    ArrayList<Product> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        items = Product.getData();
    }
    @Override
    public void onResume() {
        super.onResume();
        Intent myIntent = getIntent();
        int _productId = myIntent.getIntExtra("productId", 1);
        refreshList(_productId);
    }
    public void refreshList(int _productId) {
        for(Product i : items) {
            if ( i.getId() == _productId ) {
                fill(i);
                return;
            }
        }
        Intent o = new Intent(ProductActivity.this, ProductlistActivity.class);
        o.putExtra("status", "error");
        startActivity(o);
        finish();
        return;
    }
    public void fill(Product productObject) {
        TextView name = (TextView)findViewById(R.id.textViewName);
        TextView Description = (TextView)findViewById(R.id.textDescription);
        name .setText(productObject.getName());
        Description.setText(productObject.getDescription());
    }
}