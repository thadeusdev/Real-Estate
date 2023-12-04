package com.example.realestate.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.realestate.Adapter.ItemsAdapter;
import com.example.realestate.Domains.ItemsDomain;
import com.example.realestate.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular, adapterNew;
    private RecyclerView recyclerViewPopular, recyclerViewNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerview();
    }

    private void initRecyclerview() {
        ArrayList<ItemsDomain> ItemsArraylist=new ArrayList<>();

        ItemsArraylist.add(new ItemsDomain("House with a good view","San Francisco, CA 94110","This 2 bed /1 bath home boasts an enomous open-living plan, accented by striking architectural features and high-end finishes. Feel inspired by open sight lines that embrace the outdoors, crowned by stunning coffered ceilings.",2,1,841456,"pic1",true));
        ItemsArraylist.add(new ItemsDomain("House with a good view","San Francisco, CA 94110","This 2 bed /1 bath home boasts an enomous open-living plan, accented by striking architectural features and high-end finishes. Feel inspired by open sight lines that embrace the outdoors, crowned by stunning coffered ceilings.",3,1,654987,"pic2",false));
        ItemsArraylist.add(new ItemsDomain("House with a good view","San Francisco, CA 94110","This 2 bed /1 bath home boasts an enomous open-living plan, accented by striking architectural features and high-end finishes. Feel inspired by open sight lines that embrace the outdoors, crowned by stunning coffered ceilings.",3,1,841456,"pic1",true));

        recyclerViewPopular=findViewById(R.id.viewPopular);
        recyclerViewNew=findViewById(R.id.viewNew);

        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerViewNew.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterNew=new ItemsAdapter(this,ItemsArraylist);
        adapterPopular=new ItemsAdapter(this,ItemsArraylist);

        recyclerViewNew.setAdapter(adapterNew);
        recyclerViewPopular.setAdapter(adapterPopular);
    }
}