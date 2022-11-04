package com.company.dsa.pactice;
class player{
    int id;
    int age;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class video {
    public static void main(String[] args) {
        player umang = new player();
        umang.setAge(20);
        umang.setName("Umang sharma");
        umang.setId(1);
        for(int i=0;i<10;i++){
            System.out.println(umang.getAge());
            System.out.println(umang.getName());
        }
    }
}
