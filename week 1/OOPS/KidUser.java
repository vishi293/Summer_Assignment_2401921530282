public class KidUser implements LibraryUser{
  int age;
  String bookType;
  
  @Override
public void registerAccount (int age) {
this. age=age;
if (age<12) {
System. out. printin("You have successfully registered under a Kid Account");
}
  else{
System. out.println("Sorry, Age must be smaller than 12 to register for an kid account ");
  }
}
@Override
public void requestBook(String bookType) {
this.bookType=bookType;
if(bookType== "Fiction"') (
System.out printIn("Book Issued successfully, please return the book within 7 day");
}
  else{
System. out.printIn("Oops, you are allowed to take only adult Fiction books");
}
}
}  
