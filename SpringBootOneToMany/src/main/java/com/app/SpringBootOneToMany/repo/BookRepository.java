package com.app.SpringBootOneToMany.repo;

import com.app.SpringBootOneToMany.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
