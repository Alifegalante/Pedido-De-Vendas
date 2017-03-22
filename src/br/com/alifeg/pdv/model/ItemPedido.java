
package br.com.alifeg.pdv.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class ItemPedido {
  
    private Produto produto;

    public static final String PROP_PRODUTO = "produto";

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        Produto oldProduto = this.produto;
        this.produto = produto;
        propertyChangeSupport.firePropertyChange(PROP_PRODUTO, oldProduto, produto);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private Float valorUnitario;

    public static final String PROP_VALORUNITARIO = "valorUnitario";

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        Float oldValorUnitario = this.valorUnitario;
        this.valorUnitario = valorUnitario;
        propertyChangeSupport.firePropertyChange(PROP_VALORUNITARIO, oldValorUnitario, valorUnitario);
    }
    
    private Float descontoUnitario;

    public static final String PROP_DESCONTOUNITARIO = "descontoUnitario";

    public Float getDescontoUnitario() {
        return descontoUnitario;
    }

    public void setDescontoUnitario(Float descontoUnitario) {
        Float oldDescontoUnitario = this.descontoUnitario;
        this.descontoUnitario = descontoUnitario;
        propertyChangeSupport.firePropertyChange(PROP_DESCONTOUNITARIO, oldDescontoUnitario, descontoUnitario);
    }

}
