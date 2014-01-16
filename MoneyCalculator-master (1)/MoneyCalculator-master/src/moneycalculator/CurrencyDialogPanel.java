package moneycalculator;

import Model.Currency;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class CurrencyDialogPanel extends JPanel implements CurrencyDialog{
    
    private String currency;

    public CurrencyDialogPanel() {
        this("EUR");
    }

    public CurrencyDialogPanel(String currency) {
        super(new FlowLayout(FlowLayout.LEFT));
        this.currency = currency;
        this.createComponents();
    }
    
    @Override
    public Currency getCurrency() {
        return new Currency(currency);
    }

    private void createComponents() {
        this.add(createCurrencyDisplay());
    }

    private JComboBox createCurrencyDisplay() {
        String[] divisas = {"EUR","USD", "GBP"}; //TODO De aqui cargar todas las divisas 
        JComboBox comboBox = new JComboBox(divisas);
        comboBox.setSelectedItem(currency);
        comboBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent event) {
                if(event.getStateChange() != ItemEvent.SELECTED) return;
                currency = (String) event.getItem();
            }
        });
        return comboBox;
    }

}
