import java.util.*;

public class selectionExercise1{



    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);

     int max =compare(sc.nextInt(),sc.nextInt());
     int max2 =compare (max,sc.nextInt());
     System.out.println("Max value was "+max2);

    }

    private static int compare(int max, int nextInt) {

        if(max>nextInt)
        return max;
        return nextInt;
    }




}