package com.example.gdrom.wishlist;

import android.view.View;

import com.example.gdrom.wishlist.data.WishList;

import java.util.ArrayList;

/**
 * Created by gdrom on 6/4/2017 AD.
 */

public interface WishListView {
    void showListView(ArrayList<WishList> w) ;
    void searchWishList(View view);
    void changeStatus(View view);
    void addWishList(View view);


}
