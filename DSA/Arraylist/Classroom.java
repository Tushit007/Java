import java.util.ArrayList;
import java.util.Collections;
public class Classroom{

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
    for(int i=0;i<list.size();i++){
        list.set(idx1,idx2);
        list.set(idx2,temp);
    }
    }
    public static void main(String[] args){
        //Java collection framework
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);//O(1)
        list.add(5);//O(1)
        list.add(9);//O(1)
        list.add(3);//O(1)
        list.add(6);//O(1)
        // System.err.println(list);
        //get 
    //     //O(1)
    //     int element=list.get(2);
    //     System.err.println(element);

    // //remove
    // //O(n)
    // list.remove(2);
    // System.err.println(list);

    // //set
    // //O(n)
    // list.set((1),10);
    // System.err.println(list);

    // //contains
    // //O(n)
    // System.err.println(list.contains(10));

    // System.err.println(list.size());


//Print Reverse
    // for(int i=list.size()-1;i>=0;i--){
    //     System.err.print(list.get(i)+" ");
    // }
    // System.err.println("");
    // }


 //Find max
    int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
        // if(list.get(i)>max)
        // max=list.get(i);
        max=Math.max(max,list.get(i));
    }
    System.err.println("Max elements in Arrraylist : "+max);


//Swap 2 no.s
    int idx1=1,idx2=3;
        System.err.println("Not swapped : "+list);

    swap(list, idx1, idx2);
    System.err.println("Swaped :  "+list);

//Sort in ascending
Collections.sort(list);
System.err.println("Sorted in ascending : "+list);
//Sort in desscending
Collections.sort(list,Collections.reverseOrder());
//Comparator(Collections.reverseOrder())-fnx logic
System.err.println("Sorted in descending : "+list);


}}


