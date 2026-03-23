public class BitManipulation{

    public static void oddOrEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }

    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n&bitMask;
        
    }
    public static int updateIthBit(int n,int i,int newBit){
        // if(newBit==0){
        //     return clearIthBit(n,i);
        // }else{
        //     setIthBit(n,i);
        // }

        n=clearIthBit(n, i);
        int bitMask=newBit<<i;
        return n | bitMask;
        
    }

    public static int clearBitsInRange(int n,int i,int j){
        int a=((~0)<<(j+1));
        int b =(1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
        
    }

    public static boolean isPoweOFTwo(int n){
        return (n&(n-1))==0;
        
    }

    public static int countSetBit(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static int fastExpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
        
    }

    public static void main(String args[]){
        //binary and
        System.out.println(5&6);
        //binary or
        System.out.println(5|6);
        //binary xor
        System.out.println(5^6);
        //binary one complements
        System.out.println(~5);
        //binary left shift
        System.out.println(5<<2);
        //binary Right shift
        System.out.println(6>>1);

        //Q1. check if a number is Odd or Even
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(4);
        //get
        System.out.println(getIthBit(10,2));
        //set
        System.out.println(setIthBit(10,2));
        //clearIthBit
        System.out.println(clearIthBit(10,2));
        //updateIthBit
        System.out.println(updateIthBit(10,2,1));
        //clearBitsInRange
        System.out.println(clearBitsInRange(10,2,4));
        //isPoweOFTwo
        System.out.println(isPoweOFTwo(16));
        //countSetBit
        System.out.println(countSetBit(16));
        //fastExpo
        System.out.println(fastExpo(5,3));





    }
}