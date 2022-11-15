package com.esprit.examen.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.repositories.CategorieProduitRepository;
@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class CategorieProduitServiceImplMockitoTest {

	
		@Mock
	    CategorieProduitRepository CategorieProduitRepository;

	    @InjectMocks
	    CategorieProduitServiceImpl CategorieProduitServiceImpl;

	    CategorieProduit s= CategorieProduit.builder().codeCategorie("code produit test").libelleCategorie("libelle Categorie Produit test").build();
	    List<CategorieProduit> listCategorie = new ArrayList<CategorieProduit>() {
	        /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
	            add(CategorieProduit.builder().libelleCategorie("categorie test1").codeCategorie("categorie test 1.2").build());
	            add(CategorieProduit.builder().libelleCategorie("categorie test2").codeCategorie("categorie test 2.2").build());
	        }
	    };
	    
	    @Test
	    public void testAddcategorieProduit() {
	        Mockito.when(CategorieProduitRepository.save(s)).thenReturn(s);
	        CategorieProduit s1 = CategorieProduitServiceImpl.addCategorieProduit(s);
	        Assertions.assertNotNull(s1);
	}
	    @Test
	    public void testUpdatecategorieProduit() {
	        s.setCodeCategorie("linda");
	        Mockito.when(CategorieProduitRepository.save(s)).thenReturn(s);
	        CategorieProduit s1 = CategorieProduitServiceImpl.updateCategorieProduit(s);
	        Assertions.assertEquals(s,s1);
	    }
	}


