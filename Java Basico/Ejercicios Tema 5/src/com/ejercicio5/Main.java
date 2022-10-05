package com.ejercicio5;

public class Main {
    public static void main(String[] args) throws Exception {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save(null);
        cocheCrud.delete(null);
        cocheCrud.findAll();

    }
}
