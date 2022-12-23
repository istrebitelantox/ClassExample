package Static;


public class StaticMethods{

    public static void main(String[] args) {
        Person4 tom = new Person4();
        Person4 bob = new Person4();
        tom.displayId();
        bob.displayId();
        System.out.println(Person4.counter);
        Person4.counter = 8;
        Person4 sam = new Person4();
        sam.displayId();

        Person3 yuri = new Person3();
        Person3 kolya = new Person3();
        yuri.displayId();
        kolya.displayId();

        double radius = 60;
        System.out.printf("Radius: %f \n", radius);
        System.out.printf("Area: %f \n", Math.PI * radius);

        Person5.displayCounter();
        Person5 anry = new Person5();
        Person5 derek = new Person5();
        Person5.displayCounter();

        System.out.println(Operation.sum(45, 23));
        System.out.println(Operation.subtract(45, 23));
        System.out.println(Operation.multiply(4, 23));
    }
}
class Person3{

    private int id;
    static int counter;

    static{
        counter = 105;
        System.out.println("Статический инициализатор");
    }
    Person3(){
        id=counter++;
        System.out.println("Констурктор");
    }
    public void displayId(){
        System.out.printf("Id: %d \n", id);
    }
}
class Person4{

    private int id;
    static int counter=1;

    Person4(){
        id = counter++;
    }
    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}
class Math{
    public static final double PI = 3.14;
}
class Person5{

    private int id;
    private static int counter = 1;

    Person5(){
        id = counter++;
    }
    // статический метод
    public static void displayCounter(){

        System.out.printf("Counter: %d \n", counter);
    }
    public void displayId(){

        System.out.printf("Id: %d \n", id);
    }
}
class Operation{

    static int sum(int x, int y){
        return x + y;
    }
    static int subtract(int x, int y){
        return x - y;
    }
    static int multiply(int x, int y){
        return x * y;
    }
}