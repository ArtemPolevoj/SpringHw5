package spring.hw5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.hw5.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByName(String name);
}
