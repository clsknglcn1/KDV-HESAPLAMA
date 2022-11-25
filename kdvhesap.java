import java. util.Scanner;
// kdv hesaplayan kod
public class kdvhesap {
    public static void main(String[] args) {
        //1: kitap ve kdv oranini tanımlama
        double kitap;
        double kdvOran =0.18;
        double kdvOran2= 0.8;

        Scanner input = new Scanner(System.in);
        //2: kitap degerini ekrana yazdırma komutu
        System.out.println("kitap tutarını giriniz:");
        kitap= input.nextDouble();

        double kdvTutar= kitap*kdvOran;

        kdvTutar= kitap>0 && kitap<1000? kitap*kdvOran:kitap*kdvOran2;

       //kdvli tutarı hesaplama

        double kvdliTutar = kitap+=kdvTutar;
        System.out.println(kvdliTutar);







    }
}
