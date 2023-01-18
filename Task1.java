public class Task1 {

    public static void main(String[] args) {
        
        Book b= new Book();
        Book b1= new Book(24,"new","human");
        b1.print();

    }
    
}

class Book {

    int bookid;
    String title,auther;

    Book(){
        System.out.println("Default");
    }

    Book(int Bid, String t, String a){

      bookid = Bid;
      title = t;
      auther = a;

    }
    void print(){

        System.out.println("BookId = "+bookid);
        System.out.println("Title = "+title);
        System.out.println("Auther = "+auther);
    }
}
