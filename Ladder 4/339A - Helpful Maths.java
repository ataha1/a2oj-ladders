import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class CF {
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }

    public static  void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str1; str1 = sc.next();
        str1 = sortString(str1);
        for (int i=str1.length()/2;i<str1.length()-1;i++){
            System.out.print("" + str1.charAt(i) + '+');
        }
        System.out.println(str1.charAt(str1.length()-1));
    }
}
