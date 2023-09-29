package com.systechafrica.assignments.hotelmenu;

public class Option {
  
    private String option;
    private int price;
    
    public Option(String option, int price) {
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
    
    public Option(){

    }


    public void showOption(){
        System.out.println(option);
    }
    
}   	
