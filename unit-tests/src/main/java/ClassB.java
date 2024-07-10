public class ClassB {
    private ClassC classC;

    public ClassB(ClassC classC) {
        this.classC = classC;
    }

    public String methodB() throws Exception {
        return "B" + classC.methodC();
    }
}
