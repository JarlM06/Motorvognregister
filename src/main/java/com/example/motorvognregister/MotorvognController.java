package com.example.motorvognregister;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {

    // Opprette en liste som inneholder alle motorvognene
    private final List<Motorvogn> alleMotorvogner = new ArrayList<>();

    // PostMapping som lagrer motorvognen i listen med alle motorvognene
    @PostMapping("/lagre")
    public void lagreMotorvogn(Motorvogn innMotorvogn) {
        alleMotorvogner.add(innMotorvogn);
    }

    // GetMapping som henter listen med alle motorvognene
    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle() {
        return alleMotorvogner;
    }

    // PostMapping som sletter alt innholdet i listen med motorvognene
    @PostMapping("/slett")
    public void slettMotorvogner() {
        alleMotorvogner.clear();
    }
}
