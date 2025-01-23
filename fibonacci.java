
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class fibonacci {
    public static void main(String[] args) throws  IOException {
        BufferedReader br =new BufferedReader((new InputStreamReader(System.in)));
        System.err.print("Enter no. of fibonnaci series: ");
        int n =Integer.parseInt(br.readLine());
        int f1=0,f2=1;
        int count=0;
        int f=0;
        System.out.println(f);
        while(count<n){
            f1=f2;
            f2=f;
            f=f1+f2;
            System.out.println(f);
            count++;
        }
    }
}
