public class sortingalgo{

    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            //swap
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the correct possition
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insetion
            arr[prev+1]=curr;

        }
    }

    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;

        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }


    public static void printarr(int arr[]){
       for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[]={3,5,7,2,8,6};

        // bubblesort(arr);
        // SelectionSort(arr);
        // insertionsort(arr);
        countingsort(arr);
        printarr(arr);
    }
}