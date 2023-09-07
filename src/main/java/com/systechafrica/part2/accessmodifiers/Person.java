package com.systechafrica.part2.accessmodifiers;

public class Person {
    private String name;
    private String email;

    private boolean promoted;

    //setters and getters

    public boolean isPromoted() {
        return promoted;
    }

    public void setPromoted(boolean promoted) {
        this.promoted = promoted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person (String name,String email){
        this.name = name;
        this.email = email;
    }

    public Person(){
        
    }

    public void printPersonnalDetails(){
        System.out.println(getPersonnalDetails());
    }
    
    private String getPersonnalDetails(){
        return email + " "+ name;
    }

    
}
