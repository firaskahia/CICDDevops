package com.esprit.examen.models;

import lombok.Data;
import com.esprit.examen.entities.Produit;
import java.util.Set;
@Data
public class CategorieProduitRequestModel {
    private Long idCategorieProduit;
    private String codeCategorie;
    private String libelleCategorie;
    private Set<Produit> produits;
}
