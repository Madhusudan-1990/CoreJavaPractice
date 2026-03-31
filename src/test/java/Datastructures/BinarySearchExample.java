package Datastructures;

class BinarySearchExample{ 
	
//Define the method with an array and a target value as parameters.	
//	Initialize left and right pointers to the start and end of the array, respectively.
//	Loop as long as left is less than or equal to right.
//	Find the middle of the current array segment (left + (right - left) / 2).
//	Compare the target with the middle element:
//	If equal, return the middle index (target found).
//	If the target is greater, search the right half (left = mid + 1).
//	If the target is less, search the left half (right = mid - 1).
//	If the loop ends without finding the target, return -1 (target not found).
	
	 public static void binarySearch(int arr[], int first, int last, int key){  
	   int mid = (first + last)/2;  
	   while( first <= last ){  
	      if ( arr[mid] < key ){  
	        first = mid + 1;     
	      }else if ( arr[mid] == key ){  
	        System.out.println("Element is found at index: " + mid);  
	        break;  
	      }else{  
	         last = mid - 1;  
	      }  
	      mid = (first + last)/2;  
	   }  
	   if ( first > last ){  
	      System.out.println("Element is not found!");  
	   }  
	 }  
	 public static void main(String args[]){  
	        int arr[] = {10,20,30,40,50};  
	        int key = 30;  
	        int last=arr.length-1;  
	        binarySearch(arr,0,last,key);     
	 }  
	}  

//The `Collections.binarySearch()` method in Java provides an efficient way to perform binary search on sorted lists, like `ArrayList` or `LinkedList`. It quickly finds the index of a target element or returns a negative insertion point if the element is not found. This method requires the list to be sorted and can work with natural ordering or a custom `Comparator`. It simplifies searching operations in Java Collections, offering a standardized and optimized approach for locating elements.
