public class Main {
    public static String palindromization(String elements, int n) {
        //take n and create an array of a length N
        char[] targetArray = new char[n];
        //take string and switch it to array (input in elements)
        char[] ElementsArray = elements.toCharArray();
        //declare int that is a length of a target array
        int targetArrayLenght = targetArray.length;
        //declare int that is a length of a tempElementsArray
        int ElementsArrayLength = ElementsArray.length;
        //statements of if that separate conditions
        if (elements.length() < 1 && n <= 0){
            elements = "Error!";
        } else if (elements.length() < 1) {
            elements = "Error!";
        } else if (n <= 1) {
            elements = "Error!";  //the code above gives Error if the length of palindrome is 0 or the string is empty
        } else if (elements.length() > 1 && n > 0 && n == ElementsArrayLength) {
            for (int i = 0, j = ElementsArrayLength - 1; i < ElementsArrayLength && j >= 0; i++, j--) {
                ElementsArray[j] = ElementsArray[i];
                targetArray[j] = ElementsArray[i];
            }
            elements = new String(targetArray);
            //the code above makes palindrome if the length of a string is equal to the palindrome target length

        } else if (elements.length() > 1 && n > 0 && n < ElementsArrayLength) {
            char[] tempElementsArray = new char[targetArrayLenght];
            int[] index_to_remove = new int[targetArrayLenght];
            int index_to_removeLength = index_to_remove.length;
            for (int g = targetArrayLenght, j = 0; g < ElementsArrayLength && j < index_to_removeLength - 1; g++, j++) {
                index_to_remove[j] = g;
            }
            for (int i = 0, k = 0; i < targetArrayLenght; i++) {

                if (i == index_to_remove[i]) {
                    continue;
                }
                tempElementsArray[k++] = ElementsArray[i];

            }
            targetArray = tempElementsArray;

            for (int i = 0, j = targetArrayLenght - 1; i < targetArrayLenght && j >= 0; i++, j--) {
                ElementsArray[j] = ElementsArray[i];
                targetArray[j] = ElementsArray[i];
            }
            elements = new String(targetArray);
            //the code above makes palindrome if the length of a string is bigger than the palindrome target length

        } else if (elements.length() > 0 && n > 0 && n > ElementsArrayLength) {
            targetArray = ElementsArray;
            char[] tempElementsArray = new char[targetArrayLenght];
            for (int p = 0, x = 0; p < tempElementsArray.length; p++, x++) {
                tempElementsArray[p] = targetArray[x];
                if (x == ElementsArrayLength - 1) {
                    x = -1;
                }
            }
            targetArray = tempElementsArray;
            for (int i = 0, j = targetArrayLenght - 1; i < targetArrayLenght && j >= 0; i++, j--) {
                tempElementsArray[j] = tempElementsArray[i];
                targetArray[j] = tempElementsArray[i];
            }
            elements = new String(targetArray);
            //the code above makes palindrome if the length of a string is smaller than the palindrome target length
        }

        return elements;


    }

    public static void main(String[] args) {
        String test = "qwertyasdfzxxcz";
        int length = 15;
        palindromization(test,length);
    }
}
