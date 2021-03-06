    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.pruebaJava.jpa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.annotations.Cache;
import static org.eclipse.persistence.config.CacheIsolationType.ISOLATED;
/**
 *
 * @author adsi1261718
 */
@Cache(
isolation=ISOLATED,   
expiry=0,
alwaysRefresh=true
)
@Entity
@Table(name = "parqueadero")
@XmlRootElement
public class Parqueadero implements Serializable {
 
    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Column(name = "tamano")
    private Integer tamano;
    @Size(max = 45)
    @Column(name = "h_inicial")
    private String hInicial;
    @Size(max = 45)
    @Column(name = "h_cierre")
    private String hCierre;
    @Column(name = "ingresos")
    private Long ingresos;
    @Column(name = "tarifa")
    private Long tarifa;
    @Column(name = "horaActual")
    @Size(max = 45)
    private String horaActual;
    @Column(name = "abierto")
    private Boolean abierto;
    @OneToMany(mappedBy = "parqueadero")
    private List<Puesto> puestoList;

    public Parqueadero() {
    }

    public Parqueadero(Integer id) {
        this.id = id;
    }
    
     public Parqueadero(Integer id, Integer tamano) {
        this.id = id;
        this.tamano = tamano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    public String getHInicial() {
        return hInicial;
    }

    public void setHInicial(String hInicial) {
        this.hInicial = hInicial;
    }

    public String getHCierre() {
        return hCierre;
    }

    public void setHCierre(String hCierre) {
        this.hCierre = hCierre;
    }


    public Long getIngresos() {
        return ingresos;
    }

    public void setIngresos(Long ingresos) {
        this.ingresos = ingresos;
    }

    public Long getTarifa() {
        return tarifa;
    }

    public void setTarifa(Long tarifa) {
        this.tarifa = tarifa;
    }

    public String getHoraActual() {
        return horaActual;
    }

    public void setHoraActual(String horaActual) {
        this.horaActual = horaActual;
    }

    public Boolean getAbierto() {
        return abierto;
    }

    public void setAbierto(Boolean abierto) {
        this.abierto = abierto;
    }

    @XmlTransient
    public List<Puesto> getPuestoList() {
        return puestoList;
    }

    public void setPuestoList(List<Puesto> puestoList) {
        this.puestoList = puestoList;
    }    
}
