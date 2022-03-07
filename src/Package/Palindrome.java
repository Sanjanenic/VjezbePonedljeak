package Package;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
      //Was it a car or cat I sow
      //Murder for a jar of red rum
        //Go hang a salami, I´m a lasagna hog.
        //Otto

       isPalindrome("Anna") ;
        System.out.println(isPalindrome("Was it a car ra cat I saw"));
    }
    public static boolean isPalindrome(String potentialPalindrome){
        potentialPalindrome = potentialPalindrome.toLowerCase();
        potentialPalindrome =potentialPalindrome.replace("'", "");
        potentialPalindrome =potentialPalindrome.replace(",", "");
        potentialPalindrome =potentialPalindrome.replace(" ", "");

        char firstLetter = potentialPalindrome.charAt(0);
        char lastLetter = potentialPalindrome.charAt((potentialPalindrome.length()-1));

        if (firstLetter == lastLetter){
            potentialPalindrome = potentialPalindrome.substring(1,potentialPalindrome.length()-1);  //Substring index ima od 1
            if(potentialPalindrome.length()<=1){
                return true;
            }
            return isPalindrome(potentialPalindrome);
        }
        return false;

    }
}
