void main() {
    class Book {
        String title;
        String author;
        int pages;
        float price;

        public Book(String author, int pages) {
            this.author = author;
            this.pages = pages;
        }

        public Book(String title, String author, int pages, float price) {
            this.title = title;
            this.author = author;
            this.pages = pages;
            this.price = price;
        }
    }

    Book[] books = {
            new Book("어서와 JAVA는 처음이지", "천인국", 230, 28000.0f),
            new Book("쉽게 배우는 자료구조", "윤병로", 330, 32000.0f)};


    for (int i = 0; i < books.length; i++) {
        System.out.printf("%s\n\t저자 : %s\n\t페이지 수 : %d 쪽\n\t가격 : %,.0f원\n\n",
                books[i].title, books[i].author, books[i].pages, books[i].price);
    }
}
