package singleton.bookStore;

public class BookStore {
    private String title;
    private String author;
    private int price;

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        }
        else {
            System.out.println("가격은 0원 이상입니다.");
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getInfo() {
        return "제목: " + title + ", 저자: " + author + ", 가격: " + price + "원";
    }
}
