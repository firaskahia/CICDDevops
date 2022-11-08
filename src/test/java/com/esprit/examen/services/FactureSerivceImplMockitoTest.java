/*package com.esprit.examen.services;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.Facture;
import com.esprit.examen.entities.Fournisseur;
import com.esprit.examen.entities.Stock;
import com.esprit.examen.repositories.FactureRepository;
import com.esprit.examen.repositories.StockRepository;

import lombok.extern.slf4j.Slf4j;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
@Slf4j

public class FactureSerivceImplMockitoTest {
@Mock
	FactureRepository factureRepository;
	
	@Autowired
	FactureServiceImpl factureServiceImpl;
	
	
	
	Facture f= Facture.builder().montantRemise(15).dateCreationFacture(new Date()).dateCreationFacture(new Date()).archivee(false).build();
	List<Facture> listFacture = new ArrayList<Facture>() {
      
		private static final long serialVersionUID = 1L;

		{
            add(Facture.builder().montantRemise(17).dateCreationFacture(new Date()).dateCreationFacture(new Date()).archivee(true).build());
            add(Facture.builder().montantRemise(20).dateCreationFacture(new Date()).dateCreationFacture(new Date()).archivee(false).build());
        }
    };
    
	
   /* public void createFactureTest()
	{

		Facture facture2 = new Facture(2L, 100, 500, null, null, null, null, null, null);
		facture2.setIdFacture(2L);
		
		factureServiceImpl.addFacture(facture2);
		verify(factureRepository, times(1)).save(facture2);
		System.out.println(facture2); 
		System.out.println(" Create is working correctly...!!");  
	}
	**/
	
	

	/*@Test
	@Order(1)
	void getFacturesTest() {
		List<Facture> factures = this.factureServiceImpl.retrieveAllFactures();
		log.info("LIST FACTURES DESSOUS:");
		int i = 1;
		for (Facture facture : factures) {
			log.info(i+" - : "+facture.toString());
			i++;
		}
		assertNotNull(factures);
	}
	
	

}
*/