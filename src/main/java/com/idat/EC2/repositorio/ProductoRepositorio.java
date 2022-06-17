package com.idat.EC2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC2.modelo.Productos;

@Repository
public interface ProductoRepositorio  extends JpaRepository<Productos, Integer>{

}
