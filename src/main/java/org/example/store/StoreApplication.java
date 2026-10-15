package org.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

      // injecting directly without spring context

        // var orderService1= new OrderService(new StripePaymentService());
        // orderService1.placeOrder();
        // var orderService2 = new OrderService(new PaypalPaymentSrvice());
        // orderService2.placeOrder();

        //run the sam using spring-boot context

        ApplicationContext context =  SpringApplication.run(StoreApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
