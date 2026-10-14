package array.Book;

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] book = new Book[5];
        Book[] bookCopy = new Book[5];

        book[0] = new Book("태백산맥","조정래");
        book[1] = new Book("데미안","헤르만 헤세");
        book[2] = new Book("연을 쫒는 아이","할레드 호세이니");
        book[3] = new Book("토지","박경리");
        book[4] = new Book("어린왕자","생택쥐페리");

        for (int i = 0; i < bookCopy.length; i++) {
            bookCopy[i] = new Book();
        }

        for (int i = 0; i < bookCopy.length; i++) {
            bookCopy[i].setBookName(book[i].getBookname());
            bookCopy[i].setAuthor(book[i].getAuthor());
        }

        book[0].setBookName("나목");
        book[0].setAuthor("박경리");

        System.out.println("\nbook: 첫번째 항목 변경 후");
        for (int i = 0; i < book.length; i++) {
            book[i].showBookInfo();
        };

        System.out.println("\nbookCopy");
        for (int i = 0; i < bookCopy.length; i++) {
            bookCopy[i].showBookInfo();
        }
    }
}
