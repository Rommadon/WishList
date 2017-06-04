package com.example.gdrom.wishlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.gdrom.wishlist.data.WishList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements WishListView {

    WishListPresenter presenter = null;
    public ArrayList<WishList> wishList = new ArrayList<WishList>();
    private ArrayAdapter<WishList> wishListArrayAdapter;
    EditText cost,title,detail,titleStatus,search;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        cost = (EditText) findViewById(R.id.cost);
        search = (EditText) findViewById(R.id.search);
        title=(EditText) findViewById(R.id.title);
        titleStatus=(EditText) findViewById(R.id.titleStatus);
        detail= (EditText) findViewById(R.id.detail);
        if (presenter == null) {

            presenter = new WishListPresenter(wishList, this);
        }
        showListView(wishList);


    }


    public void showListView(ArrayList<WishList> w) {
        wishListArrayAdapter = new ArrayAdapter<WishList>(this, android.R.layout.simple_list_item_1, w);

        lv.setAdapter(wishListArrayAdapter);
    }


    public void addWishList(View view) {
        int c = Integer.parseInt(cost.getText().toString());
        String d = detail.getText().toString();
        String s = "incomplete";
        String t = title.getText().toString();

        presenter.addWishList(c,d,s,t);

    }

    public void changeStatus(View view){

        String t = titleStatus.getText().toString();

        presenter.changeStatus(t);
        showListView(wishList);
    }

    public  void searchWishList(View view){
            String s = search.getText().toString();

        presenter.searchWishList(s);


    }
}


