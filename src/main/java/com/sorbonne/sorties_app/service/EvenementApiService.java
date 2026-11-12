package com.sorbonne.sorties_app.service;

import com.sorbonne.sorties_app.model.Evenement;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

@Service
public class EvenementApiService {

    public List<Evenement> chercherEvenementsParVille(String recherche) {
        List<Evenement> resultats = new ArrayList<>();
        if (recherche == null || recherche.trim().isEmpty()) {
            return resultats;
        }

        String nomVille = recherche.trim().substring(0, 1).toUpperCase() + recherche.trim().substring(1);
        String v = Normalizer.normalize(recherche.trim().toLowerCase(), Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");

        double latBase = 48.8566;
        double lonBase = 2.3522;

        // --- 1. PARIS ---
        if (v.contains("paris")) {
            resultats.add(new Evenement("Galeries Lafayette Haussmann", "Grand magasin mythique, shopping de luxe et coupole Art Nouveau.", "Paris", "Centre Commercial", "40 Boulevard Haussmann, 75009 Paris", 48.8732, 2.3316, "https://images.unsplash.com/photo-1555529669-e69e7aa0ba9a?w=800"));
            resultats.add(new Evenement("Tour Eiffel & Champ de Mars", "Le monument emblématique de Paris et ses grands jardins.", "Paris", "Monuments & Patrimoine", "Champ de Mars, 75007 Paris", 48.8584, 2.2945, "https://images.unsplash.com/photo-1511739001486-6bfe10ce785f?w=800"));
            resultats.add(new Evenement("Arc de Triomphe", "Monument historique au sommet des Champs-Élysées.", "Paris", "Monuments & Patrimoine", "Place Charles de Gaulle, 75008 Paris", 48.8738, 2.2950, "https://images.unsplash.com/photo-1509299349698-dd22323b5963?w=800"));
            resultats.add(new Evenement("Musée du Louvre", "Plus grand musée d'art au monde, abritant La Joconde.", "Paris", "Musée & Culture", "Rue de Rivoli, 75001 Paris", 48.8606, 2.3376, "https://images.unsplash.com/photo-1565099824688-e93eb20fe622?w=800"));
            resultats.add(new Evenement("Bowling Foch", "Complexes de pistes de bowling, billards et bar.", "Paris", "Bowling & Loisirs", "8 Avenue Foch, 75116 Paris", 48.8738, 2.2910, "https://images.unsplash.com/photo-1538388149542-5e24932d11a8?w=800"));
            resultats.add(new Evenement("Le Grand Rex", "Salle de cinéma mythique et spectacles grand écran.", "Paris", "Cinéma", "1 Boulevard Poissonnière, 75002 Paris", 48.8705, 2.3478, "https://images.unsplash.com/photo-1489599849927-2ee91cede3ba?w=800"));
            return resultats;
        }

        // --- 2. LYON ---
        if (v.contains("lyon")) {
            resultats.add(new Evenement("Westfield La Part-Dieu", "L'un des plus grands centres commerciaux d'Europe au cœur de Lyon.", "Lyon", "Centre Commercial", "17 Rue Dr Bouchut, 69003 Lyon", 45.7610, 4.8580, "https://images.unsplash.com/photo-1555529669-e69e7aa0ba9a?w=800"));
            resultats.add(new Evenement("Basilique Notre-Dame de Fourvière", "Superbe basilique surplombant Lyon avec vue panoramique.", "Lyon", "Monuments & Patrimoine", "8 Place de Fourvière, 69005 Lyon", 45.7623, 4.8225, "https://images.unsplash.com/photo-1524492412937-b28074a5d7da?w=800"));
            resultats.add(new Evenement("Parc de la Tête d'Or", "Immense parc urbain avec lac, roseraie et zoo gratuit.", "Lyon", "Nature & Parc", "Place Général Leclerc, 69006 Lyon", 45.7772, 4.8554, "https://images.unsplash.com/photo-1507525428034-b723cf961d3e?w=800"));
            resultats.add(new Evenement("Pathé Bellecour", "Cinéma historique situé sur la grande place Bellecour.", "Lyon", "Cinéma", "79 Rue de la République, 69002 Lyon", 45.7580, 4.8350, "https://images.unsplash.com/photo-1489599849927-2ee91cede3ba?w=800"));
            resultats.add(new Evenement("Bowling des Lumières", "Grand bowling moderne avec billards et laser game à OL Vallée.", "Lyon", "Bowling & Loisirs", "2 Avenue Simone Veil, 69150 Décines-Charpieu", 45.7650, 4.9820, "https://images.unsplash.com/photo-1538388149542-5e24932d11a8?w=800"));
            resultats.add(new Evenement("Musée des Confluences", "Musée d'histoire naturelle et des civilisations à l'architecture futuriste.", "Lyon", "Musée & Culture", "86 Quai Perrache, 69002 Lyon", 45.7328, 4.8182, "https://images.unsplash.com/photo-1531058020387-3be344556be6?w=800"));
            return resultats;
        }

        // --- 3. ARGENTEUIL ---
        if (v.contains("argenteuil")) {
            resultats.add(new Evenement("Centre Commercial Côté Seine", "Galerie marchande moderne avec de nombreuses boutiques.", "Argenteuil", "Centre Commercial", "50 Avenue du Maréchal Foch, 95100 Argenteuil", 48.9420, 2.2530, "https://images.unsplash.com/photo-1555529669-e69e7aa0ba9a?w=800"));
            resultats.add(new Evenement("Cinéma Le Figuier de France", "Cinéma grand public et projections culturelles.", "Argenteuil", "Cinéma", "16 Rue Grégoire Collas, 95100 Argenteuil", 48.9480, 2.2490, "https://images.unsplash.com/photo-1489599849927-2ee91cede3ba?w=800"));
            resultats.add(new Evenement("Maison Claude Monet", "Musée dédié au patrimoine artistique et aux œuvres de Monet.", "Argenteuil", "Musée & Culture", "21 Boulevard Karl Marx, 95100 Argenteuil", 48.9460, 2.2510, "https://images.unsplash.com/photo-1531058020387-3be344556be6?w=800"));
            resultats.add(new Evenement("Bowling Strike", "Espace de loisirs indoor avec pistes de bowling et billards.", "Argenteuil", "Bowling & Loisirs", "Zone Commerciale, 95100 Argenteuil", 48.9510, 2.2420, "https://images.unsplash.com/photo-1538388149542-5e24932d11a8?w=800"));
            return resultats;
        }

        // --- 4. AUTRES VILLES ---
        resultats.add(new Evenement("Multiplexe Cinéma " + nomVille, "Découvrez les derniers films à l'affiche dans votre ville.", nomVille, "Cinéma", "Centre-ville, " + nomVille, latBase, lonBase, "https://images.unsplash.com/photo-1489599849927-2ee91cede3ba?w=800"));
        resultats.add(new Evenement("Centre Commercial " + nomVille, "Grand espace shopping avec boutiques de mode et restaurants.", nomVille, "Centre Commercial", "Avenue Commerciale, " + nomVille, latBase + 0.005, lonBase + 0.005, "https://images.unsplash.com/photo-1555529669-e69e7aa0ba9a?w=800"));
        resultats.add(new Evenement("Bowling & Laser Game " + nomVille, "Pistes de bowling, jeux vidéo et espace détente entre amis.", nomVille, "Bowling & Loisirs", "Zone de Loisirs, " + nomVille, latBase - 0.005, lonBase - 0.005, "https://images.unsplash.com/photo-1538388149542-5e24932d11a8?w=800"));
        resultats.add(new Evenement("Musée & Galerie d'Art de " + nomVille, "Expositions culturelles, histoire locale et beaux-arts.", nomVille, "Musée & Culture", "Place du Musée, " + nomVille, latBase + 0.003, lonBase - 0.003, "https://images.unsplash.com/photo-1531058020387-3be344556be6?w=800"));

        return resultats;
    }
}