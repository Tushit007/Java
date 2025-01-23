public class BinarytoDecimal {

    public static void bintodec(int binNum){
        int myNum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum > 0){
            int lastD=binNum % 10;
            decNum=decNum +(lastD*(int)Math.pow(2, pow));
            pow++;
            binNum/=10;
        }
        System.out.println("decimal of "+myNum+" = "+decNum);

    }
    public static void main(String[] args) {
        bintodec(1010);
        
    }
    
}
