package org.example;

public class Main {
    public static void main(String[] args) {
        Person undef=new Person();
        undef.displayInfo();

        Person yura = new Person("Юра");
        yura.displayInfo();

        Person kolya=new Person("Коля",21);
        kolya.displayInfo();
    }
}
class Person {

    String name;
    int age;
    {
        name = "Неопределёно";
        age=19;
    }
    Person()
    {

    }
    Person(String name)
    {
        this.name=name;

    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayInfo(){
        System.out.printf("Имя: %s \tВозраст: %d\n", name, age);
    }
}