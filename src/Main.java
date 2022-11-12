import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a,b,c , u, alan ;
        Scanner input= new Scanner(System.in);
        System.out.print("İlk kenarı giriniz : ");
        a=input.nextInt();
        System.out.print("İkinci kenarı giriniz : ");
        b=input.nextInt();
        System.out.print("Üçüncü kenarı giriniz : ");
        c=input.nextInt();

        u=(a+b+c)/2;

        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin çevresi : "+2*u);
        System.out.println("Üçgenin alanı : "+alan);

    }
}