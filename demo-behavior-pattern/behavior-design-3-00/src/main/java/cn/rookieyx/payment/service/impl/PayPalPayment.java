package cn.rookieyx.payment.service.impl;

import cn.rookieyx.payment.annotation.PaymentStrategy;
import cn.rookieyx.payment.factory.PaymentMethod;
import cn.rookieyx.payment.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author rookieyx
 * @description
 * @create 2024-08-09 17:08
 **/
@Component
@PaymentStrategy(method = PaymentMethod.PAYPAL)
public class PayPalPayment implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " using PayPal.");
    }
}
