import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
    /*1. Java API has the GregorianCalendar class in the java.util package, which you can use to
    obtain the year, month, and day of a date. The no-arg constructor constructs an instance
    for the current date, and the methods get(GregorianCalendar.YEAR),
    get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return
    the year, month, and day.
    Write a program to perform two tasks:
    • Display the current year, month, and day.
    • The GregorianCalendar class has the method setTimeInMillis(long), which can
    be used to set a specified elapse time since January 1, 1970. Set the value to
    1234567898765L and display the year, month, and day*/

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("Current year: " + cal.get(GregorianCalendar.YEAR) +
                " Current month: " + cal.get(GregorianCalendar.MONTH) +
                " Current day: " + cal.get(GregorianCalendar.DAY_OF_MONTH));

        cal.setTimeInMillis(1234567898765L);
        System.out.println("Current year: " + cal.get(GregorianCalendar.YEAR) +
                " Current month: " + cal.get(GregorianCalendar.MONTH) +
                " Current day: " + cal.get(GregorianCalendar.DAY_OF_MONTH));

        StopWatch watch = new StopWatch();
        System.out.println("Current time --> watch.start(): " + watch.start());

        int[] arr = new int[100000];
        int min = 50;
        int max = 100;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);

        System.out.println("Current time --> watch.stop(): " + watch.stop());
        System.out.println("Current time --> watch.getElapsedTime(): " + watch.getElapsedTime() + "ms");

    }
}