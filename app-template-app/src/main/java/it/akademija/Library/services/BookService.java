package it.akademija.Library.services;

import it.akademija.Library.repositories.BooksRepository;
import it.akademija.Library.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BooksRepository booksRepository;

    @Transactional(readOnly = true)
    public List<BookObject> getBooks (){

        return booksRepository.findAll().stream().map(book -> {
            BookObject bookObject = new BookObject(
                    book.getTitle(), book.getAuthor(), book.getImage(), book.getPages()
            );
            return bookObject;
        }).collect(Collectors.toList());
    }

    @Transactional
    public void postBook (BookObject bookObject){
        booksRepository.save(
                new Book(
                        bookObject.getTitle(), bookObject.getAuthor(), bookObject.getImage(), bookObject.getPages()
                )
        );
    }

    @Transactional
    public void deleteBookByTitle (String title){
        Book book = booksRepository.findByTitle(title);

        booksRepository.deleteById(title);
    }

    @Transactional
    public void updateBookByTitle (String title, BookObject bookObject) {
        Book book = booksRepository.getOne(title);
        book.setTitle(bookObject.getTitle());
        book.setAuthor(bookObject.getAuthor());
        book.setImage(bookObject.getImage());
        book.setPages(bookObject.getPages());
    }

    @Transactional
    public List<BookObject> findBookByTitle(String title){
        return booksRepository.findAllBookByTitleContaining(title).stream().map(book -> {
            BookObject bookObject = new BookObject(
                    book.getTitle(), book.getAuthor(), book.getImage(), book.getPages()
            );
            return bookObject;
        }).collect(Collectors.toList());
    }
}