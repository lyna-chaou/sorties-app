package com.sorbonne.sorties_app.repository;
import com.sorbonne.sorties_app.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long >{
    List<Evenement> findByVille(String ville);
}


