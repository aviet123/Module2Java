package ArrayAndLoopLesson;

public class FindMinInArray {
    public static void main(String[] args) {
        int []arr = {4,12,5,6,7,8,9,15};
        int index = minValue(arr);
        System.out.println("min value in the array is: "+ arr[index]);
    }
    public static int minValue (int [] array){
        int min = array[0];
        int index = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]< min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
