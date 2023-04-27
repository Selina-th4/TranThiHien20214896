package Lab01;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, month;
        String monthStr;

        while (true) {
            // Nhập năm
            System.out.print("Enter year: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid year. Please enter a non-negative integer.");
                scanner.next();
                continue;
            }
            year = scanner.nextInt();
            if (year < 0) {
                System.out.println("Invalid year. Please enter a non-negative integer.");
                continue;
            }

            // Nhập tháng
            System.out.print("Enter month: ");
            monthStr = scanner.next();
            month = getMonth(monthStr);
            if (month == -1) {
                System.out.println("Invalid month. Please enter a valid month.");
                continue;
            }

            // Tính số ngày trong tháng
            int numDays = getNumDays(year, month);
            System.out.println("Number of days in " + monthStr + " " + year + " is " + numDays + ".");
            break;
        }
    }

    // Hàm chuyển đổi từ chuỗi tháng sang số tháng
    private static int getMonth(String monthStr) {
        String[] months = {"", "jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        monthStr = monthStr.toLowerCase();
        for (int i = 1; i <= 12; i++) {
            if (monthStr.equals(months[i]) || monthStr.equals(String.valueOf(i)) ||
                    monthStr.equals(months[i].substring(0, 3))) {
                return i;
            }
        }
        return -1;
    }

    // Hàm tính số ngày trong tháng
    private static int getNumDays(int year, int month) {
        int[] numDaysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int numDays = numDaysInMonth[month];
        if (month == 2 && isLeapYear(year)) {
            numDays++;
        }
        return numDays;
    }

    // Hàm kiểm tra năm nhuận
    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}


  

