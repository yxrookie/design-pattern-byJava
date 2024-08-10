package cn.rookieyx.payment.annotation;

import cn.rookieyx.payment.factory.PaymentMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author rookieyx
 * @description
 * @create 2024-08-09 17:07
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PaymentStrategy {
    PaymentMethod method();
}
