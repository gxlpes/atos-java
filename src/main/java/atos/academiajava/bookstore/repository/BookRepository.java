package atos.academiajava.bookstore.repository;

import atos.academiajava.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByDescription(String description);
    Optional<Book> findByAuthor(String authorName);
}
