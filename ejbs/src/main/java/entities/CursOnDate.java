package entities;


import javax.persistence.*;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
@XmlRootElement(name="cursOnDate")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "CURS_ON_DATE")
public class CursOnDate {
    private String name;
    private long nom;
    private Double curs;
    private long code;
    private String chCode;
    private long id;
    private Date onDate;

    @Id
    @SequenceGenerator(name="SEQ_GEN", sequenceName="CURS_ON_DATE_SEQ", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @FormParam("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @FormParam("nom")
    public long getNom() {
        return nom;
    }

    public void setNom(long nom) {
        this.nom = nom;
    }

    @FormParam("curs")
    public Double getCurs() {
        return curs;
    }

    public void setCurs(Double curs) {
        this.curs = curs;
    }

    @FormParam("code")
    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    @FormParam("chCode")
    @Column(name = "CH_CODE")
    public String getChCode() {
        return chCode;
    }

    public void setChCode(String chCode) {
        this.chCode = chCode;
    }

    @FormParam("onDate")
    @Column(name = "ONDATE")
    public Date getOnDate() {
        return onDate;
    }

    public void setOnDate(Date onDate) {
        this.onDate = onDate;
    }
}
