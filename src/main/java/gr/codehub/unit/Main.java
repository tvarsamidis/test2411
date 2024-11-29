package gr.codehub.unit;

import gr.codehub.unit.domain.Item;
import gr.codehub.unit.service.CartService;
import gr.codehub.unit.service.CartServiceImpl;
import gr.codehub.unit.service.PaymentService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = null;
        CartService cartService = new CartServiceImpl(paymentService);
        cartService.addItem(new Item("Apple", BigDecimal.valueOf(1), 1));
        cartService.addItem(new Item("Banana", BigDecimal.valueOf(2), 5));
        cartService.addItem(new Item("Apple", BigDecimal.valueOf(1), 2));
        cartService.addItem(new Item("Chocolate", BigDecimal.valueOf(1), 2));
        cartService.getCartItems().forEach(i -> System.out.println(i));
        System.out.println("The total price of products is:" + cartService.getTotalPrice());
        cartService.removeItem(new Item("Chocolate", BigDecimal.valueOf(1), 2));
        cartService.getCartItems().forEach(i -> System.out.println(i));
        System.out.println("The total price of products is:" + cartService.getTotalPrice());

    }

    public static int getANumber(int x) {
        return 3 * x;
    }

    public static int integerDivide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("The denominator cannot be 0");
        }
        return (int) (a / b);
    }

    public static Double doubleDivide(double a, double b) {
        if (b == 0) {
           return null;
        }
        return a / b;
    }

}
