package com.gautham.logic;

/**
 * Created by GauthamHemanth on 4/22/17.
 */
public class Triangle {

    private String type;

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void draw(){
        System.out.println(getType() + "  Triangle can be drawable");
    }


}
