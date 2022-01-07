package com.company;

public class Main {

    public static void main(String[] args) {
        // multi threading
	    Parallel instruction1=new Parallel(1);
        instruction1.start();

        Parallel instruction2=new Parallel(2);
        instruction2.start();
    }
}
