package OopPackage;

public class Main {
    private static void runPhone(){
        System.out.println("Тестирование OopPackage.Phone:");
        Phone iphone = new Phone("+7 (911) 060-71-16", "IPhone 13", "173g");
        Phone samsung = new Phone("+7 (921) 877-13-12", "Samsung");
        Phone nophone = new Phone();
        iphone.receiveCall("Misha");
        samsung.receiveCall("Denis", "+7 (624) 460-73-78");
        System.out.println(iphone.getNumber());
        iphone.sendMassage();
        iphone.toString();
    }

    private static void runCircle(){
        System.out.println("Тестирование Circle:");
        Circle circle = new Circle(10, "red");
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        circle.toString();
    }

    private static void runMatrix(){
        System.out.println("Тестирование OopPackage.Matrix:");
        Matrix m1 = new Matrix(2, 2);
        m1.setValue(0, 0, 1);
        m1.setValue(0, 1, 2);
        m1.setValue(1, 0, 3);
        m1.setValue(1, 1, 4);
        m1.printMatrix();

        Matrix m2 = new Matrix(2, 2);
        m2.setValue(0, 0, 5);
        m2.setValue(0, 1, 6);
        m2.setValue(1, 0, 7);
        m2.setValue(1, 1, 8);
        m2.printMatrix();

        Matrix m3 = m1.add(m2);
        m3.printMatrix();

        Matrix m4 = m1.multiplyByNumber(3);
        m4.printMatrix();

        Matrix m5 = m1.multiply(m2);
        m5.printMatrix();
    }

    private static void runBook() throws Exception {
        System.out.println("Тестирование Book:");
        Author author = new Author("Alexander Pushkin", "male", "pushkin.alex@duelloser.ru");
        Book book = new Book("Captain's daughter", author, 1836);

        System.out.printf("%s, %s, %s\n\n", author.getName(), author.getGender(), author.getEmail());
        System.out.printf("%s, %s, %s\n\n", book.getTitle(), book.getAuthor().toString(), book.getYear());

        System.out.println(author);
        System.out.println();
        System.out.println(book);
    }

    private static void runPizzaOrder(){
        System.out.println("Тестирование PizzaOrder:");

        PizzaOrder testOrder = new PizzaOrder("Pizza BBQ", Size.BIG, true, "Gagarina 80A");

        testOrder.cancel();
        testOrder.order();
        testOrder.order();
        testOrder.cancel();

        System.out.println(testOrder);
    }

    static public void main(String[] args) throws Exception {
        runPhone();
        runCircle();
        runMatrix();
        runBook();
        runPizzaOrder();
    }
}
