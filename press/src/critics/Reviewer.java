package critics;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Reviewer {

    public static Map<String, Object> getProperties(Object object) throws IllegalAccessException {
        var theClass = object.getClass();
        Field[] declaredFields = theClass.getDeclaredFields();
        Map<String, Object> fieldsMap = new HashMap<>();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            Object o = declaredField.get(object);
            fieldsMap.put(declaredField.getName(), o);
        }
        return fieldsMap;
    }

}
