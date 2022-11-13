package com.esprit.examen.models;

import lombok.Data;
import com.esprit.examen.entities.Produit;
import java.util.Set;

@Data
public class StockRequestModel {
    private Long idStock;
    private String libelleStock;
    private Integer qte;
    private Integer qteMin;
    private Set<Produit> produits;
}
