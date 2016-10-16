package entities;


import javax.persistence.*;

@Entity
@Table(name = "CURS_ON_DATE")
public class CursOnDate {
    private String name;
    private long nom;
    private Double curs;
    private long code;
    private String chCode;
    private long id;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNom() {
        return nom;
    }

    public void setNom(long nom) {
        this.nom = nom;
    }

    public Double getCurs() {
        return curs;
    }

    public void setCurs(Double curs) {
        this.curs = curs;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getChCode() {
        return chCode;
    }

    public void setChCode(String chCode) {
        this.chCode = chCode;
    }
}
