public class MatchPhoneNumber {

    public static void main(String[] args) {
        
        // Regular expression for phone numbers
        String regex = "(\\([0-9]{3}\\) )?[0-9]{3}-[0-9]{4}";
        // Phone numbers to test
        String phone1 = "(609) 555-1234";
        String phone2 = "555-1234";
        String phone3 = "609-555-1234";
        String phone4 = "1234567";

        // Check for phone numbers match
        System.out.println(phone1 + ": " + phone1.matches(regex));
        System.out.println(phone2 + ": " + phone2.matches(regex));
        System.out.println(phone3 + ": " + phone3.matches(regex));
        System.out.println(phone4 + ": " + phone4.matches(regex));
    }
}
