package com.ejercicio5;

import java.util.List;

public interface CocheCRUD {

    void save(Coche coche);

    void delete(Coche coche);

    List<Coche> findAll();

}
