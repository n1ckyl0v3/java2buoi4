package io.aptech.ExceptionShopManagement;

public class NotFoundProductIdException extends Exception{
  public NotFoundProductIdException(String message){
    super(message);
  }
}
