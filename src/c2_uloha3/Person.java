/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2_uloha3;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Eduardo Martinez
 */
@Entity
@Table(name = "OSOBA_U1")
@NamedQuery(name="Person.findAll", query="SELECT o FROM Person o") 
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "meno")
    private String name;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "narodena")
    private Date born; 
    @Column(name = "vyska")
    private float height;
    @Column(name = "vaha")
    private float weight;
    @Transient
    private int age;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Date getBorn() {
        return born;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "c2_uloha3.Person[ id=" + id + " ]";
    }

    public Person() {
    }

    public Person(String name, Date born, float height, float weight) {
        this.name = name;
        this.born = born;
        this.height = height;
        this.weight = weight;
    }
    
    
}
