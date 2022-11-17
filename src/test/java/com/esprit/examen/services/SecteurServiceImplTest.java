package com.esprit.examen.services;

import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.SecteurActivite;
import com.esprit.examen.repositories.SecteurActiviteRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

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
	
	@Autowired
    SecteurActiviteRepository secteurRepo;

	
    @Test
    @Order(1)
    public void testSaveSecteur(){
    SecteurActivite s= secteurImpl.addSecteurActivite(SecteurActivite.builder().codeSecteurActivite("22b").libelleSecteurActivite("secteur test").build());
    Assertions.assertNotNull(s);
    }
    

   @Test
    @Order(2)
	public void testUpdateSecteur() {
    	  SecteurActivite s= secteurImpl.addSecteurActivite(SecteurActivite.builder().codeSecteurActivite("22bcc").libelleSecteurActivite("secteur test update").build());
    	  s.setLibelleSecteurActivite("secteur aicha");
	      Assertions.assertEquals("secteur aicha",secteurImpl.updateSecteurActivite(s).getLibelleSecteurActivite());
	    }
    
    
   @Test
   @Order(3)
   void deleteAll() {
	   secteurRepo.deleteAll();
       assertEquals(0,secteurRepo.findAll().spliterator().estimateSize());
   }
   
   
   @Test
   @Order(4)
   void getSecteur(){
       Iterable<SecteurActivite> Secteur = secteurRepo.findAll();
       Assertions.assertNotNull(Secteur);
   }
    

}
