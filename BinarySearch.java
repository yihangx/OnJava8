import java.util.*;

public class BinarySearch {
  public static void main(String[] args) {
     Object arr[] = {10,2,22,69};
     Arrays.sort(arr);     // let us print all the elements available
     System.out.println("The sorted array is:");
     for (Object number : arr) {
        System.out.println("Number = " + number);
     }
     int searchVal = 22;
     int retVal = Arrays.binarySearch(arr,searchVal);
     System.out.println("The index of element 22 is : " + retVal);
  }
}
