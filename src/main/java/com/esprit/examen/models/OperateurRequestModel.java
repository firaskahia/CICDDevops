package com.esprit.examen.models;

import lombok.Data;
import com.esprit.examen.entities.Facture;
import java.util.Set;

@Data
public class OperateurRequestModel {

    private Long idOperateur;
    private String nom;
    private String prenom;
    private String password;
    private Set<Facture> factures;
}
