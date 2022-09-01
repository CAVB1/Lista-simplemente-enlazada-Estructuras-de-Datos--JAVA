/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eprimerparcial_ejercicio1;

import java.util.Objects;


public class Medicamento {
    private String nombre;
    private String padecimiento;

    public Medicamento(String nombre, String padecimiento) {
        this.nombre = nombre;
        this.padecimiento = padecimiento;
    }

    public String getNombre() {
        return nombre;
    }

    
    public String getPadecimiento() {
        return padecimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.padecimiento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medicamento other = (Medicamento) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.padecimiento, other.padecimiento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "nombre=" + nombre + ", padecimiento=" + padecimiento + '}';
    }

   
    
}
