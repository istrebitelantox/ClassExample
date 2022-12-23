package ModificatorsAndIncapsulation;

public class ModIf {
    public static void main(String[] args){
        Person1 yuri=new Person1("Юрий",19,"Ул. Пушкина","+79502458776");
        yuri.displayName();
        yuri.displayAge();
        yuri.displayPhone();

        System.out.println(yuri.name);
        System.out.println(yuri.age);
        System.out.println(yuri.address);
    }
}
class Person1{
    String name;
    protected  int age;
    public String address;
    private String phone;
    public Person1(String name,int age, String address,String phone){
        this.name=name;
        this.age=age;
        this.address=address;
        this.phone=phone;
    }
    public void displayName(){
        System.out.printf("Имя: %s \n", name);
    }
    void displayAge(){System.out.printf("Возраст: %d\n", age);
    }
    private void displayAddress(){
        System.out.printf("Адрес: %s \n",address);
    }
    protected void displayPhone(){
        System.out.printf("Телефон: %s \n",phone);
    }
}