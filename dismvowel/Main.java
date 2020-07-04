public class Main {
    public static String disemvowel(String str) {
        //the code below defines input string as an array and a temp array
        char[] strArr = str.toCharArray();
        char[] tempArr = new char[strArr.length];

        //the code below takes out a vowels and creates an array that is shorter (without vovels)
        for (int i = 0, j=1; i< str.length(); i++){
            if (strArr[i] == 'a' || strArr[i] == 'i' || strArr[i] == 'e' || strArr[i] == 'o' || strArr[i] == 'u'||strArr[i] == 'A' || strArr[i] == 'I' || strArr[i] == 'E' || strArr[i] == 'O' || strArr[i] == 'U') {
                continue;
            }
            tempArr = new char[j++];
        }

        //the code below skips fi it detects a vowel and moves to the next character
        for (int i = 0, j=0; i< strArr.length; i++) {

            if (strArr[i] == 'a' || strArr[i] == 'i' || strArr[i] == 'e' || strArr[i] == 'o' || strArr[i] == 'u'||strArr[i] == 'A' || strArr[i] == 'I' || strArr[i] == 'E' || strArr[i] == 'O' || strArr[i] == 'U') {
                continue;
            }
            tempArr[j]=strArr[i];
            j++;
        }

        //the code below defines string as as new string with tempArr as values and returns str
        str = new String(tempArr);
        return str;
    }

    public static void main(String[] args) {
        //the code below defines a target string and calls method
        String qwert = "This string is a example string for a demo purpose";
        disemvowel(qwert);
    }

}
