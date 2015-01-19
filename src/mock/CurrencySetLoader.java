package mock;

import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader implements persistence.CurrencySetLoader {
    @Override
    public CurrencySet load() {
        CurrencySet set = new CurrencySet();
        set.add(new Currency("EUR","Euro","€"));
        set.add(new Currency("USD","Dolar americano","$"));
        set.add(new Currency("HKD","Dolar Hong Kong","$"));
        set.add(new Currency("JPY","YEN JAPONES","¥"));
        set.add(new Currency("CAD","DOLAR CANADIENSE","$"));
        set.add(new Currency("MXN","Peso mexicano","$"));
      
        return set;
    }
}
