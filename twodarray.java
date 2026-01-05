import java.util.*;
class twodarray{
    public static boolean  Search(int matrix[][],int key){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(key==matrix[i][j]){
                    System.out.println("fount arr index: "+i+","+j);
                    return true;
                }
            }
            
        }
        System.out.println("Key not found");
        return true;
    }


    public static void printspiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endcol=matrix[0].length-1;

        while(startRow<=endRow && startCol<=endcol){
            //top;
            for(int j=startCol;j<=endcol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right;
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            //bottom;
            for(int j=endcol-1;j>=startCol;j--){
                if(startCol==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endcol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endcol--;
            endRow--;

            System.out.println();
        }
    }

    public static void diagonalsum(int matrix[][]){
        int sum=0;
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        for(int i=0;i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
            

        }
        System.out.println(sum);
    }


    public static boolean  search(int matrix[][]){
        int key=5;
        int row=0, col=matrix[0].length-1;
        //n=0,m-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("fount key at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
           
        }
         System.out.println("key not found !");
         return false;
        
        
    }


    public static void main(String args[]) {
        int matrix[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j]=sc.nextInt();
            }
            System.out.println();
        } 

        //output

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Search
        Search(matrix,5);
        printspiral(matrix);
        diagonalsum(matrix);
        search(matrix);
 
    }
}