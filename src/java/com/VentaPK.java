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
public class VentaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_venta")
    private int idVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cliente_id_cliente")
    private int clienteIdCliente;

    public VentaPK() {
    }

    public VentaPK(int idVenta, int clienteIdCliente) {
        this.idVenta = idVenta;
        this.clienteIdCliente = clienteIdCliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getClienteIdCliente() {
        return clienteIdCliente;
    }

    public void setClienteIdCliente(int clienteIdCliente) {
        this.clienteIdCliente = clienteIdCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idVenta;
        hash += (int) clienteIdCliente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VentaPK)) {
            return false;
        }
        VentaPK other = (VentaPK) object;
        if (this.idVenta != other.idVenta) {
            return false;
        }
        if (this.clienteIdCliente != other.clienteIdCliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.VentaPK[ idVenta=" + idVenta + ", clienteIdCliente=" + clienteIdCliente + " ]";
    }
    
}
