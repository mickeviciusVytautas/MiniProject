package it.akademija.PracticeBeforeExam.controllers;

import io.swagger.annotations.ApiOperation;
import it.akademija.PracticeBeforeExam.services.InstitutionTestCreate;
import it.akademija.PracticeBeforeExam.services.InstitutionTestObject;
import it.akademija.PracticeBeforeExam.services.InstitutionTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/institutionstest")
public class InstitutionTestController {

    @Autowired
    private InstitutionTestService institutionTestService;

    @ApiOperation(value = "Returns a list of institutions")

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<InstitutionTestObject> institutionTestObject (){
        return institutionTestService.getAllInstitutions();
    }

    @ApiOperation(value = "Create new institution")
    @RequestMapping(path = "/new", method = RequestMethod.POST)
    public void createInstitution (@RequestBody InstitutionTestCreate institutionTestCreate) {
        institutionTestService.createInstitution(institutionTestCreate);
    }
}
