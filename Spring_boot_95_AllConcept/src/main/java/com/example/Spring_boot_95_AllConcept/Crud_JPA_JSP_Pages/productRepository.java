package com.example.Spring_boot_95_AllConcept.Crud_JPA_JSP_Pages;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface productRepository extends JpaRepository<Product, Integer> {

}
