
public class Reader {
    private  String fullName;
    private  int libraryCard;
    private  String faculty;
    private  String dateOfBirth;
    private  String phoneNumber;
    private int countOfBooks;

    public Reader(String fullName,
                  int libraryCard,
                  String faculty,
                  String dateOfBirth,
                  String phoneNumber,
                  int countOfBooks) {

        this.fullName = fullName;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.countOfBooks = countOfBooks;
    }

    //принимает на вход количество книг, которые читатель взял и увеличивает количество их у читателя
    public void takeBook(int book) {
        countOfBooks += book;
    }

    // принимает на вход количество возвращенных книг и уменьшает их
    public void returnBook(int book) {
        countOfBooks -= book;
        if (countOfBooks <= 0) {
            System.out.println("Читатель: " + fullName + " сдал " + (countOfBooks + book) + " кн. подарил библиотеке " + (countOfBooks *(-1)));
            countOfBooks = 0;
        }
    }

    // выводит всю инфу о читателе и количество книг на руках в текущий момент
    public void status() {
        System.out.println("Читатель: " + fullName + " "  + dateOfBirth + " гр, номер читательского билета " + libraryCard + ", факультет: " + faculty + ", тел: " + phoneNumber +" - на руках " + countOfBooks + " кн.");
    }

    public static void main(String[] args) {

        Reader ivanov = new Reader(
                "Иванов Иван Иванович",
                12234,
                "Социологический",
                "15.04.1993",
                "8-917-201-12-34",
                0);


        Reader petrov = new Reader(
                "Петров Петр Петрович",
                153478,
                "Филологический",
                "12.07.2000",
                "8-917-202-12-35",
                0);


        ivanov.status();
        ivanov.takeBook(4);
        ivanov.takeBook(2);
        ivanov.returnBook(2);
        ivanov.status();

        petrov.status(); // У Петрова нет книг на руках
        petrov.returnBook(3); // Петров приносит книги в библиотеку, хотя книг на руках у него нет, значит он их дарит
        petrov.takeBook(2); // Петров берет 2 книги
        petrov.returnBook(5);  // У Петров на руках 2 книги, а сдает он 5, значит 3 их них дарит
        petrov.status();

    }

}
