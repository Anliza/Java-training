package com.systechafrica.stringandstringbuilder;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String regNo;
    private String address;
    private String nickname;

    public String getFullDetails(){
        StringBuilder sb = new StringBuilder();
        sb.append(firstName)
        .append("")
        .append(lastName)
        .append("")
        .append(email)
        .append("")
        .append(regNo)
        .append("")
        .append(address)
        .append("")
        .append(nickname)
        .append("");
        return sb.toString();
    }
}
