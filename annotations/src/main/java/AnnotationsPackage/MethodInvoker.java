package AnnotationsPackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodInvoker {

    public static void invokeMethodsInOrder(List<Object> instances, DataContainer data) {
        instances.forEach(instance -> {
            Method[] methods = instance.getClass().getMethods();

            Arrays.stream(methods)
                    .filter(method -> method.isAnnotationPresent(Schedule.class))
                    .sorted(Comparator.comparingInt(method -> method.getAnnotation(Schedule.class).priority()))
                    .forEachOrdered(method -> {
                        try {
                            method.invoke(instance, data);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
        });
    }
}
