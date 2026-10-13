package singleton.bookStore;

public class Book {
    public static void main(String[] args) {
        BookStore book1 = new BookStore();
        BookStore book2 = new BookStore();

        book1.setTitle("연을 쫒는 아이");
        book1.setAuthor("할레이드 호세이니");
        book1.setPrice(18000);

        book2.setTitle("오디세이아");
        book2.setAuthor("호메로스");
        book2.setPrice(27000);

        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
    }
}
