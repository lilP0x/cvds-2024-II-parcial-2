
package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LAURA_RODRIGUEZ")
public class NewTable {
    @Id
    @Column(name = "Num Pregunta")
    private Integer num_Pregunta;
    @Column(name = "Letra Resp.")
    private String letraResp;
    @Column(name = "Argumento")
    private String argumento;

    public NewTable() {
    }

    public NewTable(Integer num_Pregunta, String letraResp, String argumento ) {
        this.num_Pregunta = num_Pregunta;
        this.letraResp = letraResp;
        this.argumento = argumento;
    }

    public Integer getNumPregunta() {
        return num_Pregunta;
    }

    public void setNumPregunta(Integer num_Pregunta) {
        this.num_Pregunta = num_Pregunta;
    }

    public String getLetraResp() {
        return letraResp;
    }

    public void setLetraResp(String letraResp) {
        this.letraResp = letraResp;
    }

    public String getArgumento() {
        return letraResp;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }
}