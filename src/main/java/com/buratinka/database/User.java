package com.buratinka.database;

public class User {

    private int id;
    private int age;
    private String email;
    private String name;

    public User(){}

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{id: "+id+
                ", age: "+age+
                ", email: "+email+
                ", name: "+name+
                "}";
    }

    public User(int id, int age , String email, String name)
    {
        this.id = id;
        this.age = age;
        this.email = email;
        this.name = name;
    }

    public int getId(){return id;}
    public void setId(int id){this.id = id;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

}
