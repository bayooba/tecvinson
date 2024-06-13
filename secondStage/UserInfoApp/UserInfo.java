import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your title e.g (Mr, Mrs, Prof.):");
        String Title = scanner.nextLine();
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter your email address:");
        String email = scanner.nextLine();
        System.out.println("Enter your phone number with country code e.g +234___");
        String phone = scanner.nextLine();
        System.out.println("You are from which country?");
        String country = scanner.nextLine();
        System.out.println("Enter your date of birth e.g 20-20-2000");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Where were you born?");
        String placeOfBirth = scanner.nextLine();
        System.out.println("Enter your current location:");
        String location = scanner.nextLine();
        System.out.println("Enter your gender:");
        String gender = scanner.nextLine();

        System.out.println("\nYour details are: \n" +
                "Title:             " + Title + "\n" +
                "First Name:        " + firstName + "\n" +
                "Last Name:         " + lastName + "\n" +
                "Email:             " + email + "\n" +
                "Phone number:      " + phone + "\n" +
                "Country:           " + country + "\n" +
                "Date of Birth:     " + dateOfBirth + "\n" +
                "Place of Birth:    " + placeOfBirth + "\n" +
                "Current location:  " + location + "\n" +
                "Gender:            " + gender);
    }
}