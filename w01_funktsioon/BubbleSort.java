import java.util.Random;


public class BubbleSort {  
        //Source https://www.javatpoint.com/bubble-sort-in-java
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        int cnt = 0;
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                  
                                 cnt+=1;
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
         System.out.println("Integers got switched "+cnt+" times");}  
         // Source https://www.quora.com/How-do-I-find-out-how-many-times-a-loop-will-execute-in-JAVA
         
    public static void main(String[] args) {  
        int x = (int)(Math.random()*((100-10)+1))+10;
        // Source https://dzone.com/articles/random-number-generation-in-java
                
            
        Random r = new Random();
        int[] ar1 = new int[x];
        for(int k = 0; k < ar1.length; k++) {
            ar1[k] = r.nextInt(10001);
            
        } 
        // Source https://stackoverflow.com/questions/25768435/how-to-fill-an-array-with-random-numbers-from-0-to-99-using-the-class-math
                 
                System.out.println("Array before sorting:");  
                for(int i=0; i < ar1.length; i++){  
                        System.out.print(ar1[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(ar1); 
                 
                System.out.println("Array after sorting");  
                for(int i=0; i < ar1.length; i++){  
                        System.out.print(ar1[i] + " ");  
                }  
   
        }  
}  