package fr.diginamic.spring_mvc.services;

import fr.diginamic.spring_mvc.models.Ville;
import fr.diginamic.spring_mvc.repositories.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VilleService {
    @Autowired
    private VilleRepository villeRepository;

    public List<Ville> getAllVilles() {
        return villeRepository.findAll();
    }

    public void deleteVille(Long id) {
        villeRepository.deleteById(id);
    }

    public Ville saveVille(Ville ville) {
        return villeRepository.save(ville);
    }
}
