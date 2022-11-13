package com.esprit.examen.models;

import lombok.Data;
import com.esprit.examen.entities.Fournisseur;
import java.util.Set;

@Data
public class SecteurActiviteRequestModel {

    private Long idSecteurActivite;
    private String codeSecteurActivite;
    private String libelleSecteurActivite;
    private Set<Fournisseur> fournisseurs;
}
