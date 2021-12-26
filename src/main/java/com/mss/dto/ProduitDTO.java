package com.mss.dto;

import java.math.BigDecimal;

public class ProduitDTO {

    private    String codeP;
    private    String marque;
    private    String modele;
    private   String caracterisqtiques;
    private BigDecimal prixUnitaire;
    private   Long quantite;

    public String getCodeP() {
        return codeP;
    }

    public void setCodeP(String codeP) {
        this.codeP = codeP;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCaracterisqtiques() {
        return caracterisqtiques;
    }

    public void setCaracterisqtiques(String caracterisqtiques) {
        this.caracterisqtiques = caracterisqtiques;
    }

    public BigDecimal getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Long getQuantite() {
        return quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }
}
