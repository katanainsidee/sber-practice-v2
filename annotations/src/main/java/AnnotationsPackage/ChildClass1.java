package AnnotationsPackage;

import lombok.NonNull;

public class ChildClass1 extends ParentClass {

    @Schedule(hours = 1, priority = 1, description = "Morning task")
    @Schedule(hours = 13, priority = 2, description = "Afternoon task")
    public void method1(@NonNull DataContainer data) {

    }

    @Schedule(hours = 17, priority = 3, description = "Evening task")
    public void method2(@NonNull DataContainer data) {

    }
}
