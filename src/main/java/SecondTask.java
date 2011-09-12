import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
* Class that prints your fist and second names, date of birth in format "dd.mm.yyyy", and count of years, months and days from your birth date to current date.
*
* @version 1.0 11 Sep 2011
* @author Maxim Pedich
*/
public class SecondTask {
    public static void main(String []args) {

        /** print first name and the second name */
        System.out.println("First name: Maxim");
        System.out.println("Second name: Pedich");

        /** create calendars */
        Calendar Birthday = Calendar.getInstance();
        Calendar CurrentDate = Calendar.getInstance();
        Calendar Difference = Calendar.getInstance();

        /** assign a date of birth */
        Birthday.set(1989,8,16);

        /** setting the date format */
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        /** print the current date*/
        System.out.println("Date of birth: "+dateFormat.format(Birthday.getTime()));

        /** finding the difference between dates */
        Difference.set(Calendar.YEAR,CurrentDate.get(Calendar.YEAR)-Birthday.get(Calendar.YEAR));
        Difference.set(Calendar.MONTH,CurrentDate.get(Calendar.MONTH)-Birthday.get(Calendar.MONTH));
        Difference.set(Calendar.DATE,CurrentDate.get(Calendar.DATE)-Birthday.get(Calendar.DATE));

        if (CurrentDate.get(Calendar.YEAR)==Birthday.get(Calendar.YEAR)){
            System.out.println("Difference date: 0 y "+Difference.get(Calendar.MONTH)+" m "+Difference.get(Calendar.DAY_OF_MONTH)+ " d");
        }
        else {
            System.out.println("Difference date: "+Difference.get(Calendar.YEAR)+" y "+Difference.get(Calendar.MONTH)+" m "+Difference.get(Calendar.DAY_OF_MONTH)+ " d");
        }
    }
}
