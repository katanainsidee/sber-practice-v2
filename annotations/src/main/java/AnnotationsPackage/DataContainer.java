package AnnotationsPackage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataContainer {
    private int intField;
    private String stringField;
    private boolean booleanField;
}
