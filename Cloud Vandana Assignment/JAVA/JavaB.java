import java.util.Scanner;
public class JavaB {

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = getValue(currentChar);

            if (currentValue < prevValue)
                result -= currentValue;
            else
                result += currentValue;

            prevValue = currentValue;
        }

        return result;
    }

    public static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String romanNumeral;
        System.out.print("Enter Roman Number :- ");
        romanNumeral= input.next();
        int intValue = romanToInt(romanNumeral.toUpperCase());
        if (intValue==0) {
           System.out.println("The integer value of " + romanNumeral + " is not defined" ); 
        }else{
            System.out.println("The integer value of " + romanNumeral + " is " + intValue);
        }
    }
}