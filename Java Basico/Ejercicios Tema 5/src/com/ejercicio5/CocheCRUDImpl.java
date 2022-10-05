package com.ejercicio5;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {
    
    public void save(Coche coche) {
        System.out.println("save");
    }

    public void delete(Coche coche) {
        System.out.println("delete");
    }

    public List<Coche> findAll() {
        System.out.println("findAll");
        return null;
    }

}