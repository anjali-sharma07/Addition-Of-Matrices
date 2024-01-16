import java.util.Scanner;
public class additionOfMatrices {


        static void printArray(int[][] arr){
            for(int i = 0; i<arr.length; i++){
                for(int j = 0; j<arr[i].length; j++){
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }


    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter r1");
        int r1 = sc.nextInt();
        System.out.println("Enter c1 ");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter Arr1 Elements");
         for(int i = 0; i<r1; i++) {
             for (int j = 0; j < c1; j++) {
                 arr1[i][j] = sc.nextInt();
             }
         }
         printArray(arr1);

        System.out.println("Enter r2");
        int r2 = sc.nextInt();
        System.out.println("Enter c2 ");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter Arr2 element");
        for(int i = 0; i<r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        printArray(arr2);

        int[][] ans = new int[r1][c1];

        if(r1!= r2 && c1!= c2){
            System.out.println("Addition of these matrics can't be possible");

        }else{

        for(int i = 0; i<r1; i++){
            for(int j = 0; j<c1; j++){
            ans[i][j] = arr1[i][j] + arr2[i][j];
        }
    }

        printArray(ans);

    }
}}

