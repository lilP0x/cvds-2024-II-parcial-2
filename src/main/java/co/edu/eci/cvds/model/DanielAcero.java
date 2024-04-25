package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "DANIEL_ACERO")
public class DanielAcero {
    @Id
    @Column(name = "Pregunta")
    private String numero;
    @Column(name = "Respuesta")
    private String respuesta;
    @Column(name = "Argumento")
    private String argumento;

    public DanielAcero() {
    }

    public DanielAcero(String numero, String respuesta, String argumento) {
        this.numero = numero;
        this.respuesta = respuesta;
        this.argumento = argumento;
    }

    public String getPregunta() {
        return numero;
    }

    public void setPregunta(String numero) {
        this.numero = numero;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }
   
}