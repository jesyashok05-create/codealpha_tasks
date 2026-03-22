import java.util.HashMap;
import java.util.Map;
 class User {
      HashMap<String,Integer> portfolio= new HashMap<>();
    void buystock(String name,int qty){
          portfolio.put(name,portfolio.getOrDefault(name ,0 )+qty);
          System.out.println("Bought"+qty+"shares of"+name);

    }
    void sellstock(String name,int qty){
        if (portfolio.containsKey(name)) {
            int current=portfolio.get(name);
            if(qty<=current){
                portfolio.put(name,current-qty);
                System.out.println("sold"+qty+"shares of"+name);

            }
               
                           
                else{
                    System.out.println("not enough shares");
                }  
            }
            else{
                System.out.println("shares nit found");
            }
        }
        void showportfolio(){
            System.out.println("portfloio");
            for(Map.Entry<String,Integer>entry: portfolio.entrySet()){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
    }
    