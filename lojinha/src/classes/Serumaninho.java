/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


/**
 *
 * @author aluno
 */
public class Serumaninho {

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dt_nasc
     */
    public Date getDt_nasc() {
        return dt_nasc;
    }

    /**
     * @param dt_nasc the dt_nasc to set
     */
    public void setDt_nasc(Date dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    /**
     * @return the fotos
     */
    public File getFotos() {
        return fotos;
    }

    /**
     * @param fotos the fotos to set
     */
    public void setFotos(File fotos) {
        this.fotos = fotos;
    }

    /**
     * @return the endereço
     */
    public Endereco getEndereço() {
        return endereço;
    }

    /**
     * @param endereço the endereço to set
     */
    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }

    /**
     * @return the fixo
     */
    public Telefone getFixo() {
        return fixo;
    }

    /**
     * @param fixo the fixo to set
     */
    public void setFixo(Telefone fixo) {
        this.fixo = fixo;
    }

    /**
     * @return the celular
     */
    public Telefone getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(Telefone celular) {
        this.celular = celular;
    }
    private String nome;
    private int cpf;
    private int rg;
    private String email;
    private Date dt_nasc;
    private File fotos;
    private Endereco endereço;
    private Telefone fixo;
    private Telefone celular;
}
   

