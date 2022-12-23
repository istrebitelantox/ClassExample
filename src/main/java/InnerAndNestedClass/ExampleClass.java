package InnerAndNestedClass;

public class ExampleClass {
    public static void main(String[] args){
        Person yuri=new Person("Юрий","qwerty");
        yuri.displayPerson();
        yuri.account.displayAccount();

        Person2 kolya=new Person2("Коля");
        kolya.setAccount("qwerty");

        Math.Factorial fact = Math.getFactorial(6);
        System.out.printf("Факториал числа %d равен %d \n", fact.getKey(), fact.getResult());
    }
}
class Person{
    private String name;
    Account account;
    Person(String name, String password){
        this.name=name;
        account=new Account(password);
    }
    public void displayPerson(){
        System.out.printf("Person \t Name: %s \t Password: %s \n", name,account.password);
    }
    public class Account{
        private String password;
        Account(String pass){
            this.password=pass;
        }
        void displayAccount(){
            System.out.printf("Account Login: %s \t Password: %s \n", Person.this.name,password);
        }
    }
}
class Person2{
    private String name;

    Person2(String name){
        this.name=name;
    }
    public void setAccount(String password){
        class Account{
            void display(){
                System.out.printf("Account Login: %s \t Password: %s \n", name, password);
            }
        }
        Account account=new Account();
        account.display();
    }
}
class Math{
    public static class Factorial{
        private int result;
        private int key;
        public Factorial(int number,int x){
            result=number;
            key=x;
        }

        public int getResult() {
            return result;
        }

        public int getKey() {
            return key;
        }
    }
    public static Factorial getFactorial(int x){
        int result=1;
        for(int i=1;i<=x;i++){
            result*=i;
        }
        return new Factorial(result,x);
    }
}