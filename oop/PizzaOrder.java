public class PizzaOrder {
    private String name;
    private Size size;
    private boolean needSauce;
    private String address;
    private boolean orderAccepted;

    public enum Size {
        SMALL, MEDIUM, BIG
    }

    public PizzaOrder(String name, Size size, boolean needSauce, String address) {
        this.setName(name);
        this.setNeedSauce(needSauce);
        this.setAddress(address);
        this.setSize(size);
    }

    public void order() {
        if (orderAccepted) {
            System.out.println("Заказ уже принят");
        } else {
            System.out.println("Заказ принят");
            this.orderAccepted = true;
        }
    }

    public void cancel() {
        if (orderAccepted) {
            System.out.println("Заказ отменен");
            this.orderAccepted = false;
        } else {
            System.out.println("Заказ не был принят");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setNeedSauce(boolean needSauce) {
        this.needSauce = needSauce;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public Size getSize() {
        return this.size;
    }

    public boolean getNeedSauce() {
        return this.needSauce;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "Info:\nPizza: %s\nSize: %s\nSouse: %s\nAddres: %s\nAccepted: %s\n".formatted(this.name,
                this.size, this.needSauce ? "Yes" : "No", this.address, this.orderAccepted ? "Yes" : "No");
    }

    static class Main{
        public static void main(String[] args) {
            PizzaOrder testOrder = new PizzaOrder("Pizza BBQ", Size.BIG, true, "Gagarina 80A");

            testOrder.cancel();
            testOrder.order();
            testOrder.order();
            testOrder.cancel();

            System.out.println(testOrder);
        }
    }
}
