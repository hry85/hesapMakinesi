import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,select;


        Scanner sc = new Scanner(System.in);
        System.out.print("Ilk sayiyi giriniz : ");
        n1 = sc.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        n2 = sc.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminizi giriniz : ");
        select = sc.nextInt();
     /*
        if (select == 1){
            System.out.println("Toplama islemi sonucu : " +(n1 + n2));
        }else if (select == 2){
            System.out.println("Cikarma islemi sonucu : " +(n1 - n2));
        }else if (select == 3){
            System.out.println("Carpma islemi sonucu : " +(n1 * n2));
        }else if (select == 4){
            if (n2 != 0){
                System.out.println("Bolme islemi sonucu : " +(n1/n2));
            }else{
                System.out.println("Bir sayi 0'a bolunmez!");
            }
        }else {
            System.out.println("Hatali secim yaptiniz. Lutfen tekrar deneyin.");
        }

      */
       // Switch Case

        switch (select){
            case 1:
                System.out.println("Toplama islemi sonucu : " +(n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma islemi sonucu : " +(n1 - n2));
                break;
            case 3:
                System.out.println("Carpma islemi sonucu : " +(n1 * n2));
                break;
            case 4:
               String kontrol= (n1 == 0)? "0 hicbir sayiya bolunmez" : "Bolme islemi sonucu : " +(n1 / n2);
                System.out.println(kontrol);

                break;
            default:
                System.out.println("Hatali secim yaptiniz. Lutfen tekrar deneyin.");



        }

    }
}
