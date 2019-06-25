package it.akademija.PracticeBeforeExam.services;


import it.akademija.PracticeBeforeExam.entities.InstitutionTest;
import it.akademija.PracticeBeforeExam.repositories.InstitutionTestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InstitutionTestService {

    @Autowired
    private InstitutionTestRepo institutionTestRepo;

    @Transactional
    public void createInstitution(InstitutionTestCreate institutionTestCreate){
        institutionTestRepo.save(new InstitutionTest(
                institutionTestCreate.getTitle(),
                institutionTestCreate.getCity(),
                institutionTestCreate.getCategory(),
                institutionTestCreate.getType()
        )) ;
    }

    @Transactional
    public List<InstitutionTestObject> getAllInstitutions(){
        return institutionTestRepo.findAll().stream().map(institutionTest -> {
            return new InstitutionTestObject(
                    institutionTest.getTitle(),
                    institutionTest.getCategory(),
                    institutionTest.getType(),
                    institutionTest.getCity()
            );
                }
        ).collect(Collectors.toList());
    }
}
