package com.esprit.examen.services;

import com.esprit.examen.entities.Facture;
import com.esprit.examen.entities.Reglement;
import com.esprit.examen.repositories.FactureRepository;
import com.esprit.examen.services.IReglementService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class ReglementServiceImplTest {


    @Autowired
    IReglementService reglementService;

    @Test
    void retrieveAllReglements() {

        int sizeReglements = reglementService.retrieveAllReglements().size();
        reglementService.addReglement(Reglement.builder().dateReglement(new Date()).payee(false).build());
        Assertions.assertEquals(sizeReglements+1, reglementService.retrieveAllReglements().size());    }

    @Test
    void addReglement() {
        Reglement f =reglementService.addReglement(Reglement.builder()
                .montantPaye(20.00F)
                .payee(true).build());
        Assertions.assertNotNull(f);
    }

}