package com.systechafrica.pos;



import java.util.Scanner;

public class Table {
    Items buy = new Items(); 
    boolean itemed = false;
    int itemNumber = 1;
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Table table =new Table();
        table.items();
        table.listArray();
    
}

    public void items(){
       int noOfItems = 1;
       
        while(noOfItems >= 1){
            //Items buy = new Items(); //object is buy
            System.out.println("item: " + itemNumber);

            System.out.print("Enter Item Code: ");
            buy.itemCode = scanner.nextInt();
            System.out.print("Enter Quantity: ");
            buy.quantity = scanner.nextInt();
            System.out.print("Enter the Unit Price: ");
            buy.unitPrice = scanner.nextDouble();
            buy.total = buy.quantity*buy.unitPrice;
            System.out.println("Total value: " + buy.total);
            itemNumber ++;
            System.out.print("More items? Press any key for more items or N for no more item:-> ");
            String moreItems = scanner.next();
          //scanner.nextLine();
                if(moreItems.equalsIgnoreCase("N")){
                    break;
                }
            }
            noOfItems++;
            System.out.println(noOfItems);
            
            
    }

    public void listArray(){
        System.out.print("Item Code  "+ "Quantity  "+ " Unit Price   "+ "Total Value");
        System.out.println();
        for (int i = 1; i<=itemNumber; i++) {
            Items buy = new Items(i, i, i, i);
            System.out.println("   " + buy.itemCode+"         " + buy.quantity+ "          " + buy.unitPrice+ "          " + buy.total);
        }
        
        System.out.println("********************************");
      

}
}
