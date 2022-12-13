import io.aptech.Entity.Customer;
import io.aptech.Entity.Order;
import io.aptech.Entity.OrderDetail;
import io.aptech.Entity.Product;
import io.aptech.ExceptionShopManagement.InvalidProductIdException;
import io.aptech.ExceptionShopManagement.NotEnoughInventoryNumberException;
import io.aptech.Valildate.ValidationException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Product> products = new ArrayList<Product>();
    products.add(new Product("MS123456", "A", 100));
    products.add(new Product("NE001", "B", 200));
    products.add(new Product("SS123456", "C", 10));
    Order o = new Order("ORDPM01", new Customer(1, "Mr.Bean"), LocalDateTime.now());
    OrderDetail od = new OrderDetail(1, products, o, 11);


      for (Product p : products) {
        try {
          if (ValidationException.isProductId(p.getId(), p.getId() + " is invalid").equals("NO")) ;
          if(ValidationException.enoughProductQuantity(od,p,p.getId()+"not enough").equals("NO"));
        } catch (InvalidProductIdException e) {
          System.out.println(e.getMessage());
        } catch (NotEnoughInventoryNumberException  e){
          System.out.println(e.getMessage());}
      }
      }


      }
    }
