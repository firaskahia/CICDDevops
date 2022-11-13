package com.esprit.examen.models;

import lombok.Data;
import com.esprit.examen.entities.Facture;
import java.util.Date;

@Data
public class ReglementRequestModel {

    private Long idReglement;
    private float montantPaye;
    private float montantRestant;
    private Boolean payee;
    private Date dateReglement;
    private Facture facture;
}
