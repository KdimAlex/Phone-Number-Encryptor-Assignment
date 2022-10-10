
import java.util.Scanner;
public class Lab7PhoneCodeHelp {

    private static final Scanner keyboard = new Scanner (System.in);
    private static final int MIN_INPUT_VALUE = 999999;
    private static final int MAX_INPUT_VALUE = 9999999;

    public static void main(String[] args) {

        int inputPhoneNumber;

        do{
            System.out.println("Enter a 7 digit number: ");
            inputPhoneNumber = keyboard.nextInt();
        } while (inputPhoneNumber < MIN_INPUT_VALUE || inputPhoneNumber >= MAX_INPUT_VALUE);

        String encoded7DigitPhone = encodeNumber(inputPhoneNumber);
        String encoded305 = encodeNumber(305);

        String finalEncodedPhoneNumber = encoded305 + encoded7DigitPhone;
        System.out.println(finalEncodedPhoneNumber);
    } //end of the main method

    private static String encodeNumber (int inputPhoneNumber){
        String result = "";

        char [] letters = {'0','1','A','D','G','J','M','P','T','W'};
        int [] numberOfOptions = {1,1,3,3,3,3,3,4,3,4};

        int digit;

        while (inputPhoneNumber > 0){

            digit = inputPhoneNumber % 10;
            int numberOfChoice = (int)Math.floor(Math.random() * numberOfOptions[digit]);

            char encoded = (char)(letters[digit] + numberOfChoice);

            result = encoded + result;

            inputPhoneNumber = inputPhoneNumber / 10;

        } // end of the while loop

        return(result);

    } //end of the encodeNumber method




} // end of the class
