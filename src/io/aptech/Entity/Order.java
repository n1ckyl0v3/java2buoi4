package io.aptech.Entity;

import java.time.LocalDateTime;

public class Order {
  private String id;
  private Customer customer;
  private LocalDateTime datetime;

  public Order(String id, Customer customer, LocalDateTime datetime) {
    this.id = id;
    this.customer = customer;
    this.datetime = datetime;
  }

  public Order() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public LocalDateTime getDatetime() {
    return datetime;
  }

  public void setDatetime(LocalDateTime datetime) {
    this.datetime = datetime;
  }
}
