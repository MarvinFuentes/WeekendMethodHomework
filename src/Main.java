/**
 * @Class: Main
 * @Aurthor: Marvin Fuentes
 * @Course: ITEC 2140 Section 4
 * @Written: March 27, 2023
 * This program consist of all the coding bat questions we got assigned
 * as method homework. Every single method is invoked with in the main method
 * of the code. Before invoking each method the integer or String is initialized.
 * Each method prints out the original string or integer and then will show
 * the result from the block of code within the invoked method.
 */
public class Main {
    public static void main(String[] args) {
        Main instanceOfMain = new Main();

        System.out.println("1. Original String: Marvin," + " reverseDoubleChar: " + instanceOfMain.reverseDoubleChar("Marvin"));

        System.out.println("2. n = 20," + " sumDigits: " + instanceOfMain.sumDigits(20));

        System.out.println("3. Original String: Jocelyn," + " birthdayName: " + instanceOfMain.birthdayName("Jocelyn"));

        System.out.println("4. Original String: System," + " missingFront: " + instanceOfMain.missingFront("System"));

        System.out.println("5. Original String: 123456789," + " swapEnds: " + instanceOfMain.swapEnds("123456789"));

        System.out.println("6. Original String: Character," + " everyOther: " + instanceOfMain.everyOther("Character"));

        System.out.println("7. Original Strings: a - My, b - Name," + " nonStart: " + instanceOfMain.nonStart("My","Name"));

        System.out.println("8. m = 10," + " fibonacci: " + instanceOfMain.fibonacci(10));

        System.out.println("9. int x = 5, int y = 7, int z = 13," + " luckySum: " + instanceOfMain.luckySum(5,7,13));

        System.out.println("10. Original String: rotator," + " hasPalindrome: " + instanceOfMain.hasPalindrome("rotator"));

        System.out.println("11. int j = 4," + " powerOfTwo: " + instanceOfMain.powerOfTwo(4));
    }

    public String reverseDoubleChar(String word){  // Given a string, return a string where
        char r;                                    // for every char is the original, there
        String str = "";                           // are two chars.
        for(int i = 0; i < word.length(); i++){
            r = word.charAt(i);
            str = r + str;
            str = r + str;
        }
        return str;
    }

    public int sumDigits(int n){ // Given a non negative int n, return
        int sum = 0;             // the sum of its digits ( in a while loop)
        while (n > 0){
            int a = n % 10;
            sum += a;
            n = n/10;
        }
        return sum;
    }

    public String birthdayName(String name){  // Given a string name, e.g. "Susan", return
        String birthday = "Happy Birthday ";  // a message of the form "Happy Birthday Susan!".
        return birthday + name + "!";
    }

    public String missingFront(String front){  // Given a string, return a version without the first 3 chars.
        return front.substring(3);
    }

    public String swapEnds(String str) {  // Given a string, return a new string where the first
        if (str.length() < 2){            // and last characters have been exchanged. For example:
            return str;                   // swapEnds("hello") → "oellh."
        }
        String str1 = "";
        int len = str.length();
        str1 = str.charAt(len-1) + str.substring(1, len -1) + str.charAt(0);
        return str1;
    }

    public String everyOther(String other) {          // Given a string, return a new string made of every
        StringBuilder result = new StringBuilder(); // other character starting with the first character.
        for (int i = 0; i < other.length(); i += 2){  // For example: everyOther("hello") → "hlo"
            result.append(other.charAt(i));
        }
        return result.toString();
    }

    public String nonStart(String a, String b) {  // Given two strings, return their concatenation,
        String tempA = "";                        // except omit the first character of each string.
        String tempB = "";                        // The strings will be at least length 1.
        if (a.length() < 1){                      // nonStart("Hello", "There") → "ellohere"
            return tempA;
        }
        if (b.length() < 1){
            return tempB;
        }
        return a.substring(1) + b.substring(1);
    }

    public int fibonacci(int m) {  // The Fibonacci sequence is a series of numbers in which each number
        if (m <= 1) {              // is the sum of the two preceding ones, usually starting with 0 and 1.
            return m;              // Write a method fibonacci that takes an integer n as input and returns
        }                          // the nth number in the Fibonacci sequence. Assume that n is non-negative.
        else {
            return fibonacci (m - 1) + fibonacci (m - 2);
        }
    }

    public int luckySum(int a, int b, int c) {  // Given three int values, a, b, and c, return their sum. However,
        if (a == 13){                           // if one of the values is 13 then it does not count towards the sum
            return 0;                           // and the values to its right do not count. So for example, if a is
        }                                       // 13, then b and c do not count.
        if (b == 13){
            return a;
        }
        if(c == 13){
            return a + b;
        }
        if ( a != 13 && b != 13 && c != 13 ){
            return a + b + c;
        }
        return a;
    }

    public boolean hasPalindrome(String original) {
        String reverse = "";
        original = original.toLowerCase().replaceAll("[!\\,\\?\\:]", "");
        original = original.replace(" ","");   // Write a method countPalindromes that takes a string as
        for (int i = original.length() - 1; i >= 0; i--){      // input and returns if the string is a palindrome or not.
            reverse += original.charAt(i);                     // The string value can be formed by taking contiguous
        }                                                      // substrings of the string, including non-alphanumeric
        for ( int i = 0; i < original.length(); i++){          // characters. A palindrome is a string that reads the
            if (original.charAt(i) != reverse.charAt(i)){      // same backward as forward. For example, "racecar" and
                return false;                                  // "level" are palindromes.
            }
        }
        return true;
    }

    public boolean powerOfTwo(int n) {   // Given a non-negative int n, return true
        if( n == 1){                     // if it is a power of 2. (must use the do-while loop)
            return true;
        }
        if ( n <= 0){
            return false;
        }
        do{
            if(n % 2 != 0){
                return false;
            }
            n /= 2;
        }
        while(n > 1);
        return true;
    }
}