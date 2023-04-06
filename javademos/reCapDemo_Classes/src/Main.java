public class Main {
    public static void main(String[] args) {

    DortIslem dortIslem = new DortIslem();

        int sonuc = dortIslem.Topla (dortIslem.sayi1, dortIslem.sayi2);
        System.out.println("sonuç : "+ sonuc);

        int sonuc1 = dortIslem.Cikarma (dortIslem.sayi1, dortIslem.sayi2);
        System.out.println("sonuç : "+ sonuc1);

        int sonuc2 = dortIslem.Carpma (dortIslem.sayi1, dortIslem.sayi2);
        System.out.println("sonuç : "+ sonuc2);

        int sonuc3 = dortIslem.Bolme (dortIslem.sayi1, dortIslem.sayi2);
        System.out.println("sonuç : "+ sonuc3);




    }
}