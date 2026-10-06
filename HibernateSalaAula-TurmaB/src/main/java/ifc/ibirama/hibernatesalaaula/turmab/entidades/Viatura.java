/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.ibirama.hibernatesalaaula.turmab.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "Viatura")
public class Viatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "via_id")
    private Integer id;

    @Column(name = "via_placa", length = 7, unique = true, nullable = false)
    private String placa;

    @Column(name = "via_combustivel", length = 45, unique = false, nullable = false)
    private String combustivel;

    @Column(name = "via_ultima_revisao", length = 11, unique = false, nullable = false)
    private LocalDate ultimaRevisao;

    @Column(name = "via_km", length = 45, unique = false, nullable = false)
    private Integer km;

    //id
    public Integer getId() {
        return id;
    }

    public void setId(Integer Id) {
        this.id = Id;
    }

    //placa
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String Placa) {
        this.placa = Placa;
    }

    //combustível
    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String Combustivel) {
        this.combustivel = Combustivel;
    }

    //ultimaRevisao
    public LocalDate getUltimaRevisao() {
        return ultimaRevisao;
    }

    public void setUltimaRevisao(LocalDate UltimaRevisao) {
        this.ultimaRevisao = UltimaRevisao;
    }

    //quilômetro
    public Integer getKm() {
        return km;
    }

    public void setkm(Integer Km) {
        this.km = Km;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Viatura) {
            Viatura aux = (Viatura) obj;

            /* if ((aux.getId().equals(this.id)) && (aux.getPlaca().equals(this.placa))) {
                return true;
            }
             */
            if (aux.getId().equals(this.id) && (aux.getPlaca().equals(this.placa))) {
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
