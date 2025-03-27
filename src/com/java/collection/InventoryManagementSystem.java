package com.java.collection;

import java.util.ArrayList;

public class InventoryManagementSystem {
    public static void main(String[] args) {

        //Create an ArrayList<Product>

        ArrayList<Product> products = new ArrayList<>();


        //Add these products:
        //
        //ID: 1, Name: "Laptop", Price: 999.99, Quantity: 10
        //
        //ID: 2, Name: "Mouse", Price: 19.99, Quantity: 50
        //
        //ID: 3, Name: "Keyboard", Price: 49.99, Quantity: 30

        products.add(new Product (1,"Laptop",999.99,10));
        products.add(new Product (2,"Mouse",19.99,40));
        products.add(new Product (3,"Keyboard",49.99,30));






    }
}

class Product{
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}