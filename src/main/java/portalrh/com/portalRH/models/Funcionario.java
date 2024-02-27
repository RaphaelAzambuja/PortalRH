package portalrh.com.portalRH.models;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String ctbs;
    private Double salario;
    private String tituliEleitor;
    private LocalDate dataNascimento;
    private String carteiraReservista;
    private String pisPasep;
    private String registroProfissional;
    private String sindicato;
    private String setor;
    private String cnh;
    private LocalDate dataAdimissao;
    private Cargo cargo;
    private String racaCor;
    private String religiao;
    private Boolean doadorSangue;
    private List<Certificacoes> certificacoes;
    private String nacionalidade;
    private String redeSocial;
    private String areaAtuacao;
    private String matricula;
    private List <ExpAnteriores> expAnteriores;
    private String idiomas;
    private Integer horaExtra;
    private LocalTime entrada;
    private LocalTime saida;
}
