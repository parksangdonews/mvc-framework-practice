package com.ttp.mvcframework.order;


public class Cooking {

    public Cook makeCook(MenuItem menuItem) {
        return new Cook(menuItem);
    }

}
