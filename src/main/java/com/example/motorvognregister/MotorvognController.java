package com.example.motorvognregister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {

    // Henter MotorvognRepository.java og angir det variablen "rep"
    @Autowired
    MotorvognRepository rep;

    // En postmapping som sender en "lagreMotorvogn" funksjon til MotorvognRepository
    // for å lagre en motorvogn i H2-databasen
    @PostMapping("/lagre")
    public void lagreMotorvogn(Motorvogn innMotorvogn){
        rep.lagreMotorvogn(innMotorvogn);
    }

    // En getmapping som blir brukt for å hente en liste med motorvognene
    // fra H2-databasen gjennom MotorvognRepository
    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle(){
        return rep.hentAlleMotorvogner();
    }

    // En getmapping som sender en "slettAlle" funksjon til MotorvognRepository
    // for å slette alt innholdet i H2-databasen
    @PostMapping("/slettAlle")
    public void slettAlle(){
        rep.slettMotorvogner();
    }

    @PostMapping("/slett")
    public void slett(String rad) {
        rep.slettRad(rad);
    }

    // En getmapping som blir brukt for å lage/hente alle bilene som brukeren kan velge mellom
    @GetMapping("hentBiler")
    public List<Bil> hentBiler() {
        List<Bil> listBiler = new ArrayList<>();
        listBiler.add(new Bil("Audi", "A4"));
        listBiler.add(new Bil("Audi", "B6"));
        listBiler.add(new Bil("Audi", "C8"));
        listBiler.add(new Bil("Toyota", "A3"));
        listBiler.add(new Bil("Toyota", "B5"));
        listBiler.add(new Bil("Toyota", "C7"));
        listBiler.add(new Bil("Honda", "A1"));
        listBiler.add(new Bil("Honda", "B3"));
        listBiler.add(new Bil("Honda", "C5"));
        return listBiler;
    }
}
