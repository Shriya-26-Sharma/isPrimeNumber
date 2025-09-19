 class Books {
        String title,author,isbn;
        static int totalBooks;
        boolean isborrowed;
        static {// static code 
            totalBooks=0;
         }
         {//init block
            totalBooks++;
         }
        Books(String title,String author,String isbn){
            this.title=title;
            this.author=author;
            this.isbn=isbn;
        }
        Books(String isbn){
            this("Unknown","Unknown",isbn);
        }
        static int getTotalNoOfBooks(){
            return totalBooks;
        }
        void borrowBook(){
            if(isborrowed){
                System.out.println("Book already borrowed");
            }else{
            this.isborrowed=true;
            System.out.println("Enjoy Reading");
            }
    }
    void returnBook(){
        if(isborrowed){
            this.isborrowed=false;
            System.out.println("Hope you enjoyed,Give review.");
        }else{
            System.out.println("The book is already in the library");
        }
    }
    public static void main(String[] args) {
        Books obj=new Books("The Power of Subconcious Mind","John green","987-1");
        Books obj1=new Books("987-2");
        System.out.println(Books.getTotalNoOfBooks());
        obj.borrowBook();
        obj1.borrowBook();
        obj.borrowBook();
        obj.returnBook();
        obj.returnBook();
    }
}
