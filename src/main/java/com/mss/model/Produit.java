package com.mss.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "produit")
public class Produit {
 @Id
 private    String codeP;
 private    String marque;
 private    String modele;
  private   String caracterisqtiques;
  private   BigDecimal prixUnitaire;
  private   Long quantite;


 @ManyToOne( cascade = CascadeType.ALL )
 @JoinColumn( name="categorie_code" )
 private Categorie categorie;

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

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
