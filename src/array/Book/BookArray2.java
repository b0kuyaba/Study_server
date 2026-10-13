package array.Book;

public class BookArray2 {
    public static void main(String[] args) {
        Book book1 = new Book("태백산맥","조정래");
        Book book2 = new Book("데미안","헤르만 헤세");
        Book book3 = new Book("연을 쫒는 아이","할레드 호세이니");
        Book book4 = new Book("토지","박경리");
        Book book5 = new Book("어린왕자","생택쥐페리");

        book1.showBookInfo();
        book2.showBookInfo();
        book3.showBookInfo();
        book4.showBookInfo();
        book5.showBookInfo();
    }
}
