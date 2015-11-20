/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JhGomezR
 */
@Entity
@Table(name = "proveedor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p"),
    @NamedQuery(name = "Proveedor.findByIdProveedor", query = "SELECT p FROM Proveedor p WHERE p.idProveedor = :idProveedor"),
    @NamedQuery(name = "Proveedor.findByProveedorNombre", query = "SELECT p FROM Proveedor p WHERE p.proveedorNombre = :proveedorNombre"),
    @NamedQuery(name = "Proveedor.findByProveedorDireccion", query = "SELECT p FROM Proveedor p WHERE p.proveedorDireccion = :proveedorDireccion"),
    @NamedQuery(name = "Proveedor.findByProveedorTelefono", query = "SELECT p FROM Proveedor p WHERE p.proveedorTelefono = :proveedorTelefono"),
    @NamedQuery(name = "Proveedor.findByProveedorCelular", query = "SELECT p FROM Proveedor p WHERE p.proveedorCelular = :proveedorCelular"),
    @NamedQuery(name = "Proveedor.findByProveedorEmail", query = "SELECT p FROM Proveedor p WHERE p.proveedorEmail = :proveedorEmail"),
    @NamedQuery(name = "Proveedor.findByProveedorDescripcion", query = "SELECT p FROM Proveedor p WHERE p.proveedorDescripcion = :proveedorDescripcion")})
public class Proveedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_proveedor")
    private Integer idProveedor;
    @Size(max = 45)
    @Column(name = "proveedor_nombre")
    private String proveedorNombre;
    @Size(max = 45)
    @Column(name = "proveedor_direccion")
    private String proveedorDireccion;
    @Size(max = 20)
    @Column(name = "proveedor_telefono")
    private String proveedorTelefono;
    @Size(max = 20)
    @Column(name = "proveedor_celular")
    private String proveedorCelular;
    @Size(max = 30)
    @Column(name = "proveedor_email")
    private String proveedorEmail;
    @Size(max = 150)
    @Column(name = "proveedor_descripcion")
    private String proveedorDescripcion;

    public Proveedor() {
    }

    public Proveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getProveedorNombre() {
        return proveedorNombre;
    }

    public void setProveedorNombre(String proveedorNombre) {
        this.proveedorNombre = proveedorNombre;
    }

    public String getProveedorDireccion() {
        return proveedorDireccion;
    }

    public void setProveedorDireccion(String proveedorDireccion) {
        this.proveedorDireccion = proveedorDireccion;
    }

    public String getProveedorTelefono() {
        return proveedorTelefono;
    }

    public void setProveedorTelefono(String proveedorTelefono) {
        this.proveedorTelefono = proveedorTelefono;
    }

    public String getProveedorCelular() {
        return proveedorCelular;
    }

    public void setProveedorCelular(String proveedorCelular) {
        this.proveedorCelular = proveedorCelular;
    }

    public String getProveedorEmail() {
        return proveedorEmail;
    }

    public void setProveedorEmail(String proveedorEmail) {
        this.proveedorEmail = proveedorEmail;
    }

    public String getProveedorDescripcion() {
        return proveedorDescripcion;
    }

    public void setProveedorDescripcion(String proveedorDescripcion) {
        this.proveedorDescripcion = proveedorDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProveedor != null ? idProveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.idProveedor == null && other.idProveedor != null) || (this.idProveedor != null && !this.idProveedor.equals(other.idProveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Proveedor[ idProveedor=" + idProveedor + " ]";
    }
    
}
