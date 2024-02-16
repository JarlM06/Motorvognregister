package com.example.motorvognregister;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MotorvognRepository {
    @Autowired
    private JdbcTemplate db;

    public void lagreMotorvogn(Motorvogn motorvogn) {
        String sql = "INSERT INTO Motorvogn (personnummer, navn, adresse, kjennetegn, bilmerke, biltype) VALUES(?, ?, ?, ?, ?, ?, ?)";
        db.update(sql, motorvogn.getPersonnummer(), motorvogn.getNavn(), motorvogn.getAdresse(),  motorvogn.getKjennetegn(),  motorvogn.getBilmerke(),  motorvogn.getBiltype());
    }

    public List<Motorvogn> hentAlleMotorvogner() {
        String sql = "SELECT * FROM Motorvogn";
        List<Motorvogn> alleMotorvogner = db.query(sql,new BeanPropertyRowMapper(Motorvogn.class));
        return alleMotorvogner;
    }

    public void slettMotorvogner () {
        String sql = "DELETE FROM Motorvogn";
        db.update(sql);
    }

    public void slettRad (String rad) {
        String sql = "DELETE FROM Motorvogn WHERE id = rad";
        db.update(sql);
    }
}
