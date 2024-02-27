package portalrh.com.portalRH.models;

public class DadosBancarios {
    private tipoConta tipoConta;
    private String banco;
    private String agencia;
    private String conta;

    public DadosBancarios() {

    }

    public tipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(tipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "DadosBancarios{" +
                "tipoConta=" + tipoConta +
                ", banco='" + banco + '\'' +
                ", agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                '}';
    }
}
