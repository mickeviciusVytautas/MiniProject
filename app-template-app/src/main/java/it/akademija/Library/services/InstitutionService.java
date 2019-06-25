package it.akademija.Library.services;

import it.akademija.Library.repositories.InstitutionRepository;
import it.akademija.Library.entities.Book;
import it.akademija.Library.repositories.BooksRepository;
import it.akademija.Library.entities.BooksData;
import it.akademija.Library.entities.Institution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InstitutionService {

    @Autowired
    private InstitutionRepository institutionRepository;

    @Autowired
    private BooksRepository booksRepository;

    @Transactional
    public void createInstitution(CreateaInstitutionObject createaInstitutionObject){
                if(institutionRepository.findByTitle(createaInstitutionObject.getTitle())== null)
                institutionRepository.save(new Institution(
                        createaInstitutionObject.getTitle(),
                        createaInstitutionObject.getCity(),
                        createaInstitutionObject.getImage(),
                        createaInstitutionObject.getCategory(),
                        createaInstitutionObject.getType(),
                        null
                ));
                else{throw new IllegalArgumentException("Error");};
    }

    @Transactional
    public List<InstitutionObject> getInstitutions() {
        List<InstitutionObject> institutionObjects;

        institutionObjects = (institutionRepository.findAll().stream().map(institution -> {
            InstitutionObject institutionObject =  new InstitutionObject(
                    institution.getTitle(),
                    institution.getCity(),
                    institution.getImage(),
                    institution.getCategory(),
                    institution.getType()
            );
            institutionObject.setBooksDataObject(institution.getBooksData().stream().map(booksData -> {
                BooksDataObject booksDataObject = new BooksDataObject(
                        booksData.getQuantity(),
                        booksData.getQuality(),
                        booksData.getPrice());
                booksDataObject.setBook(new BookObject(
                        booksData.getBook().getTitle(),
                        booksData.getBook().getImage(),
                        booksData.getBook().getAuthor(),
                        booksData.getBook().getPages()));
                return booksDataObject;


            }).collect(Collectors.toList()));
            return institutionObject;
        }).collect(Collectors.toList()));
        return institutionObjects;

    }

    @Transactional
    public void deleteInstitutionByTitle(String title) {
        institutionRepository.deleteById(title);
    }

    @Transactional
    public void addBookToInstitution(BooksDataObject booksDataObject, String institutionTitle, String bookTitle){
        Institution institution = institutionRepository.findByTitle(institutionTitle);

        Book book = booksRepository.findByTitle(bookTitle);

        BooksData bookData = new BooksData();

        bookData.setPrice(booksDataObject.getPrice());
        bookData.setQuality(booksDataObject.getQuality());
        bookData.setQuantity(booksDataObject.getQuantity());
        bookData.setBook(book);
        bookData.setInstitution(institution);
        book.addBooksData(bookData);
        institution.addBookInInstitution(bookData);

    }

    @Transactional
    public List<BooksDataObject> getAllBooks(String institutionId){
        Institution institution = institutionRepository.findByTitle(institutionId);

        return institution.getBooksData().stream().map(booksData -> {
                    BooksDataObject booksDataObject =  new BooksDataObject(
                            booksData.getQuantity(),
                            booksData.getQuality(),
                            booksData.getPrice());
                    booksDataObject.setBook(new BookObject(
                            booksData.getBook().getTitle(),
                            booksData.getBook().getImage(),
                            booksData.getBook().getAuthor(),
                            booksData.getBook().getPages()
                    ));
                    return booksDataObject;
                }).collect(Collectors.toList());
    }

    @Transactional
    public void updateInstitution(String title, InstitutionObject institutionObject){
        Institution institutionInDb = institutionRepository.findByTitle(title);
        institutionInDb.setCategory(institutionObject.getCategory());
        institutionInDb.setCity(institutionObject.getCity());
        institutionInDb.setImage(institutionObject.getImage());
        institutionInDb.setType(institutionObject.getType());
    }
}
