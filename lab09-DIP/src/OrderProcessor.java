public class OrderProcessor {
    private final NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void processOrder(Order order) {
        // Process order logic
        System.out.println("Processing order: " + order.getOrderId());
        notificationService.notify("Order processed");
    }
}