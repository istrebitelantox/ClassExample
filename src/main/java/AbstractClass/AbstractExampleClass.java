package AbstractClass;

public class AbstractExampleClass {
    public static void main(String[] args) {

        Employee yuri = new Employee("Юрий", "Leman Brothers");
        yuri.display();
        Client kolya = new Client("Коля", "Leman Brothers");
        kolya.display();
    }
}
abstract class Person {

    private String name;

    public String getName() { return name; }

    public Person(String name){

        this.name=name;
    }

    public abstract void display();
}

class Employee extends Person{

    private String bank;

    public Employee(String name, String company) {

        super(name);
        this.bank = company;
    }

    public void display(){
        System.out.printf("Имя работника: %s \t Банк: %s \n", super.getName(), bank);
    }
}

class Client extends Person
{
    private String bank;

    public Client(String name, String company) {

        super(name);
        this.bank = company;
    }

    public void display(){

        System.out.printf("Имя клиента: %s \t Банк: %s \n", super.getName(), bank);
    }
}
abstract class Figure{

    float x;
    float y;

    Figure(float x, float y){

        this.x=x;
        this.y=y;
    }
    public abstract float getPerimeter();
    public abstract float getArea();
}
class Rectangle extends Figure
{
    private float width;
    private float height;

    Rectangle(float x, float y, float width, float height){

        super(x,y);
        this.width = width;
        this.height = height;
    }

    public float getPerimeter(){

        return width * 2 + height * 2;
    }

    public float getArea(){

        return width * height;
    }
}
