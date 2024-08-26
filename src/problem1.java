
import java.util.Scanner;

public class problem1{

    public static int sum(int n){
        int sum = 0;
        while(n > 0){
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       for(int i = 1; i <= n; i++){
         int a=sc.nextInt();
          System.out.println(sum(a));

       }
//
    }
}
