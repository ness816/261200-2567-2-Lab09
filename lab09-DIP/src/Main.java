public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("88888888");
        Order order2 = new Order("7777777");

        // Inject SMSNotifier
        OrderProcessor smsProcessor = new OrderProcessor(new SMSNotifier());
        smsProcessor.processOrder(order1);

        // Inject EmailNotifier
        OrderProcessor emailProcessor = new OrderProcessor(new EmailNotifier());
        emailProcessor.processOrder(order2);
    }
}