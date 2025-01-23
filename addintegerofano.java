public class addintegerofano {
    public static void add(int n){
        int s=0;
        while(n>0){
            int x=n%10;
            s+=x;
            n=n/10;

        }
        System.out.println("so the sum is "+s);
    }
    public static void main(String[] args) {
        add(121);
        
    }
}
