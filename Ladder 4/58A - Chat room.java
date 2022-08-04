import java.io.IOException;
import java.util.Scanner;

public class CF {


    public static  void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str; str = sc.next();
        boolean found=false;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='h'){
                for (int j=i+1;j<str.length();j++){
                    if (str.charAt(j)=='e'){
                        for (int s=j+1;s<str.length();s++){
                            if (str.charAt(s)=='l'){
                                for (int u=s+1;u<str.length();u++){
                                    if (str.charAt(u)=='l'){
                                        for (int o=u+1;o<str.length();o++){
                                            if (str.charAt(o)=='o'){
                                                found=true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (found==false){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }
}
