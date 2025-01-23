public class BuyandSellstocks {

    public static int buyandsell(int price[]){
        int buyingPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){//O(n)
            if(buyingPrice<price[i]){
                int profit=price[i]-buyingPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyingPrice=price[i];
            }
        }
        return maxProfit;
    }
 public static void main(String[] args) {
    int price[]={7,1,5,3,6,4};
System.out.println("max profit is  "+buyandsell(price));
 }   
}
