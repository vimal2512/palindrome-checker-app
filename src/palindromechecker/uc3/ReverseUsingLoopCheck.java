package palindromechecker.uc3;

public class ReverseUsingLoopCheck {

    public static void execute() {

        String original = "level";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome (Loop Reverse)");
        } else {
            System.out.println(original + " is NOT a Palindrome (Loop Reverse)");
        }
    }
}
