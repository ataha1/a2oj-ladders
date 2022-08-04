import java.io.IOException;
import java.util.Scanner;

public class CF {

    public static  void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String word = "";
        for(int i=0;i<n;i++){
            word = sc.next();
            if(word.length()>10){
                System.out.println("" + word.charAt(0) + (word.length()-2) + word.charAt(word.length()-1));
            }
            else{
                System.out.println(word);
            }
        }

    }
}
