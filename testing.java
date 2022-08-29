abstract class bank
{
abstract void account();
final void credited()
  {
   System.out.println("enter your account number");
   System.out.println("enter your upi pin");
   }
}

 class rbi extends bank
{
public void account()
  {
  System.out.println("adharcard and photo and pancard");
  }
 }

 class pnb extends bank
{
public void account()
 {
  System.out.println("adharcard and photo and pancard");
 }
}
public class testing{

public static void main(String args[])
{
  bank obj1=new rbi();
  obj1.account();
  obj1.credited();
  bank obj2=new pnb(); obj2.account();
  obj2.credited();

}
}

