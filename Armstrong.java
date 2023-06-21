import java.util.Scanner;
// Armstrong sayı ne demek? Armstrong sayı basamaklarının küpleri toplamı kendisine eşit olan sayılara denir
// Örneğin : 407 için = (4*4*4)+(7*7*7)=470 Bu yüzden 407 armstrong bir sayıdır.
public class Armstrong {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        System.out.print("Lütfen Sayı Giriniz : ");
        int sayi = veri.nextInt();
        System.out.print("Basamak Sayısı Giriniz : ");
        int basamak = veri.nextInt();
        int deger;
        int yeni = sayi;
        int toplam = 0;
        while (yeni>1) {
            deger =(int) Math.pow(yeni%10,basamak);
            yeni = yeni/10;
            toplam = toplam+deger ;
        }
        if (toplam == sayi) {
            System.out.println("Bu bir armstrong sayısıdır !");
        }
    else System.out.println("Bu bir armstrong sayısı değildir !");
    }}

