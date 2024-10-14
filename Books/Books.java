import java.util.Scanner;
class Books
{
    String name;
    String author;
    int price;
    int numPages;
    
    Books(String name,String author,int price,int numPages)
{
    this.name=name;
    this.author=author;
    this.price=price;
    this.numPages=numPages;
}
public String toString()
{
    String name, author, price, numPages;
    name="Book name:"+this.name+"\n";
    author ="Author name:"+this.author+"\n";
    price ="Price:"+this.price+"\n";
    numPages="Number of pages:"+this.numPages+"\n";
    return name+author+price+numPages;
}



    public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
     int n;
     String name;
     String author;
     int price;
     int numPages;
     System.out.println("enter the number of book");
     n=sc.nextInt();
     Books b[];
     b=new Books[n];
     System.out.println("Enter book details");
     for (int i=0;i<n;i++)
     { 
         System.out.println("enter the book"+(i+1)+"name");
         name=sc.next();
         System.out.println("enter the book"+(i+1)+"author");
         author=sc.next();
         System.out.println("enter the book"+(i+1)+"price");
         price=sc.nextInt();
         System.out.println("enter the book"+(i+1)+"pages");
         numPages=sc.nextInt();
         b[i]=new Books(name,author,price,numPages);
      }
      for(int i=0;i<n;i++)
      {
         b[i].toString();
         System.out.println(b[i]);
      }
}
}