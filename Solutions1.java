import java.util.*;  

class Solutions1 {
    //find the unique number of paths
    static int numberOfuniquePaths(int A, int B)
    {
        //if 1*1 grod than only 1 path
        if (A == 1 || B == 1){
            return 1;
        }else{
            return numberOfuniquePaths(A - 1, B) + numberOfuniquePaths(A, B - 1);
        }
    }
 
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);    
        //get A X B grid input from user  
        System.out.print("For A x B grid Enter Value of A : ");  
        int a= sc.nextInt();  
        System.out.print("For A x B grid Enter Value of B : ");  
        int b= sc.nextInt();
         //
        System.out.println(numberOfuniquePaths(a, b));
    }
}