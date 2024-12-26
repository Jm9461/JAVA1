package com.lawyer_smartCalendar.b;

public class b {
    public static int a(int monthOfYear) {
        switch (monthOfYear) {
            case 1:
                return 31;
            case 2:
                return 31;
            case 3:
                return 31;
            case 4:
                return 31;
            case 5:
                return 31;
            case 6:
                return 31;
            case 7:
                return 30;
            case 8:
                return 30;
            case 9:
                return 30;
            case 10:
                return 30;
            case 11:
                return 30;
            case 12:
                return 29;
            default:
                return 1;
        }
    }
}
