//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        String s = "racecar";
        int [] x = {1, 2, 3, 4, 6, 7, 9, 10};

//        palindrome
        System.out.println( "Palindrome is: " + TwoPointer.checkIfPalindrome(s));

//        two sum
        System.out.println(TwoPointer.checkTarget(x));

    }

}