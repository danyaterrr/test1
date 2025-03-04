import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int N = 20;
        int[] myArray = new int[N];
        Random r = new Random();

        for (int i = 0; i < N; ++i) {
            myArray[i] = r.nextInt(15) + 1;
        }
        System.out.println(Arrays.toString(myArray));

        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int val : myArray) {
            if (myMap.containsKey(val)) myMap.put(val, myMap.get(val) + 1);
            else{
                myMap.put(val, 0);
            }
        }

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if (entry.getValue() > 1)
                System.out.println("Число " + "'" + entry.getKey() + "'" + " встречается " + entry.getValue() + " раза ");
        }
    }
}