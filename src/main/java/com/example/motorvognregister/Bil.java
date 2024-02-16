package com.example.motorvognregister;

public class Bil {
    // Angir alle attributtene bilen skal ha
    private String merke;
    private String type;

    // Konstruktøren som setter alle attributtene til de riktige veridene
    public Bil(String merke, String type) {
        this.merke = merke;
        this.type = type;
    }

    // Tom konstruktør
    public Bil() {}

    // Getter og setter for alle attributtene
    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
