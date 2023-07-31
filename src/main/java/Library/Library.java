package Library;

import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

public class  Library extends Book  {

    public static void Method() throws InputMismatchException {
        throw new InputMismatchException("String is not valid");
    }
    public static void main(String[] args){

        int i = 0;
        while (i == 0) {

            Book book = new Book();
            Scanner input = new Scanner(System.in);

            System.out.println("********** WELCOME TO THE FENY LIBRARY **********");
            System.out.println("Select from the Following options: ");
            System.out.println("-------------------------------------------------");

            System.out.println("Press 0: To Exit the Application:");
            System.out.println("Press 1: To Add Book:");

            int num = input.nextInt();
            switch (num) {
                case 0 :
                    System.exit(0);
                case 1:
                    System.out.println("Enter SerialNo:");
                    int sNo = input.nextInt();
                    book.setsNo(sNo);
                    System.out.println("This is book serial no " + book.getsNo());

                    System.out.println("Enter Book Name:");
                    String bookName = input.nextLine();
                    book.setBookName(bookName);

                    System.out.println("This is book name " + book.getBookName());

                    System.out.println("Enter Author Name:");
                    String authorName = input.nextLine();
                    book.setAuthorName(authorName);
                    System.out.println("This is book author name " + book.getBookName());
                    try {
                        System.out.println("Enter Book Quantity :");
                        int bQty = input.nextInt();
                        book.setBookQty(bQty);
                        Method();
                    }catch (InputMismatchException e){
                        System.out.println("This is book quantity " + book.getBookQty());
                        System.out.println("Only Integer Value Is Valid");
                    }
                    break;
                case 2:
                    System.out.println(book);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
