public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create an instance of CustomerRepositoryImpl
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        
        // Create an instance of CustomerService, injecting the repository
        CustomerService customerService = new CustomerService(customerRepository);
        
        // Use CustomerService to find and display customer details
        String customerDetails = customerService.getCustomerDetails("35689");
        System.out.println(customerDetails);
    }
}
