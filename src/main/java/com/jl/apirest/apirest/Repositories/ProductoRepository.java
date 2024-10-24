package com.jl.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jl.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
