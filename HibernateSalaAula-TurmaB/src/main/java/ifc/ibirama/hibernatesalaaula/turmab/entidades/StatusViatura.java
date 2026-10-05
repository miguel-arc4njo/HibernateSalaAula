/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernatesalaaula.turmab.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author aluno
 */
public class StatusViatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stv_id")
    private Integer id;
    
    @Column(name = "stv_descricao", length = 45, unique = false, nullable = false)
    private String descricao;
    
    @Column(name = "stv_sigla", length = 5, unique = false, nullable = false)
    private String sigla;
    
    //id
    public Integer getId() {    
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //descricao
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // alt + insert
    //sigla
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Viatura) {
            Viatura aux = (Viatura) obj;

            /* if ((aux.getId().equals(this.id)) && (aux.getPlaca().equals(this.placa))) {
            return true;
            }
            */
            if (aux.getId().equals(this.id) && (aux.getPlaca().equals(this.descricao))) {
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
