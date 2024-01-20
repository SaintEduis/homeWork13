import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Я не знаю как подчищать строку после ввода int переменных, поэтому создал переменную "clear" для этого!
        String clear;

        while (true) {
            System.out.print("Название книги: ");
            String bookName = in.nextLine();
            System.out.print("Имя автора книги: ");
            String authorFirstName = in.nextLine();
            System.out.print("Фамилия автора книги: ");
            String authorSecondName = in.nextLine();
            System.out.print("Год публикации книги: ");
            int bookYearOfPublication = in.nextInt();
            clear = in.nextLine();

            Author author = new Author(authorFirstName, authorSecondName);
            Book book = new Book(bookName, author, bookYearOfPublication);

            System.out.println("Хотите изменить год публикации?(Да/Нет)");
            String checkOfChangeYearOfPublication = in.nextLine();

            if (checkOfChangeYearOfPublication.equalsIgnoreCase("да")) {
                System.out.println("Введите изменённый год публикации: ");
                int newYearOfPublication = in.nextInt();
                clear = in.nextLine();
                book.setYearOfPublication(newYearOfPublication);
            }

            System.out.println("Название книги: " + book.getName() + "\nАвтор: " + author.getFirstName() + " " + author.getSecondName()
                    + "\nГод публикации: " + book.getYearOfPublication());

            System.out.println("Хотите ввести ещё книгу?(Да/Нет)");
            String checkOfContinue = in.nextLine();

            if (checkOfContinue.equalsIgnoreCase("нет")) {
                break;
            }
        }
    }
}