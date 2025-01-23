public class CheckTwice{
    public static boolean check(int n[]){
       for(int i=0;i<n.length-1;i++){
           for(int j=i+1;j<n.length;j++){//O(n^2)
            if(n[i]==n[j]){
            return true;
            }
           }
    }
    return false;
}
    public static void main(String[] args) {
        int n[]={1,2,3,1,5,6};
        System.out.println("Sfasf "+check(n));
    }
}