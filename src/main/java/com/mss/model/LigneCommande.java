package com.mss.model;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "lignecommande")
public class LigneCommande {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column(name = "qte")
 private    Long qte;

 @Column(name = "prix_unitaire")
 private    BigDecimal prixUnitaire;


 private    BigDecimal prixTotal;

 private    Long etat;

 @ManyToOne( cascade = CascadeType.ALL )
 @JoinColumn( name="produit" )
 private Produit produit;

 @ManyToOne( cascade = CascadeType.ALL )
 @JoinColumn( name="commande" )
    private Commande commande;

    public Long getQte() {
        return qte;
    }

    public void setQte(Long qte) {
        this.qte = qte;
    }

    public BigDecimal getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public BigDecimal getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(BigDecimal prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Long getEtat() {
        return etat;
    }

    public void setEtat(Long etat) {
        this.etat = etat;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
