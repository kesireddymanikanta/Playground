
import java.util.Scanner;
class Item
{
  private int price;
  public void setPrice(int price)
  {
    this.price=price;
  }
  public int getPrice()
  {
    return price;
  }
}
class Customer extends Item
{
private String product;
private int quantity;
public void setProduct(String product)
{
this.product=product;
}
public String getProduct()
{
return product;
}
public void setQuantity(int quantity)
{
this.quantity=quantity;
}
public int getQuantity()
{
return quantity;
}
}
class Bill extends Customer
{
public int result(int p,int q)
{
int result1=p*q;
return result1;

}
}
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    Bill b=new Bill();
    String product=s.nextLine();
    b.setProduct(product);
    int price=s.nextInt();
    b.setPrice(price);
    int p=b.getPrice();
    int quantity=s.nextInt();
   b.setQuantity(quantity);
    int q=b.getQuantity();
    
    int r=b.result(p,q);
    System.out.println("Total Price is : "+(r));
  }
}
                       