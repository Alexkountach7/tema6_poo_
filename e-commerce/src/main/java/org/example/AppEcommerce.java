package org.example;

public class AppEcommerce {
    static void main() {
        Paypal paypal = new Paypal("alex");

        System.out.println(paypal);

        Bizum bizum1 = new Bizum("999965685");

        System.out.println(bizum1);
    }
}
