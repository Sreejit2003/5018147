public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Display image1
        System.out.println("Displaying image1 for the first time:");
        image1.display();
        System.out.println();

        // Display image1 again (should be cached)
        System.out.println("Displaying image1 for the second time:");
        image1.display();
        System.out.println();

        // Display image2
        System.out.println("Displaying image2 for the first time:");
        image2.display();
    }
}
