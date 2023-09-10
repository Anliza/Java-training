package com.systechafrica.pos;


public class Items {
    int itemCode;
    int quantity;
    double unitPrice;
    double total;

    public Items(int itemCode, int quantity, double unitPrice, double total) {
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.total = total;
    
    }

    public Items(){

    }
    
}

