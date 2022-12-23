package Inheritance;

public class InheritanceExampleClass {
    public static void main(String[] args){
        Person yuri=new Person("Юрий");
        yuri.display();
        Person kolya=new Person("Коля");
        kolya.display();

        Employee1 petya=new Employee1("Петя","Microsoft");
        petya.display();
        petya.work();

        Employee2 vasya=new Employee2("Вася", "Microsoft");
        vasya.display();

        Person3 andry=new Person3("Андрей");
        andry.display();
        Person3 anton=new Employee3("Антон","Oracle");
        anton.display();
    }
}
class Person{
    String name;
    public String getName(){return name;}
    public Person(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Имя: " + name);
    }
}
class Employee extends Person{
    public Employee(String name){
        super(name);
    }
}
class Person1{
    String name;

    public String getName() {
        return name;
    }
    public Person1(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Имя: "+ name);
    }
}
class Employee1 extends Person1{
    String company;
    public Employee1(String name, String company){
        super(name);
        this.company=company;
    }
    public void work(){
        System.out.printf("%s работает в %s \n",getName(),company);
    }
}
class Person2 {

    String name;
    public String getName(){ return name; }

    public Person2(String name){

        this.name=name;
    }

    public void display(){

        System.out.println("Name: " + name);
    }
}
class Employee2 extends Person2{
    String company;
    public Employee2(String name, String company){
        super(name);
        this.company=company;
    }
    @Override
    public void display(){
        super.display();
        System.out.printf("Работает в %s \n", company);
    }
}
class Person3 {

    String name;

    public String getName() { return name; }

    public Person3(String name){

        this.name=name;
    }

    public void display(){

        System.out.printf("Человек %s \n", name);
    }
}

class Employee3 extends Person3{

    String company;

    public Employee3(String name, String company) {

        super(name);
        this.company = company;
    }
    @Override
    public void display(){

        System.out.printf("Рабочий %s работает в %s \n", super.getName(), company);
    }
}