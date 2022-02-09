package dio;

import dio.base.Order;

public class MyFirstProgram {

    public static void main(String[] args) {
        Order order = new Order("code1234");

        System.out.println(order);
    }

}