package ArraysLab;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int inputDay = Integer.parseInt(scanner.nextLine());

        if (inputDay >= 1 && inputDay <= 7) {
            System.out.println(weekDays[inputDay - 1]);
        } else {
            System.out.println("Invalid day!");
        }

        String[] newArray = scanner.nextLine().split(" ");

    }
}
