/*package com.esprit.examen.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.esprit.examen.entities.SecteurActivite;
import com.esprit.examen.repositories.SecteurActiviteRepository;

import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;


@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class SecteurServiceImplMockitoTest {

	
	@Mock
	SecteurActiviteRepository sr;
	@InjectMocks
	SecteurActiviteServiceImpl ss;
	
	
	
	 SecteurActivite s= SecteurActivite.builder().codeSecteurActivite("111ee").libelleSecteurActivite("secteur test").build();
	    List<SecteurActivite> listSecteur = new ArrayList<SecteurActivite>() {
	        
			private static final long serialVersionUID = 1L;

			{
	            add(SecteurActivite.builder().codeSecteurActivite("22b").libelleSecteurActivite("secteur test").build());
	            add(SecteurActivite.builder().codeSecteurActivite("333c").libelleSecteurActivite("secteur test").build());

	        }
	    };
	  
	    @Test
	    public void testAddSecteur() {
	        Mockito.when(sr.save(s)).thenReturn(s);
	        SecteurActivite secteuradd = ss.addSecteurActivite(s);
	        Assertions.assertNotNull(secteuradd);
	}
	    
	 
	
	
	
	
	
	
	
}
*/
