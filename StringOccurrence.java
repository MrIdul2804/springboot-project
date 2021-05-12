import java.util.*;

public class StringOccurrence {
    public static void main(String[] args) {
        String str;
        char ch;
        int ctr=0;
        Scanner sc= new Scanner(System.in);

        str= sc.nextLine();
        ch=sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch || (str.charAt(i)+32)==ch || (str.charAt(i)-32)==ch){
                ctr++;
            }
        }
        if(ctr==0){
            System.out.println("Character not present in the String");
        }
        else if(ctr==1){
            System.out.println(ch+" is non-recurrent in the String");
        }
        else{
            System.out.println(ch+" is present "+ctr+" times in the String");
        }
    }

}
