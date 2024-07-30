package Basic;
import java.util.Scanner;
public class EBOB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ebob = 1;

        System.out.println("n1 sayısını girin: ");  //Küçük sayı
        n1 = input.nextInt();

        System.out.println("n2 sayısını girin: ");  //Büyük sayı
        n2 = input.nextInt();

        for(int i = n1 ; i >= 1 ; i--){
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
                System.out.println("EBOB: " + ebob);
                break;
            }
        }
    }
}
