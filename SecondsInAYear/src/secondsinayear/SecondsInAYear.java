/* MOOC Java Tutorial 5
 * Java Tutorial 5
 * Montana Braswell
 * 11/2/2017
 */
package secondsinayear;

/**
 *
 * @author Montana
 */
public class SecondsInAYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Making variables to use in forms for time
        int year;
        int day;
        int hours;
        int minute;
        int seconds;
        int numOfSecondsHour; 
        int numOfSecondsDay;
        int numOfSeconds365;
        
        // iniatiang variables 
        year = 365;
        day = 24;
        hours = 60;
        minute =60;
        
        numOfSecondsHour = hours * minute;
        System.out.println("Number of Seconds per hour:" + numOfSecondsHour);
        
        numOfSecondsDay = day * numOfSecondsHour;
        System.out.println("Number of Seconds per day: " + numOfSecondsDay);
        
        numOfSeconds365 = numOfSecondsDay * year;
        System.out.println("Number of Seconds in a day * in a year " + numOfSeconds365);
        
        System.out.println("There are: " + numOfSeconds365 + " in a year");
    }
    
}
