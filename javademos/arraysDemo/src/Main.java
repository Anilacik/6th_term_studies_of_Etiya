public class Main {
    public static void main(String[] args) {


        String ogrenci1 = "engin";
        String ogrenci2 = "derin";
        String ogrenci3 = "anıl";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("---------------");

    String[] ogrenciler = new String[3];
        ogrenciler[0]="engin";
        ogrenciler[1]="derın";
        ogrenciler[2]="anıl";


        for (int i = 0; i<ogrenciler.length;i++){

            System.out.println(ogrenciler[i]);
        }

        System.out.println("---------------");

        for(String ogrenci: ogrenciler){

            System.out.println(ogrenci);


        }










    }
}