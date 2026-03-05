package com.ecommerce.service;

public class OrderService {

    private PaymentService paymentService;
    private InvoiceService invoiceService;
    private NotificationService notificationService;

    // Constructor Injection

    public OrderService(NotificationService notificationService, InvoiceService invoiceService){
        this.invoiceService = invoiceService;
        this.notificationService = notificationService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(Order order, double amount){
        System.out.println("Processing Order ID : "+order.getOrderId());
        paymentService.processPayment(amount);
        invoiceService.generateInvoice(amount);

        if(notificationService != null){
            notificationService.sendNotification("Order "+order.getOrderId()+" confirmed");
        }
    }

}
