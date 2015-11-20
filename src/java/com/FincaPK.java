/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author JhGomezR
 */
@Embeddable
public class FincaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_finca")
    private int idFinca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "departamento_id_depto")
    private int departamentoIdDepto;

    public FincaPK() {
    }

    public FincaPK(int idFinca, int departamentoIdDepto) {
        this.idFinca = idFinca;
        this.departamentoIdDepto = departamentoIdDepto;
    }

    public int getIdFinca() {
        return idFinca;
    }

    public void setIdFinca(int idFinca) {
        this.idFinca = idFinca;
    }

    public int getDepartamentoIdDepto() {
        return departamentoIdDepto;
    }

    public void setDepartamentoIdDepto(int departamentoIdDepto) {
        this.departamentoIdDepto = departamentoIdDepto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idFinca;
        hash += (int) departamentoIdDepto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FincaPK)) {
            return false;
        }
        FincaPK other = (FincaPK) object;
        if (this.idFinca != other.idFinca) {
            return false;
        }
        if (this.departamentoIdDepto != other.departamentoIdDepto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.FincaPK[ idFinca=" + idFinca + ", departamentoIdDepto=" + departamentoIdDepto + " ]";
    }
    
}
