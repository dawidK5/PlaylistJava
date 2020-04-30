
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public int minuteSeconds(){
        int length = 210;
        int minutes;
        int seconds;
        minutes = length / 60;
        seconds = length % 60;
        System.out.println(minutes + ":" + seconds);
        return 0;
    }
}
