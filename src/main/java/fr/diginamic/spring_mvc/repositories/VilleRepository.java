package fr.diginamic.spring_mvc.repositories;

import fr.diginamic.spring_mvc.models.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VilleRepository extends JpaRepository<Ville, Long> {

}
