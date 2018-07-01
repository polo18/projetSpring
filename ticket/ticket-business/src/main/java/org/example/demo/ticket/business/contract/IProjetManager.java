package org.example.demo.ticket.business.contract;

import java.util.List;

import org.example.demo.ticket.model.bean.projet.Projet;

// ProjetManager est désormais une interface
public interface IProjetManager {

    Projet getProjet(Integer pId);
    List<Projet> getListProjet();
    // ...

}