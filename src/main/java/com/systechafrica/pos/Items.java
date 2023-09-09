package com.systechafrica.pos;


public class Items {
    int itemCode;
    int quantity;
    double unitPrice;
    double total;

    public Items(int itemCode,int quantity, double unitPrice, double total){
        this.total = total;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.itemCode = itemCode;
    }

    public Items(){

    }

    public void showDetails(){
        System.out.print("   " + itemCode+"         " + quantity+ "          " + unitPrice+ "          " + total);
        System.out.println();
    }
    
}

