package com.esprit.examen.services;

import com.esprit.examen.entities.Facture;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class FactureServiceImplTest {

    @Autowired
    IFactureService factureService;

    @Test
    @Order(0)
    void TestAddFacture() {
        Facture f =factureService.addFacture(Facture.builder()
                .montantRemise(20.00F)
                .dateCreationFacture(new Date()).build());
        Assertions.assertNotNull(f);

    }

    @Test
    @Order(1)
    void retrieveAllFactures() {
        int sizeFactures = factureService.retrieveAllFactures().size();
        factureService.addFacture(factureService.addFacture(Facture.builder().montantFacture(300F).dateCreationFacture(new Date()).build()));
        Assertions.assertEquals(sizeFactures+1, factureService.retrieveAllFactures().size());
    }






}