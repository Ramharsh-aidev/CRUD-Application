package com.ramharsh.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramharsh.crud.modal.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}