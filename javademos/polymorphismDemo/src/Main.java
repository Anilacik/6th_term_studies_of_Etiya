import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
   /*    BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsoleLogger()};
        for(BaseLogger logger : loggers){
            logger.log("log mesajı");
        }
     */

        CustomerMenager customerMenager = new CustomerMenager(new DataBaseLogger());
        customerMenager.add();
    }
}