package AnnotationsPackage;

import java.lang.reflect.Field;

public class DataContainerInspector {

    public static void inspectDataContainer(DataContainer data) {
        Field[] fields = data.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(data);
                System.out.println("Field name: " + field.getName() + ", value: " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}