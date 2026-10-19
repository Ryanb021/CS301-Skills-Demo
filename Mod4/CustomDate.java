public class CustomDate {
    public static void main(String[] args) {

        // Create a date object
        CustomDate date1 = new CustomDate(1, 1, 2027);
        CustomDate date2 = new CustomDate(1, 10, 2027);

        // Display the date
        System.out.println("First date: " );
        date1.displayDate();

        System.out.println("Second date: ");
        date2.displayDate();

        // Find the days between the dates
        System.out.println("Days between: " + date1.daysInBetween(date2));

        // Display the day of the week
        System.out.println("Day of the week: " + date1.getDayOfWeek());
    }

    // Variables to store the date
    private int month;
    private int day;
    private int year;

    // Constructor to create the date
    public CustomDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Method to display the date
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    // Method to find the number of days in a month
    public int daysInMonth(int month) {

        if(month == 2) {
            return 28;
        }

        if(month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }

        return 31;
    }

    // Method to count the total number of days
    public int totalDays() {

        // Count the days in previous years
        int total = (year - 1) * 365;

        // Add the days in previous months
        for(int m = 1; m < month; m++) {
            total = total +daysInMonth(m);
        }

        // Add the current day
        total = total + day;

        return total;
    }

    // Method to calculate days between two dates
    public int daysInBetween(CustomDate otherDate) {

        int difference = totalDays() - otherDate.totalDays();

        // Make the difference positive
        if(difference < 0) {
            difference = difference * -1;
        }

        return difference;
    }

    // Method to find the day of the week
    public String getDayOfWeek() {

        String[] days = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" 
        };

        // Find the weekday
        int weekday = (totalDays() - 1) % 7;

        return days[weekday];
    }
}