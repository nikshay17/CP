    import java.util.*;

    public class Main {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n=sc.nextInt();
                int [] arr=new int[n];
                for(int j=0;j<n;j++){
                    int a=sc.nextInt();
                    arr[j]=a;
                }
               Arrays.sort(arr);
                    System.out.println(arr[arr.length/2]);

            }




                    }



            }