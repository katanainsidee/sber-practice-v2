package AnnotationsPackage;

import lombok.NonNull;

@WeekDay(3)
public class ChildClass2 extends ParentClass {

    @Schedule(hours = 10, priority = 1, description = "Late morning task")
    public void method1(@NonNull DataContainer data) {

    }

    @Schedule(hours = 20, priority = 2, description = "Night task")
    public void method2(@NonNull DataContainer data) {

    }
}
