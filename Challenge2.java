import java.util.ArrayList; //Needed for making the array

//Min 4 Max 32 for string
public class Challenge2 {
    public static void main(String[] args) {

        String patternOne = "ABABABNMNM";
        String patternTwo = "BZBZBZHXHX";

        String convertPatternOne = "" ;
        String convertPatternTwo = "" ;

        ArrayList<Character> Set = new ArrayList<Character>();

        int patternOneSize = patternOne.length();
        int patternTwoSize = patternTwo.length();

        for ( int x = 0 ; x < patternOneSize ; x++ ){
            char character = patternOne.charAt(x);
            System.out.print(character);
            if (Set.contains(character)) {
                convertPatternOne = convertPatternOne + Set.indexOf(character);
                System.out.println("Check one");
            } else {
                Set.add(character);
                convertPatternOne = convertPatternOne + Set.indexOf(character);
                System.out.println("Check two");
            }
        }

        Set.clear();

        for ( int x = 0 ; x < patternTwoSize ; x++ ){
            char character = patternTwo.charAt(x);
            System.out.print(character);
            if (Set.contains(character)) {
                convertPatternTwo = convertPatternTwo + Set.indexOf(character);
                System.out.println("Check one");
            } else {
                Set.add(character);
                convertPatternTwo = convertPatternTwo + Set.indexOf(character);
                System.out.println("Check two");
            }
        }

        Set.clear();

        /* 
        do {
            String x = inputOne.next();
            System.out.print(x);
            if (Set.contains(x)) {
                convertPatternOne = convertPatternOne + Set.indexOf(x);
                System.out.println("Check one");
            } else {
                Set.add(x);
                convertPatternOne = convertPatternOne + Set.indexOf(x);
                System.out.println("Check two");
            }
        } while (inputOne.hasNext());

        System.out.println(convertPatternOne);

        Set.clear();

        do {
            String x = inputTwo.next();
            System.out.print(x);
            if (Set.contains(x)) {
                convertPatternTwo = convertPatternTwo + Set.indexOf(x);
            } else {
                Set.add(x);
                convertPatternTwo = convertPatternTwo + Set.indexOf(x);
            }
        } while (inputTwo.hasNext());
        */
        boolean compare = true;
        int one = convertPatternOne.length();

        for ( int x = 0 ; x < one ; x++ ){
            char character = convertPatternOne.charAt(x);
            char characterTwo = convertPatternTwo.charAt(x);
            if (character != characterTwo) {
                compare = false;
            }
        }
        System.out.println(convertPatternOne);
        System.out.println(convertPatternTwo);
        System.out.println(compare);
    }
}