package com.systechafrica.hotelmenu;

public class Options {
    String option;
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public Options(){

    }

    public void showOption(){
        System.out.println(option);
    }
    
}   	
