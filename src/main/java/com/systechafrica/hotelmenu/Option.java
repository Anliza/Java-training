package com.systechafrica.hotelmenu;

public class Options {
  
    private String option;
    private int price;
    
    public Options(String option, int price) {
        this.option = option;
        this.price = price;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }


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
