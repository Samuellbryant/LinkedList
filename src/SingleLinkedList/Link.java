package SingleLinkedList;

public class Link {
    private String bookName;
    private int booksSoldInMillions;

    public Link next;

   public Link (String bookName, int booksSold ){
        this.bookName= bookName;
        this.booksSoldInMillions = booksSold *1000000;
   }
   public String toString(){
        return bookName;
   }
   public String getBookName(){
        return this.bookName;
   }
   public int getBooksSoldInMillions()
   {
       return booksSoldInMillions;
   }
   private void setBookName(String bookName){
        this.bookName = bookName;
   }
   private void setBooksSoldInMillions(int booksSoldInMillions ){
        this.booksSoldInMillions = booksSoldInMillions*1000000;
   }
   // change the book Name how many are sold of a link
    public void changeLinkData(String bookName,int booksSoldInMillions ){
        setBookName(bookName);
        setBooksSoldInMillions(booksSoldInMillions);
        System.out.println("Data changed");
    }
    public void displayLink (){
        String prettyNum = String.format("%,d",booksSoldInMillions);
        System.out.println("Name of book: " + bookName+" | " + "Number of books sold: " + prettyNum);
    }
}
