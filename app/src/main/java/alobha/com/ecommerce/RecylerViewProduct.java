package alobha.com.ecommerce;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import alobha.com.ecommerce.Adapter.ProductAdapter;

/**
 * Created by Dell on 5/25/2018.
 */

public class RecylerViewProduct  extends AppCompatActivity {
    private List<Productlist> productlist;
    private RecyclerView recyclerView;
    private ProductAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    SearchView searchView;
    ImageView dash1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerlayout);
      //  searchView = (SearchView) findViewById(R.id.search);
      // searchView.setOnQueryTextListener((SearchView.OnQueryTextListener) this);
        recyclerView = (RecyclerView) findViewById(R.id.Recylerview);
        dash1 = (ImageView)findViewById(R.id.dash1);
        dash1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(RecylerViewProduct.this,Navigation.class);
                startActivity(intent);
            }
        });
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        productlist = new ArrayList<Productlist>();
        for (int i = 0; i < ProductData.nameArray.length; i++) {
            productlist.add(new Productlist(
                     ProductData.nameArray[i],
                    ProductData.drawableArray[i]
            ));
        }

        mAdapter = new ProductAdapter((ArrayList<Productlist>) productlist);
        recyclerView.setAdapter(mAdapter);


    }
}