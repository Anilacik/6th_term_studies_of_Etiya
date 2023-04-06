public class CustomerMenager {
    private BaseLogger logger;
    public CustomerMenager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("müşteri eklendi");
        this.logger.log("log mesajı");

    }
}
