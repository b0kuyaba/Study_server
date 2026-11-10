package prac1;

import java.util.Scanner;

class Notebook {
    private int totalCount;
    private int rentalCount;

    public Notebook() {
        totalCount = 5;
        rentalCount = 0;
    }

    public void rentNotebook(int count) {
        if (count > 0 && count <= (totalCount - rentalCount)) {
            rentalCount += count;
        }
        else {
            System.out.println("노트북을 대여할 수 없습니다.");
        }
    }
    public void returnNotebook(int count) {
        if (count > 0 && count <= rentalCount) {
            rentalCount -= count;
        }
        else {
            System.out.println("노트북을 반납할 수 없습니다.");
        }
    }

    public void showInfo() {
        System.out.println("==노트북 대여 현황==\n전체 노트북: " + totalCount + "대\n대여 중: " + rentalCount + "대\n남은 노트북: " + (totalCount - rentalCount) + "대");
    }
}

class NotebookManager {
    private Notebook notebook;
    private static NotebookManager instance = new NotebookManager();
    private NotebookManager() {
        notebook = new Notebook();
    }
    public static NotebookManager getInstance() {
        return instance;
    }
    public void rentNotebook(int count) {
        notebook.rentNotebook(count);
    }
    public void returnNotebook(int count) {
        notebook.returnNotebook(count);
    }
    public void showInfo() {
        notebook.showInfo();
    }
}

class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NotebookManager manager = NotebookManager.getInstance();
        int rentCount = sc.nextInt();
        int returnCount = sc.nextInt();

        manager.rentNotebook(rentCount);
        manager.returnNotebook(returnCount);
        manager.showInfo();
    }
}