/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JhGomezR
 */
@Entity
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v"),
    @NamedQuery(name = "Venta.findByIdVenta", query = "SELECT v FROM Venta v WHERE v.ventaPK.idVenta = :idVenta"),
    @NamedQuery(name = "Venta.findByVentaFecha", query = "SELECT v FROM Venta v WHERE v.ventaFecha = :ventaFecha"),
    @NamedQuery(name = "Venta.findByClienteIdCliente", query = "SELECT v FROM Venta v WHERE v.ventaPK.clienteIdCliente = :clienteIdCliente")})
public class Venta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VentaPK ventaPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "venta_fecha")
    @Temporal(TemporalType.DATE)
    private Date ventaFecha;
    @JoinColumn(name = "cliente_id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cliente cliente;

    public Venta() {
    }

    public Venta(VentaPK ventaPK) {
        this.ventaPK = ventaPK;
    }

    public Venta(VentaPK ventaPK, Date ventaFecha) {
        this.ventaPK = ventaPK;
        this.ventaFecha = ventaFecha;
    }

    public Venta(int idVenta, int clienteIdCliente) {
        this.ventaPK = new VentaPK(idVenta, clienteIdCliente);
    }

    public VentaPK getVentaPK() {
        return ventaPK;
    }

    public void setVentaPK(VentaPK ventaPK) {
        this.ventaPK = ventaPK;
    }

    public Date getVentaFecha() {
        return ventaFecha;
    }

    public void setVentaFecha(Date ventaFecha) {
        this.ventaFecha = ventaFecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ventaPK != null ? ventaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.ventaPK == null && other.ventaPK != null) || (this.ventaPK != null && !this.ventaPK.equals(other.ventaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.Venta[ ventaPK=" + ventaPK + " ]";
    }
    
}
