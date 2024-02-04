/*
 * LinkedIn course - Java: Data Structures
 * 
*/
import java.util.Arrays;

public class ArrayExample1 {

    public static void main(String[] args) {

        String[] weekdays = new String[7];

        System.out.println(weekdays); // [Ljava.lang.String;@7ad041f3
        System.out.println(Arrays.toString(weekdays)); // [null, null, null, null, null, null, null]

        weekdays[0] = "Monday";
        weekdays[1] = "Tuesday";

        System.out.println(Arrays.toString(weekdays)); // [Monday, Tuesday, null, null, null, null, null]

        weekdays = new String[]{"Mon", "Tue", "Wed"};
        System.out.println(Arrays.toString(weekdays)); // [Mon, Tue, Wed]

        /**
         *  Weekday : Mon
            Weekday : Tue
            Weekday : Wed
         */
        for (String day: weekdays) {
            System.out.println("Weekday : " + day);
        }

        // for loop with the index
        for (int i = 0; i < weekdays.length; i++) {
            weekdays[i] = weekdays[i].toUpperCase();
        }

        System.out.println(Arrays.toString(weekdays)); // [MON, TUE, WED]
        
    }
    
}
