import java.util.*;
public class NonRecurrent {
    public static void main(String[] args) {

        String str;
        int ctr = 0, index=-1;
        boolean bt=false;
        ArrayList<Character> list = new ArrayList<Character>();
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        str=str.toLowerCase();

        for(int i=0;i<str.length();i++){

            ctr=str.length()- str.replace(Character.toString(str.charAt(i)),"").length();
            if(ctr==1){
                bt=true;
                 index=i;
                break;
            }
        }
        if(bt==true){
            System.out.println("The first non recurrent character is "+str.charAt(index));
        }
        else{
            System.out.println("All the characters in this String are repeating");
        }
    }
}