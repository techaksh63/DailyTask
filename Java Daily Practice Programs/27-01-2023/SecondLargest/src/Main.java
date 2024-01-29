//import java.util.ArrayList;
//import java.util.List;
public class Main {
    public static void main(String[] args) {
//        int arrayLength = 8;
//        List<Integer> arr = new ArrayList<>(arrayLength);
//        arr.add(4);
//        arr.add(6);
//        arr.add(3);
//        arr.add(4);
//        arr.add(6);
//        arr.add(5);
//        arr.add(70);
//        arr.add(8);
//        arr.add(60);
//        System.out.println("Original Array is : "+arr);
//        arr.sort(null);
//        System.out.println("Second largest element is : "+ arr.get(arrayLength-1));

        int[] array = {4, 6, 3, 4, 6, 5, 70, 8, 60};
        int secondLargest = findSecondLargest(array);
        System.out.println("Second largest element: " + secondLargest);

    }

//    void secondLargestElement(){
//        int[] array = {4,6,3,4,6,5,70,8,60};
//        int n = array.length;
//        int i, j, temp;
//        boolean swap;
//        for(int i=0; i<= n; i++ ){
//            swap = false;
//            for(int j=0; j<= n-j; j++){
//
//            }
//        }count++;
//    }

    public static int findSecondLargest(int[] array) {
        int largest = 0;
        int secondLargest = 0;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }


}
