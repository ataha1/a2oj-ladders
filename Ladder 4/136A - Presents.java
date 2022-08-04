import java.io.IOException;
import java.util.Scanner;

public class CF {


    public static  void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n,i; n = sc.nextInt();
        int []arr = new int[n+5];
        int [] arr2 = new int[n+5];
        for (i =1; i<=n;i++){
            arr[i] = sc.nextInt();
            arr2[arr[i]-1]=i;
        }
        for (i =0;i<n;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
