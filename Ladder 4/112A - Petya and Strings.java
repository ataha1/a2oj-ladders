import java.io.IOException;
import java.util.Scanner;

public class CF {

    public static  void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.next(); s2 = sc.next();
        s1 = s1.toLowerCase();  s2 = s2.toLowerCase();
        if(s1.compareTo(s2) > 0){
            System.out.println(1);
        } else if (s2.compareTo(s1) > 0) {
            System.out.println(-1);
        } else{
            System.out.println(0);
        }
    }
}
