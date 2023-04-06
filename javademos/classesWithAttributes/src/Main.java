public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setId(1);
        product.setName("laptop");
        product.setDescription("asus laptop");
        product.setPrice(5000);
        product.setStockAmount(3);


        ProductMenager productMenager = new ProductMenager();
        productMenager.Add(product);
    }
}