import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (65 <= ch && ch <= 90){
            ch = (char) ((ch)+32);
            return(ch);
        
        }
        else {
            ch = (ch);
            return(ch);
        }
        
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String ert = "";
        for (int k = 0; k < str.length(); k++){
            char wer = str.charAt(k);
            if (65 <= wer && wer <= 90){
                wer = (char) ((wer)+32);
            }
            ert = ert + wer;
            
        }
        return(ert);
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (97 <= ch && ch <= 122){
            ch = (char) ((ch)-32);
            return (ch);
        }
        else {
            ch = (ch);
            return (ch);
        }
        
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String qaw = "";
        for (int k = 0; k < str.length(); k++){
            char wsx = str.charAt(k);
            if (97 <= wsx && wsx <= 122){
                wsx = (char) ((wsx)-32);
            }
            qaw = qaw + wsx;
        }
        return(qaw);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string");
        String str = scan.next();
        System.out.println("Do you want your string uppercase or lowercase?");
        String lwer = "lowercase";
        String upr = "uppercase";
        String grb = scan.next();
        if (grb == lwer){
            System.out.println("Here is your string in "+ lwer + myToLowerCase(str));
        }
        if (grb == upr){
            System.out.println("Here is your string in "+ upr + myToUpperCase(str));
        }
        else {
            System.out.println("Please make sure you made no spelling errors");
        }

    }
}
