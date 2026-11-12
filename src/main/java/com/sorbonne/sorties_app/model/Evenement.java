package com.sorbonne.sorties_app.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private String ville;
    private String categorie;
    private String adresse;
    private double latitude;
    private double longitude;
    private String imageURL;


    public Evenement (){

    }

    public Evenement (String titre, String description, String ville, String categorie, String adresse, double latitude, double longitude, String imageURL){
        this.titre = titre;
        this.description = description;
        this.ville= ville;
        this.categorie=categorie;
        this.adresse =adresse;
        this.latitude=latitude;
        this.longitude=longitude;
        this.imageURL=imageURL;


    }
    public Long getId(){
        return id;
    }

    public void setId (Long id){
        this.id= id;
    }

    public String getTitre(){
        return titre;

    }

    public void setTitre(String titre){
        this.titre =titre;
    }

    public String getCategorie(){
        return this.categorie;
    }

    public void setCategorie(String categorie){
        this.categorie= categorie;
    }

    public String getVille(){
        return ville;
    }

    public void setVille( String ville){
        this.ville= ville;
    }

    public String getDescription (){
        return description;
    }

    public void setDescription (String description){
        this.description=description;
    }

    public String getAdresse(){
        return adresse;
    }

    public void setAdresse(String adresse){
        this.adresse =adresse;
    }

    public double getLatitude(){
        return latitude;
    }

    public double getLongitude(){
        return longitude;
    }

    public void setLatitude ( double latitude){
        this.latitude= latitude;
    }
    public void setLongitude(double longitude){
        this.longitude=longitude;
    }
    public String getImageUrl() {
        return imageURL;
    }

    public void setImageUrl(String imageUrl) {
        this.imageURL = imageUrl;
    }
}
