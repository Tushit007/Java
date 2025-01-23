
public class linearSearch {
    public static int lsearch(int num[] , int key){
        for(int i=0;i<num.length;i++){
            if (num[i] == key) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int num[]={2,4,5,6,7,8,9,0,10,4,3};
        int key =10;
        int idx=lsearch(num, key);
        if (idx==-1){
            System.err.println("not found");
        }
        else{
            System.err.println("found in  "+idx);
        }


    }
    
}
