package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DANIEL_ACERO")
public class Configuration {
    @Id
    @Column(name = "pregunta")
    private String pregunta;
    @Column(name = "respuesta")
    private String respuesta;
    @Column(name = "justificacion")
    private String justificacion;

    public Configuration() {
    }

    public Configuration(String propiedad, String respuesta, String justificacion) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.justificacion = justificacion;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pregunta == null) ? 0 : pregunta.hashCode());
        result = prime * result + ((respuesta == null) ? 0 : respuesta.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Configuration other = (Configuration) obj;
        if (pregunta == null) {
            if (other.pregunta != null)
                return false;
        } else if (!pregunta.equals(other.pregunta))
            return false;
        if (respuesta == null) {
            if (other.respuesta != null)
                return false;
        } else if (!respuesta.equals(other.respuesta))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Configuration [pregunta = " + pregunta + ", respuesta = " + respuesta + ", justificacion = " + justificacion + "]";
    }
}
