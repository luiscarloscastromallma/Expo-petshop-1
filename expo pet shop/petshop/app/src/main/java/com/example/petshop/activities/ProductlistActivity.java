package com.example.petshop.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.petshop.R;
import com.example.petshop.adapters.ProductItemAdapters;
import com.example.petshop.generals.Settings;
import com.example.petshop.models.Product;

import java.util.ArrayList;

public class ProductlistActivity extends AppCompatActivity {
    ListView listViewProducts;
    ProductItemAdapters itemsAdapter;
    ArrayList<Product> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productlist);

        listViewProducts = (ListView) findViewById(R.id.listaProducto);

        items = new ArrayList<>();
        items = Product.getData();

        itemsAdapter =
                new ProductItemAdapters(this, items);

        listViewProducts.setAdapter(itemsAdapter) ;
        listViewProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
                Toast.makeText(getApplicationContext(),"a continuación el producto",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void selectProduct(int position) {
        Product selItem = items.get(position);

        if ( selItem != null ) {
            Intent o = new Intent(ProductlistActivity.this, ProductActivity.class);
            o.putExtra("productId", selItem.getId());

            startActivity(o);
            Log.d(Settings.DEBUG, "La aplicacion dijo: " + selItem.getName());
        }
    }
}
