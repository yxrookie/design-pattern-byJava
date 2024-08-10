package cn.rookieyx;

import cn.rookieyx.payment.PaymentApplication;
import cn.rookieyx.payment.factory.PaymentFactory;
import cn.rookieyx.payment.factory.PaymentMethod;
import cn.rookieyx.payment.service.PaymentService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author rookieyx
 * @description
 * @create 2024-08-09 17:05
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PaymentApplication.class)
public class PaymentFactoryTest {
    @Resource
    private PaymentFactory paymentFactory;

    @Test
    public void testInject() {
        Assertions.assertFalse(paymentFactory.paymentMethodPaymentServiceMap.isEmpty(),
                "The paymentMethodPaymentServiceMap should not be empty.");
    }

    @Test
    public void testCreditCardPayment() {
        PaymentService paymentService = paymentFactory.getPaymentService(PaymentMethod.CREDIT_CARD);
        Assertions.assertNotNull(paymentService);
        paymentService.pay(100.0);
    }

    @Test
    public void testPayPalPayment() {
        PaymentService paymentService = paymentFactory.getPaymentService(PaymentMethod.PAYPAL);
        Assertions.assertNotNull(paymentService);
        paymentService.pay(200.0);
    }
}
