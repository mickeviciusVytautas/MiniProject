package it.akademija.Library.repositories;

import it.akademija.Library.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BooksRepository extends JpaRepository <Book, String> {

    Book findByTitle(String title);
    List<Book> findAllBookByTitleContaining(String title);
}
