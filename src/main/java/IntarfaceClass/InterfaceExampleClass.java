package IntarfaceClass;

public class InterfaceExampleClass {
    public static void main(String[] args) {

        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
        b1.print();

        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
        printable.print();
        printable = new Journal("Foreign Policy");
        printable.print();

        Calculatable c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 4));

        WaterPipe pipe = new WaterPipe();
        pipe.printState(1);

        Printable printable1 = createPrintable("Foreign Affairs",false);
        printable1.print();

        read(new Book("Java for impatients", "Cay Horstmann"));
        read(new Journal("Java Dayly News"));
    }
    static void read(Printable p){
        p.print();
    }
    static Printable createPrintable(String name, boolean option){
        if(option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);
    }
}
interface Printable{

    void print();
}
class Book implements Printable{

    String name;
    String author;

    Book(String name, String author){

        this.name = name;
        this.author = author;
    }

    public void print() {

        System.out.printf("%s (%s) \n", name, author);
    }
}
class Journal implements Printable {

    private String name;

    String getName(){
        return name;
    }

    Journal(String name){

        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}
class Calculation implements Calculatable{

}
interface Calculatable{

    default int sum(int a, int b){
        return sumAll(a, b);
    }
    default int sum(int a, int b, int c){
        return sumAll(a, b, c);
    }

    private int sumAll(int... values){
        int result = 0;
        for(int n : values){
            result += n;
        }
        return result;
    }
}
class WaterPipe implements Stateable{

    public void printState(int n){
        if(n==OPEN)
            System.out.println("Вода открыта");
        else if(n==CLOSED)
            System.out.println("Вода закрыта");
        else
            System.out.println("State is invalid");
    }
}
interface Stateable{

    int OPEN = 1;
    int CLOSED = 0;

    void printState(int n);
}
