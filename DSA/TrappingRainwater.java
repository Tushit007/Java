public class TrappingRainwater {
public static int trappedWater(int height[]){ //O(n)
    int n=height.length;
    //calculate left max boundary--array
    int maxLeft[]=new int[n];
    maxLeft[0]=height[0];
    for(int i=1;i<n;i++){
        maxLeft[i]=Math.max(height[i],maxLeft[i-1]);
    }
    //calculate right max boundary --array
    int maxRight[]=new int[n];
    maxRight[n-1]=height[n-1];
    for(int i=n-2;i>=0;i--){
       maxRight[i]=Math.max(height[i],maxRight[i+1]);
    }
    int trappedW=0;
    //loop
    for(int i=0;i<n;i++){
    //waterLevel=min(maxLeft,maxRight)
      int waterLevel =Math.min(maxLeft[i],maxRight[i]);
          
      
      //trappedWater=waterLevel -height[i]
      trappedW+=waterLevel-height[i];
    }
    return trappedW;
}
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}
