import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CF {


    public static  void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, first_share = 0,i=0;
        n = sc.nextInt();
        ArrayList <Integer> arr = new ArrayList<Integer>();
        int tmp;
        for(int j=0;j<n;j++){
            tmp = sc.nextInt();
            arr.add(tmp);
            sum += tmp;
        }
        Collections.sort(arr, Collections.reverseOrder());
        while (first_share<=sum/2){
            first_share += arr.get(i);
            i++;
        }
        System.out.println(i);

    }
}
