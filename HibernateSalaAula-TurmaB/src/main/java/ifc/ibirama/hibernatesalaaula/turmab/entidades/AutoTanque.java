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
public class AutoTanque extends Viatura {

    private Integer id;
    private Float litragem;

    public AutoTanque() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getLitragem() {
        return litragem;
    }

    public void setLitragem(Float litragem) {
        this.litragem = litragem;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AutoTanque) {
            AutoTanque aux = (AutoTanque) obj;

            /* if ((aux.getId().equals(this.id)) && (aux.getPlaca().equals(this.placa))) {
                return true;
            }
             */
            if (aux.getId().equals(this.id) && (aux.getLitragem().equals(this.litragem))) {
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
