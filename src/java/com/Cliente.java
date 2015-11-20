/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JhGomezR
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cliente.findByClienteNombres", query = "SELECT c FROM Cliente c WHERE c.clienteNombres = :clienteNombres"),
    @NamedQuery(name = "Cliente.findByClientePrimerApell", query = "SELECT c FROM Cliente c WHERE c.clientePrimerApell = :clientePrimerApell"),
    @NamedQuery(name = "Cliente.findByClienteSegApell", query = "SELECT c FROM Cliente c WHERE c.clienteSegApell = :clienteSegApell"),
    @NamedQuery(name = "Cliente.findByClienteTDi", query = "SELECT c FROM Cliente c WHERE c.clienteTDi = :clienteTDi"),
    @NamedQuery(name = "Cliente.findByClienteDi", query = "SELECT c FROM Cliente c WHERE c.clienteDi = :clienteDi"),
    @NamedQuery(name = "Cliente.findByClienteDireccion", query = "SELECT c FROM Cliente c WHERE c.clienteDireccion = :clienteDireccion"),
    @NamedQuery(name = "Cliente.findByClienteTelefono", query = "SELECT c FROM Cliente c WHERE c.clienteTelefono = :clienteTelefono"),
    @NamedQuery(name = "Cliente.findByClienteCelular", query = "SELECT c FROM Cliente c WHERE c.clienteCelular = :clienteCelular"),
    @NamedQuery(name = "Cliente.findByClienteEmail", query = "SELECT c FROM Cliente c WHERE c.clienteEmail = :clienteEmail")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cliente_nombres")
    private String clienteNombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cliente_primer_apell")
    private String clientePrimerApell;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cliente_seg_apell")
    private String clienteSegApell;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cliente_t_di")
    private String clienteTDi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cliente_di")
    private String clienteDi;
    @Size(max = 45)
    @Column(name = "cliente_direccion")
    private String clienteDireccion;
    @Size(max = 20)
    @Column(name = "cliente_telefono")
    private String clienteTelefono;
    @Size(max = 20)
    @Column(name = "cliente_celular")
    private String clienteCelular;
    @Size(max = 30)
    @Column(name = "cliente_email")
    private String clienteEmail;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private Collection<Venta> ventaCollection;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, String clienteNombres, String clientePrimerApell, String clienteSegApell, String clienteTDi, String clienteDi) {
        this.idCliente = idCliente;
        this.clienteNombres = clienteNombres;
        this.clientePrimerApell = clientePrimerApell;
        this.clienteSegApell = clienteSegApell;
        this.clienteTDi = clienteTDi;
        this.clienteDi = clienteDi;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getClienteNombres() {
        return clienteNombres;
    }

    public void setClienteNombres(String clienteNombres) {
        this.clienteNombres = clienteNombres;
    }

    public String getClientePrimerApell() {
        return clientePrimerApell;
    }

    public void setClientePrimerApell(String clientePrimerApell) {
        this.clientePrimerApell = clientePrimerApell;
    }

    public String getClienteSegApell() {
        return clienteSegApell;
    }

    public void setClienteSegApell(String clienteSegApell) {
        this.clienteSegApell = clienteSegApell;
    }

    public String getClienteTDi() {
        return clienteTDi;
    }

    public void setClienteTDi(String clienteTDi) {
        this.clienteTDi = clienteTDi;
    }

    public String getClienteDi() {
        return clienteDi;
    }

    public void setClienteDi(String clienteDi) {
        this.clienteDi = clienteDi;
    }

    public String getClienteDireccion() {
        return clienteDireccion;
    }

    public void setClienteDireccion(String clienteDireccion) {
        this.clienteDireccion = clienteDireccion;
    }

    public String getClienteTelefono() {
        return clienteTelefono;
    }

    public void setClienteTelefono(String clienteTelefono) {
        this.clienteTelefono = clienteTelefono;
    }

    public String getClienteCelular() {
        return clienteCelular;
    }

    public void setClienteCelular(String clienteCelular) {
        this.clienteCelular = clienteCelular;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

    @XmlTransient
    public Collection<Venta> getVentaCollection() {
        return ventaCollection;
    }

    public void setVentaCollection(Collection<Venta> ventaCollection) {
        this.ventaCollection = ventaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
