package dayoftheweek;

import java.util.Scanner;

public class DayOfTheWeek
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int day;

        Scanner whatDay = new Scanner(System.in);
        System.out.println("Pick a number between 1-7.");
        day = whatDay.nextInt();

        if (day == 1)
        {
            System.out.println("Day 1 of the week is Sunday!");
        } else if (day == 2)
        {
            System.out.println("Day 2 of the week is Monday!");
        } else if (day == 3)
        {
            System.out.println("Day 3 of the week is Tuesday!");
        } else if (day == 4)
        {
            System.out.println("Day 4 of the week is Wednesday!");
        } else if (day == 5)
        {
            System.out.println("Day 5 of the week is Thursday!");
        } else if (day == 6)
        {
            System.out.println("Day 6 of the week is Friday!");
        } else if (day == 7)
        {
            System.out.println("Day 7 of the week is Saturday!");
        };
    }
}