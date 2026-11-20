void main() {
    class Book {
        String title;
        String author;
        int pages;
        float price;
    }

    Book[] books = new Book[2];
    books[0] = new Book();
    books[0].title = "어서와 JAVA는 처음이지";
    books[0].author = "천인국";
    books[0].pages = 230;
    books[0].price = 28000.0f;

    books[1] = new Book();
    books[1].title = "쉽게 배우는 자료구조";
    books[1].author = "윤병로";
    books[1].pages = 330;
    books[1].price = 32000.0f;

    for (int i = 0; i < books.length; i++) {
        System.out.printf("%s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f원\n\n",
                books[i].title, books[i].author, books[i].pages, books[i].price);
    }
}