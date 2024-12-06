package fr.diginamic.spring_mvc.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    /**
     * Getter
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter
     *
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
