interface LibraryUser {
    void registerAccount();
    void requestBook();
}

class KidUsers implements LibraryUser {

    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

class AdultUser implements LibraryUser {

    int age;
    String bookType;

    @Override
    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        System.out.println("===== Test Case #1 : Kid User =====");

        KidUsers kidUser = new KidUsers();

        kidUser.age = 10;
        kidUser.registerAccount();

        kidUser.age = 18;
        kidUser.registerAccount();

        kidUser.bookType = "Kids";
        kidUser.requestBook();

        kidUser.bookType = "Fiction";
        kidUser.requestBook();

        System.out.println();

        System.out.println("===== Test Case #2 : Adult User =====");

        AdultUser adultUser = new AdultUser();

        adultUser.age = 5;
        adultUser.registerAccount();

        adultUser.age = 23;
        adultUser.registerAccount();

        adultUser.bookType = "Kids";
        adultUser.requestBook();

        adultUser.bookType = "Fiction";
        adultUser.requestBook();
    }
}