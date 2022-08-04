import java.io.IOException;
import java.util.Scanner;

public class CF {


    public static  void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int [][]arr = new int[6][6];
        for (int i=0;i<5;i++){
            for(int j=0; j<5;j++){
                arr[i][j] = sc.nextInt();
                if (arr[i][j]==1){
                    System.out.print(Math.abs(2-i)+Math.abs(2-j));
                }
            }
        }
    }
}
