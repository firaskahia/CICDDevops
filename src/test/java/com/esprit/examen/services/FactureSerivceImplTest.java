/*package com.esprit.examen.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.Facture;
import com.esprit.examen.entities.Stock;
import com.esprit.examen.repositories.FactureRepository;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
public class FactureSerivceImplTest {

	
	@Autowired
	IFactureService factureServiceImpl;
    
    
    @Test  
	@Order(0)
	 public void createFactureTest(){
    	Facture f= factureServiceImpl.addFacture(Facture.builder().archivee(false).dateCreationFacture(new Date()).dateDerniereModificationFacture(new Date()).montantFacture(2000).montantRemise(15).build());
	   Assertions.assertNotNull(f);
	    }
    
}
*/