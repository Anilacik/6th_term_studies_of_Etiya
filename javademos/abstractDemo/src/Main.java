public class Main {
    public static void main(String[] args) {

        CustomerMenager customerMenager = new CustomerMenager();
        customerMenager.databaseMenager = new MySqlDataBaseMenager();
        customerMenager.getCustomers();


    }
}