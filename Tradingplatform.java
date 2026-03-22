   import java.util.*;  
     public class Tradingplatform {
    public static void main(String[]args){
     Scanner in = new Scanner(System.in);
     Stock s1=new Stock("TCS",4000);
     Stock s2=new Stock("INFTY",6000);
     Stock s3=new Stock("RELIANCE",8000);

          User user =new User();
     while(true){
          System.out.println("1.VIEW MARKET");
          System.out.println("2.BUY STOCK");
          System.out.println("3.SELL STOCK");
          System.out.println("4.VIEW PORTFOLIO");
          System.out.println("5.EXIT");
          System.out.println("ENTER THE CHOICE");
          int choice=in.nextInt();
          switch(choice){
               case 1:
                    System.out.println("MARKET DATA:");
                    System.out.println(s1.name+":"+s1.price);
                    System.out.println(s2.name+":"+s2.price);
                    System.out.println(s3.name+":"+s3.price);
                    break;
                    
                    case 2:
                         System.out.println("ENTER THE STOCK NAME:");
                         String buyname=in.next().trim();
                         System.out.println("QUANTITY:");
                           in.nextInt();
                           int buyqty=in.nextInt();
                         
                         user.buystock(buyname,buyqty);
                         break;

                         case 3:
                              System.out.println("ENTER THE STOCK");
                              String sellname=in.nextLine();
                              int sellqty=in.nextInt();
                              user.sellstock(sellname,sellqty);
                              break;

                              case 4:
                                   user.showportfolio();
                                   break;

                                   case 5:
                                        System.exit(0);


          }
          }

     }
}
