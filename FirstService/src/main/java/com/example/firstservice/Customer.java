package com.example.firstservice;

public class Customer {

    private String ID;
    private String name;
    private boolean sex;
    private int age;

    public Customer(){
//        this.ID = "";
//        this.name = null;
//        this.sex = false;
//        this.age = 0;
        setID("");
        setName(null);
        setSex("female");
        setAge(0);
    }
    public Customer(String ID, String n, String s, int a ){
        setID(ID);
        setName(n);
        setAge(a);
        setSex(s);
//        this.ID = ID;
//        this.name = n;
//        this.age = a;
//         if(s == "Male" || s == "male"){
//             this.sex = true;
//
//         }
//         else if(s == "Female" || s == "female"){
//             this.sex = false;
//         }

//         if(a < 0){
//             this.age = 0;
//         }

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex == "Male" || sex == "male"){
            this.sex = true;
        }
        else if(sex == "Female" || sex == "female"){
            this.sex = false;
        }
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age < 0){
            this.age = 0;
        }
    }

}
