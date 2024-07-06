import java.util.Arrays;

public class Phone {
    String number;
    String model;
    String weight;

    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }

    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, String weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receiveCall(String name, String number) {
        System.out.printf("Звонит %s с номера %s\n", name, number);
    }

    public void sendMassage() {
        String[] numbers_arr1 = new String[] {"+7 (911) 060-71-16", "+7 (624) 460-73-78", "+7 (123) 530-21-56"};
        String[] numbers_arr2 = new String[] {"+7 (933) 560-13-26", "+7 (822) 160-74-56", "+7 (826) 867-72-15"};
        String[] numbers_arr3 = new String[] {"+7 (985) 660-41-15", "+7 (635) 066-73-99", "+7 (991) 760-46-33"};

        System.out.printf("%s, %s, %s\n", String.join(", ", numbers_arr1), String.join(", ", numbers_arr2), String.join(", ", numbers_arr3));
    }

    public String toString() {
        System.out.printf("%s, %s, %s\n", number, model, weight);

        return null;
    }

    static class Main {
        static public void main(String[] args) {
            Phone iphone = new Phone("+7 (911) 060-71-16", "IPhone 13", "173g");
            Phone samsung = new Phone("+7 (921) 877-13-12", "Samsung");
            Phone nophone = new Phone();

            iphone.receiveCall("Misha");
            samsung.receiveCall("Denis", "+7 (624) 460-73-78");

            System.out.println(iphone.getNumber());

            iphone.sendMassage();

            iphone.toString();
        }
    }
}
