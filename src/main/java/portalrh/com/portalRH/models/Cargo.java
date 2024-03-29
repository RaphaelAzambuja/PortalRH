package portalrh.com.portalRH.models;

public class Cargo {
    private String descricao;
    private String nivel;
    private Boolean comissionado;

    public Cargo() {

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Boolean getComissionado() {
        return comissionado;
    }

    public void setComissionado(Boolean comissionado) {
        this.comissionado = comissionado;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "descricao='" + descricao + '\'' +
                ", nivel='" + nivel + '\'' +
                ", comissionado=" + comissionado +
                '}';
    }
}
