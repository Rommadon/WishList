package com.example.gdrom.wishlist.data;

import com.example.gdrom.wishlist.MainActivity;

/**
 * Created by gdrom on 6/4/2017 AD.
 */

public class WishList {
    public int cost,index;
    public String title,detail,status;
    private MainActivity m = new MainActivity();




    public WishList(int c , String  d, String s , String t){

        title = t;
        detail=d;
        status=s;
        cost =c;
    }



    public int getCost(){
        return cost;
    }


    public String getStatus(){
        return status;
    }

    public String getTitle(){
        return title;
    }

    public String geDetail(){
        return detail;
    }

    public void setStatus(String s) {
        this.status=s;
    }

    @Override
    public String toString() {
        return "TITLE : "+title + "   STATUS : " +status + "\nDETAIL : "+detail+"   COST : "+cost;
    }
}
