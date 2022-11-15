package com.esprit.examen.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.CategorieProduit;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class CategorieProduitServiceImplTest {

		@Autowired
	    ICategorieProduitService CategorieProduitServiceImpl;
	 @Test
	 @Order(1)
	 public void testSaveCategorieProduit(){
	   CategorieProduit s= CategorieProduitServiceImpl.addCategorieProduit(CategorieProduit.builder().codeCategorie("code produit test").libelleCategorie("libelle Categorie Produit test").build());
	   Assertions.assertNotNull(s);
	    }
	 @Test
	 @Order(2)
	 public void testRetrieveAllCategories() {
	   int listCategories = CategorieProduitServiceImpl.retrieveAllCategorieProduits().size();
	   CategorieProduitServiceImpl.addCategorieProduit(CategorieProduit.builder().libelleCategorie("categorie test1").codeCategorie("categorie test 1.2").build());
	   Assertions.assertEquals(listCategories+1, CategorieProduitServiceImpl.retrieveAllCategorieProduits().size());
	  } 
	 @Test
	 @Order(3)
	 public void testUpdateStock() {
	     CategorieProduit s= CategorieProduitServiceImpl.addCategorieProduit(CategorieProduit.builder().libelleCategorie("categorie test2").codeCategorie("categorie test 2.2").build());
	     s.setCodeCategorie("linda");
	     Assertions.assertEquals("linda",CategorieProduitServiceImpl.updateCategorieProduit(s).getCodeCategorie());
	    }
	}


