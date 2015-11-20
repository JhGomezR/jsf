/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JhGomezR
 */
@Entity
@Table(name = "finca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Finca.findAll", query = "SELECT f FROM Finca f"),
    @NamedQuery(name = "Finca.findByIdFinca", query = "SELECT f FROM Finca f WHERE f.fincaPK.idFinca = :idFinca"),
    @NamedQuery(name = "Finca.findByFincaNombre", query = "SELECT f FROM Finca f WHERE f.fincaNombre = :fincaNombre"),
    @NamedQuery(name = "Finca.findByDepartamentoIdDepto", query = "SELECT f FROM Finca f WHERE f.fincaPK.departamentoIdDepto = :departamentoIdDepto")})
public class Finca implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FincaPK fincaPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "finca_nombre")
    private String fincaNombre;
    @JoinColumn(name = "departamento_id_depto", referencedColumnName = "id_depto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Departamento departamento;

    public Finca() {
    }

    public Finca(FincaPK fincaPK) {
        this.fincaPK = fincaPK;
    }

    public Finca(FincaPK fincaPK, String fincaNombre) {
        this.fincaPK = fincaPK;
        this.fincaNombre = fincaNombre;
    }

    public Finca(int idFinca, int departamentoIdDepto) {
        this.fincaPK = new FincaPK(idFinca, departamentoIdDepto);
    }

    public FincaPK getFincaPK() {
        return fincaPK;
    }

    public void setFincaPK(FincaPK fincaPK) {
        this.fincaPK = fincaPK;
    }

    public String getFincaNombre() {
        return fincaNombre;
    }

    public void setFincaNombre(String fincaNombre) {
        this.fincaNombre = fincaNombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fincaPK != null ? fincaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Finca)) {
            return false;
        }
        Finca other = (Finca) object;
        if ((this.fincaPK == null && other.fincaPK != null) || (this.fincaPK != null && !this.fincaPK.equals(other.fincaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Finca[ fincaPK=" + fincaPK + " ]";
    }
    
}
