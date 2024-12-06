package fr.diginamic.spring_mvc.controllers;

import fr.diginamic.spring_mvc.models.Ville;
import fr.diginamic.spring_mvc.services.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VilleController {

    @Autowired
    private VilleService villeService;

    @GetMapping("/villes")
    public String listVilles(Model model) {
        List<Ville> villes = villeService.getAllVilles();
        model.addAttribute("villes", villes);
        return "villes";
    }

    @PostMapping("/delete-ville")
    public String deleteVille(@RequestParam Long id) {
        villeService.deleteVille(id);
        return "redirect:/villes";
    }
}
