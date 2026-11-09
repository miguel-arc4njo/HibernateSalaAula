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
public class UnidadeResgate extends Viatura {
    private Integer id;
    private Integer capacidade;
    
    public UnidadeResgate(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
       
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof UnidadeResgate) {
            UnidadeResgate aux = (UnidadeResgate) obj;

            /* if ((aux.getId().equals(this.id)) && (aux.getPlaca().equals(this.placa))) {
                return true;
            }
             */
            if (aux.getId().equals(this.id) && (aux.getCapacidade().equals(this.capacidade))) {
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
