package com.driver;

class Product{
    public int product(int x, int y) {

        return 0;
    }
    public int product(int x, int y, int z) {

        return 0;
    }

    public double product(double x, double y) {
        return 0;
    }
}

public class Main {

    public static void main(String[] args){
        Product p =new Product();
        p.product(11,21);
        p.product(12,32,12);
        p.product(22,33);
    }



}