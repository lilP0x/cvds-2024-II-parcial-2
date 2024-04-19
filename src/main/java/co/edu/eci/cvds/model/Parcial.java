package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "JUAN_FERNANDEZ")
public class Parcial {
    @Id
    @Column(name = "PREGUNTA")
    private String pregunta;
    @Column(name = "lETRARESP")
    private String letraResp;
    @Column(name = "ARGUMENTO")
    private String argumento;

    public Parcial() {
    }

    public Parcial(String pregunta, String letraResp, String argumento) {
        this.pregunta = pregunta;
        this.letraResp = letraResp;
        this.argumento = argumento;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getLetraResp() {
        return letraResp;
    }

    public void setLetraResp(String letraResp) {
        this.letraResp = letraResp;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String letraResp) {
        this.argumento = argumento;
    }
}
