package src.uni.lessons.multithreading;

import java.util.Scanner;

class Product {
    String name;
    int quantity;

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void getProductDetails() {
        System.out.printf("\nName : %s | Quantity: %d", name, quantity);
    }
}

public class ShoppingCart {
    Product[] p;
    boolean valueSet;

    ShoppingCart() {
        p = new Product[3];
        valueSet = false;
    }

    public synchronized void setCart() {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("setCart interrupted");
            }
        }

        int i = 0;
        while (i < 3) {
            Scanner sc = new Scanner(System.in);

            String name = sc.next();
            int quantity = sc.nextInt();

            Product product = new Product(name, quantity);

            p[i] = product;

            System.out.printf("Product %d set -> [%s, %d]\n", i, name, quantity);
            i++;
        }
        valueSet = true;
        notify();
    }

    public synchronized void getCart() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("getCar interrupted");
            }
        }
        for (int i = 0; i < 3; i++) {
            p[i].getProductDetails();
        }
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {
    ShoppingCart sc;

    Producer(ShoppingCart sc) {
        this.sc = sc;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            sc.setCart();
        }
    }
}

class Consumer implements Runnable {
    ShoppingCart sc;

    Consumer(ShoppingCart sc) {
        this.sc = sc;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            sc.getCart();
        }
    }
}

class TestShoppingCart {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();
        new Producer(sc);
        new Consumer(sc);
    }
}