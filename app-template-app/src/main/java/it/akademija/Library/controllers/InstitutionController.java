package it.akademija.Library.controllers;

import io.swagger.annotations.ApiOperation;
import it.akademija.Library.services.BooksDataObject;
import it.akademija.Library.services.CreateaInstitutionObject;
import it.akademija.Library.services.InstitutionObject;
import it.akademija.Library.services.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value = "/api/institutions")
public class InstitutionController {

    @Autowired
    private InstitutionService institutionService;

    @ApiOperation(value = "Get all institutions", notes = "Returns a list of institutions")
    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<InstitutionObject> getInstitutions () {
        return institutionService.getInstitutions();
    }

    @ApiOperation(value = "Create institution", notes = "Creates a new institution")
    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public void createInstitution(@RequestBody @Valid CreateaInstitutionObject createInstitutionObject){
        institutionService.createInstitution(createInstitutionObject);
    }

    @ApiOperation(value = "Update institution", notes = "Updates an existing institution")
    @RequestMapping(path = "/update/{title}", method = RequestMethod.PUT)
    public void updateInstitution(@PathVariable String title, @RequestBody InstitutionObject institutionObject) {
        institutionService.updateInstitution(title, institutionObject);
    }
    @ApiOperation(value = "Delete institution", notes = "Deletes institution by name")
    @RequestMapping(path = "/delete/{title}", method = RequestMethod.DELETE)
    public void deleteInstitutionByTitle(@PathVariable String title){
        institutionService.deleteInstitutionByTitle(title);
    }
    @ApiOperation(value = "Add book")
    @RequestMapping(path = "/admin/{instId}/{bookId}", method =  RequestMethod.PUT)
    public void addBookToInstitution (@RequestBody @Valid BooksDataObject booksDataObject,
                                      @PathVariable("instId") String instId, @PathVariable("bookId") String bookId){
        institutionService.addBookToInstitution(booksDataObject, instId, bookId);

    }

    @RequestMapping(path = "/showBooks/{institutionId}", method = RequestMethod.GET)
    public List<BooksDataObject> getAllBooks(@PathVariable final String institutionId){
        return institutionService.getAllBooks(institutionId);
    }
}

