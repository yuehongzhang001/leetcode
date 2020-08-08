/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1185 {

    public String dayOfTheWeek(int day, int month, int year) {
        int currentYear = 1971;
        int currentMonth = 1;
        int currentDay = 1;
        int currentWeek = 5;
        int y = currentYear;
        String[] map = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;
        while (y < year) {
            if (y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
                sum += 366;
            } else {
                sum += 365;
            }
            y++;
        }
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            days[2] = 29;
        }
        int m = 1;
        while (m < month) {
            sum += days[m++];
        }
        sum += day-1;

        return map[(sum % 7 + 5) % 7];
    }
}
