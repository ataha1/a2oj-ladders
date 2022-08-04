import java.io.IOException;
import java.util.Scanner;

public class CF {

    public static  void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = "";
        str = str.toLowerCase();
        for (int i =0;i<str.length();i++){
            if (str.charAt(i)!='a' && str.charAt(i)!='o' && str.charAt(i)!='y'
                    && str.charAt(i)!='e' && str.charAt(i)!='u' && str.charAt(i)!='i'){
                str2=str2+'.'+str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
