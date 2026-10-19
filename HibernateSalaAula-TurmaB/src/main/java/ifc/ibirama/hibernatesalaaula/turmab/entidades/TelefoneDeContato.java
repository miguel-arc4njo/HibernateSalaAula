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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TelefoneDeContato")
public class TelefoneDeContato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usu_id")
    private Integer id;

    @Column(name = "tec_numero", length = 11, unique = true, nullable = false)
    private String numero;

    @Column(name = "tec_tipo", length = 5, unique = true, nullable = false)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "bom_id", unique = true)
    private Bombeiro bombeiro;

    //Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //Numero
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    //Tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Bombeiro
    public Bombeiro getBombeiro() {
        return bombeiro;
    }

    public void setBombeiro(Bombeiro bombeiro) {
        this.bombeiro = bombeiro;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TelefoneDeContato) {
            TelefoneDeContato aux = (TelefoneDeContato) obj;

            if (aux.getId().equals(this.id) && (aux.getNumero().equals(this.numero))) {
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
