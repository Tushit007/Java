
import java.util.*;

public class arrays {
   public static void main(String[] args) {
    int marks[]=new int[50];
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the no. of arrays you want to enter : ");
    int n =sc.nextInt();    
    for(int i=0;i<=n-1;i++){
        marks[i]=sc.nextInt();
    }
    for(int i=0;i<=n-1;i++){
    System.out.print(marks[i]+" ");
    }
    }
}`
