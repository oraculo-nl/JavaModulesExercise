package personnel;


import staff.Cook;
import tables.Customer;

public class Waiter {

    public static void main(String[] args) {
        var customer = new Customer();
        var cook = new Cook();
        customer.orderMeal();
        cook.prepareMeal();
        customer.payBill();
    }




}
