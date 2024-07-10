package AnnotationsPackage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InstanceCreator {

    public static List<Object> createInstances(LocalDateTime dateTime, DataContainer data) {
        List<Object> instances = new ArrayList<>();
        try {
            if (dateTime.getDayOfWeek().getValue() == 1) {
                instances.add(ChildClass1.class.getDeclaredConstructor().newInstance());
            } else if (dateTime.getDayOfWeek().getValue() == 3) {
                instances.add(ChildClass2.class.getDeclaredConstructor().newInstance());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instances;
    }
}
