/*2. Design a class named StopWatch. The class contains:
• Private attributes startTime and endTime with get methods.
• A no-arg constructor that initializes startTime with the current time.
• A method start() that resets the startTime to the current time.
• A method stop() that resets the endTime to the current time.
• A method getElapsedTime() that returns the elapsed time for the stopwatch in
milliseconds.
Draw a class diagram for this class and then implement the class. Write a test program
that measures the execution time of sorting 100,000 numbers using selection sort.*/

import java.time.Duration;
import java.time.LocalTime;
import java.util.GregorianCalendar;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();

    }

    public long start() {
        this.startTime = System.currentTimeMillis();
        return startTime;
    }

    public long stop() {
        this.endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime() {
        return (endTime - startTime);


    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}

