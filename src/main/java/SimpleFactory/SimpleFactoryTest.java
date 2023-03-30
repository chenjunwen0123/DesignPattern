package SimpleFactory;

import java.util.Scanner;

/**
 * @description: TODO
 * @author: whi5p3r
 * @date: 2023年03月29日 16:39
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            Payment payment = PaymentFactory.createPayment(scanner.next());
            System.out.println(payment.getName());
        }
    }
}
