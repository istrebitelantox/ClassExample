package study;

import static java.lang.System.*;
public class Program {
    public static void main(String[] args){
        Person yuri =new Person("Yuri",19);
        yuri.displayInfo();
    }
}
class Person{
    String name;
    int age;
    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void displayInfo(){
        out.printf("Имя: %s \t Возраст: %d \n", name, age);
    }
}