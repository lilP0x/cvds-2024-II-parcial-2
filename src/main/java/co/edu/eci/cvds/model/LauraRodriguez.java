package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "LAURA_RODRIGUEZ")
public class LauraRodriguez {
    @Id
    @Column(name = "NumeroPregunta")
    private String numero;
    @Column(name = "Respuesta")
    private String respuesta;
    @Column(name = "Argumento")
    private String argumento;

    public LauraRodriguez() {
    }

    public LauraRodriguez(String numero, String respuesta, String argumento) {
        this.numero = numero;
        this.respuesta = respuesta;
        this.argumento = argumento;
    }

    public String getnumero() {
        return numero;
    }

    public void setnumero(String numero) {
        this.numero = numero;
    }

    public String getrespuesta() {
        return respuesta;
    }

    public void setrespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    public String getrArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }
   
}
