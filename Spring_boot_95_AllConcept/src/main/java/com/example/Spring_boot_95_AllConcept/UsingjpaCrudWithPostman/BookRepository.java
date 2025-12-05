package com.example.Spring_boot_95_AllConcept.UsingjpaCrudWithPostman;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}
