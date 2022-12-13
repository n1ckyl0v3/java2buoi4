package io.aptech.Entity;

import java.util.List;

public class OrderDetail {
  private int id;
  private List<Product> products;
  private  Order order;
  private int quantity;

  public OrderDetail(int id, List<Product> products, Order order, int quantity) {
    this.id = id;
    this.products = products;
    this.order = order;
    this.quantity = quantity;
  }

  public OrderDetail() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public List<Product> getProduct() {
    return products;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
