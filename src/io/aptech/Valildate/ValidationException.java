package io.aptech.Valildate;

import io.aptech.Entity.OrderDetail;
import io.aptech.Entity.Product;
import io.aptech.ExceptionShopManagement.InvalidProductIdException;
import io.aptech.ExceptionShopManagement.NotEnoughInventoryNumberException;
import io.aptech.ExceptionShopManagement.NotFoundProductIdException;

import java.util.List;
import java.util.stream.Collectors;

public class ValidationException {
  public static String isProductId(String pid, String mess) throws InvalidProductIdException {
    String regex = "^(MS|NE|SE)[0-9]{6}$";
    String flag = "YES";
    if (!pid.matches(regex)) {
      throw new InvalidProductIdException(mess);
    }
    return flag;
  }

  public static String findProductById(List<Product> p, String id, String mess) throws NotFoundProductIdException {
    String flag = "No";
    for (Product pro : p) {
      if (pro.getId().equals(id)) {
        flag = "YES";
        break;
      }
    }
    if (flag.equals("NO")) throw new NotFoundProductIdException(mess);
    return flag;
  }

  public static String enoughProductQuantity(OrderDetail orderDetail, Product product, String mess) {
    String flag = "YES";
    try {
      List<Product> productOrderDetails = orderDetail.getProduct();

      if (ValidationException.findProductById(productOrderDetails, product.getId(), product.getId() + " Not Found Product Id:").equals("NO")) {
        flag = "NOTFOUND";
      }
      if (flag.equals("YES")) {
        for (Product p : productOrderDetails) {
          if (p.getQuantity() < orderDetail.getQuantity()) {
            flag = "NO";
            System.out.println(mess);
          }
        }
        if (flag.equals("NO")) throw new NotEnoughInventoryNumberException(mess);
      }
    } catch (NotFoundProductIdException e) {
     if(flag.equals("NOTFOUND")){
       System.out.println("NOT FOUND ID");
     }else{
       System.out.println(e.getMessage());
     }
    }
    return flag;
  }
}
