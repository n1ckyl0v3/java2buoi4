package io.aptech.ExceptionShopManagement;

public class NotEnoughInventoryNumberException extends Exception {
  public NotEnoughInventoryNumberException(String message){
    super(message);
  }
}
