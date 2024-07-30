public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create an email notifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorate with SMS notifier
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Decorate with Slack notifier
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send notification via email, SMS, and Slack
        slackNotifier.send("Hello, this is a test notification!");
    }
}
