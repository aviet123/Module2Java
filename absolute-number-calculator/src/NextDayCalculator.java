public class NextDayCalculator {

    public static int getLastDayOfMonth(int month){

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> 28;
            case 4, 9, 6, 11 -> 30;
            default -> -1;
        };
    }
    public static int getDay(int day, int month){
        boolean nextDayOfMonth = day == getLastDayOfMonth(month);
        if (nextDayOfMonth) {
            day = 1;
        }else {
            day += 1;
        }
        return day;
    }
    public static int getMonth(int day, int month){
        boolean nextMonthNewYear = day == getLastDayOfMonth(month) && month == 12;
        if (nextMonthNewYear){
            month = 1;
        }else {
            boolean nextMonth = day == getLastDayOfMonth(month) && month < 12;
            if (nextMonth){
                month += 1;
            }
        }
        return month;

    }
    public static int getYear(int day, int month, int year){
        boolean nextYearConditional = day == getLastDayOfMonth(month) && month == 12;
        if (nextYearConditional){
            year += 1;
        }
        return year;
    }
    public static int[] getDayMonthYear(int day, int month, int year){
        int[] array = new int[3];
        array[0] = getDay(day, month);
        array[1] = getMonth(day, month);
        array[2] = getYear(day, month, year);

        return array;
    }


}
