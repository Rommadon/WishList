package com.example.gdrom.wishlist;

import com.example.gdrom.wishlist.data.WishList;

/**
 * Created by gdrom on 6/4/2017 AD.
 */

public class WishListPresenter {

    public WishListView wishListView;
    private WishList wishList;


    public WishListPresenter(WishList w , WishListView v){
        wishList = w;
        wishListView = v;
    }
}
