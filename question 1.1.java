package com.google; //questin 1.1


import java.util.Scanner;

public class Person {
    private String name;
    private int age =18 ;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void display(){
        System.out.println("person detail:Name = " +name +", Age = "+age);
    }
    public static void main(String[]arr){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter you name");
        String name= scanner.nextLine();
        System.out.println("please enter your age");
        int age = scanner.nextInt();
        Person person=new Person(name,age);
        person.display();

        scanner.close();
    }
}
