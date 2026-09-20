

public class Hollowrec{

    public static void h(int a, int b){
        //outer loop
        for(int i=1;i<=a;i++){
            //inner loop
            for(int j=1;j<=b;j++){
                //cell-(i,j)
                if( i == 1 || i == a || j == 1 || j == b){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
         System.out.println();
        }
    }
    public static void main(String[] args) {
         h(4,5);
}
}