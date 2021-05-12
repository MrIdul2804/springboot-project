import java.util.*;
public class Duplicates {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
}
        List<Integer> list= new ArrayList<Integer>();

        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Collections.sort(list);
       for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    list.remove(j);

                }
            }
        }
        Iterator itr= list.iterator();
                while(itr.hasNext()){
            System.out.print(itr.next()+" ");
                }
    }
}
