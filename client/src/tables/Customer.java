package tables;

import staff.Cook;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Customer {

    public static void main(String[] args) throws IllegalAccessException {
        Cook obj = new Cook();
        Map<String, Object> map = getProperties(obj);
        System.out.println(map);
    }

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

    public void payBill() {
        System.out.println("Paying bill");
    }

    public void orderMeal() {
        System.out.println("Ordering meal");
    }

}
