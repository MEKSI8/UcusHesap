import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mesafe,yas,yolculukTip;
        float UCRET=0.1f;

        System.out.println("Yolculuk yapacağınız mesafeyi girin:");
        mesafe= input.nextInt();
        System.out.println("Yaşınızı girin:");
        yas=input.nextInt();
        System.out.println("Bilet şeklini seçin tek yön için 1 gidiş-dönüş için 2");
        yolculukTip=input.nextInt();

        float fiyat=UCRET*mesafe;
        if (mesafe<=0 || yas<=0 || !(yolculukTip!=1 || yolculukTip!=2) ){
            System.out.println("hatalı veri girdiniz.");
        }
        else {
            if (yas<12){
                fiyat=fiyat/2;
            }
            else if (yas<24){
                fiyat=fiyat*0.9f;
            }
            else if (yas>65){
                fiyat=fiyat*0.7f;
            }
            else {
                fiyat=fiyat;
            }
            if (yolculukTip==2){
                fiyat=fiyat*0.8f;
                fiyat=fiyat*2;
                System.out.println("Gidiş dönüş toplam: "+fiyat);
            }
            else {
                System.out.println("Toplam tutar:"+fiyat);
            }
        }

    }
}