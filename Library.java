import java.util.Scanner;
import java.util.InputMismatchException;

class Library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Books book = new Books();

        // Getting Book Name
        System.out.print("Enter the book name: ");
        String bookName = sc.nextLine();

        try {
            book.setBookName(bookName);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return; // Exit the program if book name is not provided
        }

        // Getting Author Name
        System.out.print("Enter the author name: ");
        String authorName = sc.nextLine();

        try {
            book.setAuthorName(authorName);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return; // Exit the program if author name is not provided
        }

        // Getting Year
        System.out.print("Enter the publication year: ");
        int year = 0;
        try {
            year = sc.nextInt();
            book.setYear(year);
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Invalid input for year.");
            sc.nextLine(); // Clear the scanner buffer
            return; // Exit the program
        }

        // Getting Amount
        System.out.print("Enter the amount: ");
        double amount = 0.0;
        try {
            amount = sc.nextDouble();
            book.setAmount(amount);
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Invalid input for amount.");
            sc.nextLine(); // Clear the scanner buffer
            return; // Exit the program
        }

        // Displaying Book Information
        System.out.println("\nBook Information:");
        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Author Name: " + book.getAuthorName());
        System.out.println("Publication Year: " + book.getYear());
        System.out.println("Amount: " + book.getAmount());

        sc.close();
    }
}
