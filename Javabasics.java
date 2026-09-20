// import java.util.Scanner;

/**
 * Javabasics
 */
public class Javabasics {

    
//    public static int factorial(int a){
//     int f=1;
//     for(int i=1;i<=a;i++){
//        f=f*i;
//     }
//      return f;    
//     }

//     public static  boolean Isprime(int b) {
//         if(b==2){
//             return true;
//         }
//         boolean Isprime=true;
//         for(int i=2;i<=b-1;i++){
//             if(b%i==0){
//             Isprime=false;
//                 break;
//             }
            
//         }   
//         return Isprime;
      
// }
public static boolean isPrime(int n){
    if(n==2){
              return true;       }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }

    }
    return true;
}
public static void primeInRange(int n) {
    for(int i=2 ; i<=n;i++){
        if(isPrime(i)){
            System.out.print(i+"  ");
        }
    }
    System.out.println();
    
}
public static void main(String args[]){
    // System.out.println(isPrime(6));
    primeInRange(100);

}
}