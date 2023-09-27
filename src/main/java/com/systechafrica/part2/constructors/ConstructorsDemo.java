package com.systechafrica.part2.constructors;

public class ConstructorsDemo {
    
    public static void main(String[] args) {
        Book b1 = new Book(2011, "introduction", true);
        Book b2 = new Book(2011, "introduction", true);
        if(b1.equals(b2)){
            System.out.println("are equal");
        }else{
            System.out.println("not equal");
        }

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());

        
    }
}
