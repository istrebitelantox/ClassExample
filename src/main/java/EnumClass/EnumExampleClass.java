package EnumClass;

public class EnumExampleClass {
    public static void main(String[] args) {

        Day current = Day.MONDAY;
        System.out.println(current);
        Book b1 = new Book("War and Peace", "L. Tolstoy", Type.BELLETRE);
        System.out.printf("Book '%s' has a type %s", b1.name, b1.bookType);

        switch(b1.bookType){
            case BELLETRE:
                System.out.println("Belletre");
                break;
            case SCIENCE:
                System.out.println("Science");
                break;
            case SCIENCE_FICTION:
                System.out.println("Science fiction");
                break;
            case PHANTASY:
                System.out.println("Phantasy");
                break;
        }
        Type1[] types=Type1.values();
        for(Type1 s: types){
            System.out.println(s);
        }
    }
}
enum Type1{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}
enum Day{

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
class Book{

    String name;
    Type bookType;
    String author;

    Book(String name, String author, Type type){

        bookType = type;
        this.name = name;
        this.author = author;
    }
}

enum Type
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}
