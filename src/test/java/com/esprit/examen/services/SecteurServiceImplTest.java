/*package com.esprit.examen.services;

import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.SecteurActivite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class SecteurServiceImplTest {
	
	@Autowired
    ISecteurActiviteService secteurImpl;
	
    @Test
    @Order(1)
    public void testSaveSecteur(){
    SecteurActivite s= secteurImpl.addSecteurActivite(SecteurActivite.builder().codeSecteurActivite("22b").libelleSecteurActivite("secteur test").build());
    Assertions.assertNotNull(s);
    }

}
*/