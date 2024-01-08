package com.example.motorvognregister;

public class Motorvogn {
    // Angir alle attributtene en motorvogn skal ha
    private Integer personnummer;
    private String navn;
    private String adresse;
    private String kjennetegn;
    private String bilmerke;
    private String biltype;

    // Konstruktøren som setter alle attributtene til de riktige veridene
    public Motorvogn(Integer personnummer, String navn, String adresse, String kjennetegn, String bilmerke, String biltype) {
        this.personnummer = personnummer;
        this.navn = navn;
        this.adresse = adresse;
        this.kjennetegn = kjennetegn;
        this.bilmerke = bilmerke;
        this.biltype = biltype;
    }

    // Getter og setter for alle attributtene
    public Integer getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(Integer personnummer) {
        this.personnummer = personnummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getKjennetegn() {
        return kjennetegn;
    }

    public void setKjennetegn(String kjennetegn) {
        this.kjennetegn = kjennetegn;
    }

    public String getBilmerke() {
        return bilmerke;
    }

    public void setBilmerke(String bilmerke) {
        this.bilmerke = bilmerke;
    }

    public String getBiltype() {
        return biltype;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }
}
