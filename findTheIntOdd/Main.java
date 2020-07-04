import java.util.HashMap;

public class Main {
    public static int findIt(int[] a) {
        int odd = 0;
        //this part of code below creates a hash map where a value (number) and key (repetition) will be stored
        HashMap<Integer, Integer> repetitions = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.length; ++i) {
            int item = a[i];

            if (repetitions.containsKey(item))
                repetitions.put(item, repetitions.get(item) + 1);
            else
                repetitions.put(item, 1);
        }

        //the code bleow changes key\values into separate arrays

        Integer intArrValues[] = new Integer[repetitions.size()];
        repetitions.values().toArray(intArrValues);

        Integer intArrKey[] = new Integer[repetitions.size()];
        repetitions.keySet().toArray(intArrKey);

        //the code below returns value (number) where key(repetition) is odd
        for (int i = 0; i < intArrValues.length; i++) {
            if (intArrValues[i] % 2 == 1) {
                Integer intObj = intArrValues[i];
                if (repetitions.containsValue(intObj)) {
                    odd = intArrKey[i];
                }
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        //this code below defines array that will be searched for odd repeated numbers and calls a method
        int[] array = {1,1,1,1,1,1,1,1,1,10,1};
        findIt(array);
    }
}
