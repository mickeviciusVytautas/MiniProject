package it.akademija.Library.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import it.akademija.Library.services.BookObject;
import it.akademija.Library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



@Api(value="books")
@RestController
@RequestMapping(value = "/api/books")
public class BookController {
    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    /* Apdoros užklausas: GET /api/books/all */

    @ApiOperation(value = "Get all books", notes = "Returns all books")
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<BookObject> getBooks() {
        return bookService.getBooks();
    }

    /* Sukurs knyga ir grąžins atsakymą su HTTP statusu 201 */
    @ApiOperation(value = "Post book", notes = "Post a book.")
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createBook(@RequestBody @Valid final BookObject bookObject) {
        bookService.postBook(bookObject);

    }

    /* Apdoros užklausas: DELETE /api/books/<id> */
    @ApiOperation(value = "Delete Book", notes = "Delete Book by id.")
    @RequestMapping(path = "/delete/{title}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBook(@PathVariable final String title) {
        bookService.deleteBookByTitle(title);
    }

    @ApiOperation(value = "Update Product", notes = "Update Book by id.")
    @RequestMapping(path = "/update/{title}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateBook(@PathVariable final String title, @RequestBody final BookObject bookObject) {
        bookService.updateBookByTitle(title, bookObject);
    }

    @ApiOperation(value = "Find Book by title", notes = "Return bookObject of book in repository")
    @RequestMapping(path = "/filterc/{title}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FOUND)
    public List<BookObject> findBookByTitle(@PathVariable final String title) {
        return bookService.findBookByTitle(title);
    }





















}
