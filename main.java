
public class main{

    public static void bintodec(int binnum){
        int mynum = binnum;
        int pow =0;
        int decnum = 0;
        while(binnum>0){
            int lastDigit = binnum%10;
            decnum = decnum + (lastDigit * (int) Math.pow(2,pow));

            pow++;
            binnum = binnum/10;
        }
        System.out.println("decimal of " + mynum + " = "+decnum);
    }

    public static void dectobin(int n){
        int mynum =n;
        int pow = 0;
        int binnum =0;
        while(n>0){
            int rem = n%2;
            binnum = binnum + (rem * (int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binarry form of " + mynum + " = " + binnum);
    }


    public static void main(String args[]){
     
            bintodec(111);
            dectobin(179);
        
    }
}