package br.com.unicesumar.endereco.event;

public class CriarEnderecoEvent {

    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cep;

    public CriarEnderecoEvent(String logradouro, Integer numero, String bairro, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }
}
