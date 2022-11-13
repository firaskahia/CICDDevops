package com.esprit.examen.models;

import lombok.Data;
import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.entities.DetailFacture;
import com.esprit.examen.entities.Stock;

import java.util.Date;
import java.util.Set;

@Data
public class ProduitRequestModel {
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prix;
    private Date dateCreation;
    private Date dateDerniereModification;
    private Stock stock;
    private Set<DetailFacture> detailFacture;
    private CategorieProduit categorieProduit;
}
