package br.com.alifeg.pdv.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Cliente {
    
    private String codigo;

    public static final String PROP_CODIGO = "codigo";

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String oldCodigo = this.codigo;
        this.codigo = codigo;
        propertyChangeSupport.firePropertyChange(PROP_CODIGO, oldCodigo, codigo);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private String CPF;

    public static final String PROP_CPF = "CPF";

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        String oldCPF = this.CPF;
        this.CPF = CPF;
        propertyChangeSupport.firePropertyChange(PROP_CPF, oldCPF, CPF);
    }

    private String nome;

    public static final String PROP_NOME = "nome";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }

    private String situacao;

    public static final String PROP_SITUACAO = "situacao";

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        String oldSituacao = this.situacao;
        this.situacao = situacao;
        propertyChangeSupport.firePropertyChange(PROP_SITUACAO, oldSituacao, situacao);
    }

    
}
