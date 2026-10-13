package array.Book;

public class ObjectCopy1 {
    public static void main(String[] args) {
        Book[] book = new Book[5];
        Book[] bookCopy = new Book[5];

        book[0] = new Book("태백산맥","조정래");
        book[1] = new Book("데미안","헤르만 헤세");
        book[2] = new Book("연을 쫒는 아이","할레드 호세이니");
        book[3] = new Book("토지","박경리");
        book[4] = new Book("어린왕자","생택쥐페리");

        System.arraycopy(book,0, bookCopy, 0, book.length);

        for (int i = 0; i < bookCopy.length; i++) {
            bookCopy[i].showBookInfo();
        }
    }
}
