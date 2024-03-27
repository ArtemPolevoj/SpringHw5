package spring.hw5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.hw5.model.Reader;

public interface ReaderRepository extends JpaRepository<Reader, Long> {
    Reader findByName(String name);
}
