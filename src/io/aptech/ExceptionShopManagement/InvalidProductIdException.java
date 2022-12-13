package io.aptech.ExceptionShopManagement;

public class InvalidProductIdException extends Exception{
  public InvalidProductIdException(String mess){
    super(mess);
  }
}
