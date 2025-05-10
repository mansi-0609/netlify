import java.util.Scanner;
class Product {

    String id;
    String productName;
    int quantity;
    int price,totalPrice;
    static int grantTotal = 0;
    static Double discount, SGST , CGST ;

    
    Product(String id, String productName, int quantity, int price){
        this.id = id;
        this.productName =productName;
        this.quantity=quantity;
        this.price =price;
        totalPrice = quantity *price;
        grantTotal += totalPrice;

        
    }
    static void address(){
        System.out.println("\t\t\t\t-------------Invoice------------");
        System.out.println("\t\t\t\t  3/98 Mecrobertganj New Mumbai");
        System.out.println("\t\t\t\t       Opposite Metro Walk");
        System.out.println("GASTIN : 3HJ4K35NBKL45\t\t\t\t\t\t\tContact : (+91)3435522543");   
    }            
    static public void displayFormat(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("product ID\t\tName\t\tQuantity\t\tPrice\t\ttotal Price");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
    }
}

public class ShoppingBill{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Product obj[]=new Product[50];
        char ch= 'y';
        String id=null;
        String productName= null;
        int Quantity=0;
        int price=0,totalPrice=0,count=0;
        Product.address();
        System.out.print("Enter Customer Name :");
        String name=sc.next();
        int idx = 0;
          
    while(ch=='y' || ch=='Y'){
         System.out.println("Enter The Product details :\n");
        System.out.print("Enterr prod id :");
        
        id=sc.next();
        System.out.print("Product Name :");
        productName=sc.next();
        System.out.print("Product Quantity :");
        Quantity=sc.nextInt();
        System.out.print("enter price :");
        price=sc.nextInt();

        totalPrice=Quantity*price;
        System.out.print("Want to add another item (Y/N)");
        ch=sc.next().charAt(0); 
        obj[idx] = new Product(id, productName, Quantity, price);
        count++;
        idx++;
        }
       
        Product.displayFormat();
 
        System.out.println(id+"\t\t"+productName+"\t\t"+Quantity+"\t\t"+price+"\t\t"+totalPrice);
        for(int i=0;i<count;i++){
            System.out.println(obj[i].id  + "\t\t" + obj[i].productName + " \t\t" + obj[i].quantity + " \t\t" + obj[i].price + " \t\t" + obj[i].totalPrice );
        }

    }
}
