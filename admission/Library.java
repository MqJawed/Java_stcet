package admission;
public class Library
{
   public String book_name;
    public int issue_date;
    public int return_date;
  public void display()
   {
    System.out.println("Book_name is "+this.book_name);
    System.out.println("Book issue_date is "+this.issue_date);
    System.out.println("Book return_date is "+this.return_date);
   }
   
}
