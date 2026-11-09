/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernatesalaaula.turmab.entidades;

import jakarta.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author aluno
 */@PrimaryKeyJoinColumn(name = "id")
 
public class AutoEscada extends Viatura {
    private Integer id;
    private Integer alturaMax;
    
    public AutoEscada(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(Integer alturaMax) {
        this.alturaMax = alturaMax;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Viatura) {
            Viatura aux = (Viatura) obj;

            /* if ((aux.getId().equals(this.id)) && (aux.getPlaca().equals(this.placa))) {
                return true;
            }
             */
            if (aux.getId().equals(this.id) && (aux.getAlturaMax().equals(this.alturaMax))) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
