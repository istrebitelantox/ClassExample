package Object;

import org.w3c.dom.ls.LSOutput;

public class ObjectExample {
    public static void main(String[] args) {

        Person kate = new Person("Юрий");
        System.out.println(kate.getName());
        changeName(kate);
        System.out.println(kate.getName());

        Person2 yuri=new Person2("Юрий");
        System.out.println(yuri.getName());
        changePerson(yuri);
        System.out.println(kate.getName());
    }
    static void changePerson(Person2 p){
        p=new Person2("Yurencio");
        p.setName("Ann");
    }
    static void changeName(Person p){
        p.setName("Yurencio");
    }
}
class Person{

    private String name;

    Person(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){

        return this.name;
    }
}

class Person2{

    private String name;

    Person2(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
