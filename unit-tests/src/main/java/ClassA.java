public class ClassA {
    private ClassB classB;

    public ClassA(ClassB classB) {
        this.classB = classB;
    }

    public String methodA() {
        try {
            return "A" + classB.methodB();
        } catch (Exception e) {
            return "Exception caught in methodA";
        }
    }

    private String privateMethodA() {
        return "privateA";
    }
}
