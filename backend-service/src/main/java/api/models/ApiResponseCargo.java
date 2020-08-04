package api.models;

import javax.persistence.*;


@Entity
@Table(name = "cargo")

public class ApiResponseCargo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="cargo_nome")
    private String cargo;

    @Column(name="trilha_id")
    private Integer trilhaId;

    @Column(name="cargo_missao")
    private String missao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getCargo(){
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer setTrilhaId(){
        return trilhaId;
    }

    public void setTrilhaId(Integer trilhaId) {
        this.trilhaId = trilhaId;
    }

    public String getMissao(){
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }
}