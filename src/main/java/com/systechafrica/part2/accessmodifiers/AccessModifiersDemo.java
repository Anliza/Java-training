package com.systechafrica.part2.accessmodifiers;

//import com.systechafrica.part2.accessmodifiers.lms.Book;

public class AccessModifiersDemo {
    
    public static void main(String[] args) {
        Person person =new Person("Ann", "nna@gmail.com");
        //person.name = "Ann";
        person.setName ("Hanna");
        //person.email = "nna@gmail.com";
        person.setEmail ("Hanna@gmail.com");
        person.printPersonnalDetails();
        //person.getPersonnalDetails();
        person.getName();
    }

    public void accessDefault(){
        //Book book =new Book();
        //book.isbn = "46563258995445"; //?does not compile beacuse the properties and methods are using 
        //book.title = "Java programming";//?default access modifiers inside lms
        //book.printBookDetails();
    }
}
