import java.util.*;

public class Arrays{

    public static int linearSearch(int key,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
            
        }
        return -1;
    }

    public static int linearSearch(String key,String arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(key)){
                return i;
            }
            
        }
        return -1;
    }

    public static void largenu(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest no is: " + max);
    }

    public static int binarysearch(int arr[],int key){
       int start=0,end=arr.length-1;
       while(start<=end){
        int mid = (start+end)/2;

        //compare
        if(arr[mid]==key){
            return mid;
            
        }
        if(arr[mid]<key){
            start=mid+1;
        }else{
            end=mid-1;
        }
       }
       return -1;
    }

    public static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void subarr(int arr[]){
        int ts=0;
        int sum=Integer.MIN_VALUE;
        int maxsum=0;
        int prefix[] = new int[arr.length];

        prefix[0]=arr[0];

        //calculate prefix;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }


        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                // for(int k=start;k<=end;k++){
                //     System.out.print(arr[k]+"");
                //     sum=sum+arr[k];
                // }
                sum = start==0? prefix[end]:prefix[end]-prefix[start-1];

                if(sum>maxsum){
                    maxsum=sum;
                }
                System.out.print("sum: "+sum);
                ts++;
                System.out.println();
                
            }
            System.out.println();
        }
        System.out.println("tota; sub arr: "+ts);
        System.out.println("max sum: "+maxsum);
    }

    public static void kadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);

        }
        System.out.println("our max subarray sum is:"+ms);
    }

    public static void reversearr(int arr[]){
       int first = 0,last=arr.length-1;

       while(first<last){
        //swap
        int temp=arr[last];
        arr[last]=arr[first];
        arr[first]=temp;
        
        first++;
        last--;
        

       }

       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
    }

  

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int intarr[]={1,2,3,4,5,6,7,8,9,10,11};
        String chararr[]={"A","B","C","D","E","F","G","H"};
        System.out.print("Enter IntKey: ");
        int Intkey = sc.nextInt();
        System.out.print("Enter CharKey: ");
        String Charkey = sc.next();
        int intindex = linearSearch(Intkey,intarr);
        int charindex = linearSearch(Charkey,chararr);
        if(intindex==-1){
            System.out.println("key not found");
        }else{
            System.out.println("key found at index: "+ intindex);
        }

        if(charindex==-1){
            System.out.println("key not found");
        }else{
            System.out.println("key found at index: "+ charindex);
        }

        largenu(intarr);
        System.out.println(binarysearch(intarr,Intkey));
        pair(intarr);
        subarr(intarr);
        kadanes(intarr);
        reversearr(intarr);
        
    }
}