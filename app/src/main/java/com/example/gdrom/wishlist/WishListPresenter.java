package com.example.gdrom.wishlist;

import com.example.gdrom.wishlist.data.WishList;

import java.util.ArrayList;

/**
 * Created by gdrom on 6/4/2017 AD.
 */

public class WishListPresenter {

    public WishListView wishListView;
    private ArrayList<WishList> wishList;
    private ArrayList<WishList> searchWishList = new ArrayList<WishList>();




    public WishListPresenter(ArrayList<WishList> w , WishListView v){
        wishList = w;
        wishListView = v;
    }

    public void addWishList(int c,String d,String s,String t) {
        wishList.add(new WishList(c,d,s,t));
    }


    public void changeStatus(String t) {
        for(int i=0;i<wishList.size();i++){
            if(t.equals(wishList.get(i).getTitle())){
                if(wishList.get(i).getStatus().equals("incomplete")) {
                    wishList.get(i).setStatus("complete");
                }else {
                    wishList.get(i).setStatus("incomplete");
                }

            }
        }
    }

    public void searchWishList(String s) {

        searchWishList.clear();



        for(int i=0 ;i<wishList.size();i++){
            if(wishList.get(i).getTitle().contains(s)){
                searchWishList.add(wishList.get(i));

            }
        }
    }

    public ArrayList<WishList> getSearchWishList() {
        return searchWishList;
    }
}
