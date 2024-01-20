import java.util.Scanner;

public class a3_hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter today (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int today = sc.nextInt();
        
        System.out.println("Enter the number of days elapsed since today: ");
        int daysElapsed = sc.nextInt();
        
        String currentDay = "", futureDay = "";

        switch (today) {
            case 0:
                currentDay = "Sunday";
                break;
            case 1:
                currentDay = "Monday";
                break;
            case 2:
                currentDay = "Tuesday";
                break;
            case 3:
                currentDay = "Wednesday";
                break;
            case 4:
                currentDay = "Thursday";
                break;
            case 5:
                currentDay = "Friday";
                break;
            case 6:
                currentDay = "Saturday";
                break;
        }

        switch ((today + daysElapsed) % 7) {
            case 0:
                futureDay = "Sunday";
                break;
            case 1:
                futureDay = "Monday";
                break;
            case 2:
                futureDay = "Tuesday";
                break;
            case 3:
                futureDay = "Wednesday";
                break;
            case 4:
                futureDay = "Thursday";
                break;
            case 5:
                futureDay = "Friday";
                break;
            case 6:
                futureDay = "Saturday";
                break;
        }

        System.out.println("Today is " + currentDay + " and the future day is " + futureDay);
        sc.close();
    }
}

//Enter today (0 for Sunday, 1 for Monday, ..., 6 for Saturday): 
//6
//Enter the number of days elapsed since today: 
//10
//Today is Saturday and the future day is Tuesday

