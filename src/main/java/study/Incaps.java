package study;

public class Incaaps {
    public static void main(String[] args){
        Person2 yuri=new Person2("Юрий",19);
        System.out.println(yuri.getAge());
        yuri.setAge(23);
        System.out.println(yuri.getAge());
        yuri.setAge(123123);
        System.out.println(yuri.getAge());
    }
}
class Person2{
    private String name;
    private int age=1;

    public Person2(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age>0 && age<110)
            this.age = age;
    }
}