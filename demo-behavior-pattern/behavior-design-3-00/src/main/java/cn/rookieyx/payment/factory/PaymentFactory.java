package cn.rookieyx.payment.factory;

import cn.rookieyx.payment.annotation.PaymentStrategy;
import cn.rookieyx.payment.service.PaymentService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author rookieyx
 * @description
 * @create 2024-08-09 17:07
 **/
@Component
public class PaymentFactory {
    public Map<PaymentMethod, PaymentService> paymentMethodPaymentServiceMap = new ConcurrentHashMap<>();

    public PaymentFactory(List<PaymentService> paymentServices) {
        for(PaymentService paymentService : paymentServices) {
            PaymentStrategy strategy = paymentService.getClass().getAnnotation(PaymentStrategy.class);
            if(strategy != null) {
                paymentMethodPaymentServiceMap.put(strategy.method(), paymentService);
            }
        }
    }

    public PaymentService getPaymentService(PaymentMethod method) {
        return paymentMethodPaymentServiceMap.get(method);
    }

}
