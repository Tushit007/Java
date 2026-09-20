
public class maxSub {
    public static void maxsubarraysum(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
//calculate prefix array
for(int i=1;i<prefix.length;i++){
    prefix[i]=prefix[i-1]+ num[i];
}

      for (int i = 0; i < num.length; i++) {
        int start = i;
        for (int j = i; j<num.length; j++) {
            int end = j;
            currSum=start ==0?prefix[end]:prefix[end]-prefix[start-1];
            // for(int k=start;k<=end;k++){
            //     currSum+=num[k];
            // }
            // System.out.println(currSum);

            if(maxSum < currSum){
                maxSum=currSum;
            }
        }
      }
      System.out.println("mAX Sum=" + maxSum);
    }

    //optimised than prefix--Kadane's algorithm
    //time complexity is O(n)
    //very important for interview purposes
public static void kadanes(int num[]){
int ms=Integer.MIN_VALUE;
int cs=0;
for(int i=0;i<num.length;i++){
    cs=cs+num[i];
 if(cs<0)
 cs=0;
 ms=Math.max(cs,ms);
}
System.out.println("our max sum is: " +ms);
}


    public static void main(String[] args) {

        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
        
    }
}
//TimeComplexity--O(n^2)
//optimised than bruteforce