import java.util.*;
public class PalindromeString {
    public static void main(String[] args){
        String str;
        int i=0;
        boolean b=false;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();

        int j=str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                b=false;
                i++;
                j--;
            }
            else{
                b=true;
                i++;
                j--;
            }
        }
        if(b==true){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }

    }

}
