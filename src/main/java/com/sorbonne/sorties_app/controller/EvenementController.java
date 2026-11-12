package com.sorbonne.sorties_app.controller;

import com.sorbonne.sorties_app.model.Evenement;
import com.sorbonne.sorties_app.repository.EvenementRepository;
import com.sorbonne.sorties_app.service.EvenementApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.annotation.PostConstruct;
import java.util.List;

@Controller
public class EvenementController {

    private final EvenementRepository repository;
    private final EvenementApiService apiService;

    public EvenementController(EvenementRepository repository, EvenementApiService apiService) {
        this.repository = repository;
        this.apiService = apiService;
    }

    @PostConstruct
    public void initData() {
        if (repository.count() == 0) {
            repository.save(new Evenement("Concert de Jazz", "Super soirée jazz en plein air au parc.", "Paris", "Musique", "Parc de la Villette, Paris", 48.8938, 2.3883, "https://images.unsplash.com/photo-1511192336575-5a79af67a629?w=600"));
            repository.save(new Evenement("Expo Art Moderne", "Découvrez les jeunes artistes contemporains.", "Villetaneuse", "Art", "Campus Sorbonne Paris Nord", 48.9562, 2.3421, "https://images.unsplash.com/photo-1531058020387-3be344556be6?w=600"));
            repository.save(new Evenement("Festival Food Truck", "Dégustez les meilleures spécialités street food.", "Paris", "Gastronomie", "Place de la République, Paris", 48.8675, 2.3638, "https://images.unsplash.com/photo-1565123409695-7b5ef63a2efb?w=600"));
        }
    }

    @GetMapping("/")
    public String afficherEvenements(@RequestParam(name = "ville", required = false) String ville, Model model) {
        List<Evenement> liste;
        if (ville != null && !ville.trim().isEmpty()) {
            liste = apiService.chercherEvenementsParVille(ville.trim());
            if (liste.isEmpty()) {
                liste = repository.findByVille(ville.trim());
            }
        } else {
            liste = repository.findAll();
        }

        model.addAttribute("evenements", liste);
        model.addAttribute("rechercheVille", ville);
        return "index";
    }
}