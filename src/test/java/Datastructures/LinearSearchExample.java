package Datastructures;

public class LinearSearchExample{    
	//Step 1: Traverse over the array.
	//Step 2: Match the key element with array element.
	//Step 3: If key element is found, return the index position of the array element.
	//Step 4: If key element is not found, return -1.
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] a1= {10,20,30,50,70,90};    
        int key = 50;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}
//Advantages
//Simplicity: It is easy to understand and implement.
//No Preprocessing: It does not require the data to be sorted.
//Versatility: It can be used on any type of data structure (arrays, linked lists, etc.).

//Disadvantages
//Inefficiency: On average, it requires checking half of the elements (O(n/2)) and, in the worst case, all elements (O(n)).
//Not Suitable for Large Datasets: It becomes impractical as the size of the dataset increases.