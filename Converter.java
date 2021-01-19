import java.io.InputStream;
import java.math.BigDecimal;

public class Converter {
    BigDecimal outputAmount;
    InputStream inputStream;

    public Converter(InputStream inputStream){

    super();
    this.inputStream = inputStream;
    }

    public BigDecimal getConvertedAmount(String inputCurrency, BigDecimal amount, String outputCurrency) {
        XMLReader reader = new XMLReader(inputStream);

        if(inputCurrency.equalsIgnoreCase("EUR")){
            outputAmount = reader.getConversionRate(outputCurrency).multiply(amount);
        }
        System.out.println(amount + " in " + inputCurrency.toUpperCase() + "=" + outputAmount + " in " + outputCurrency);
        return outputAmount;
    }
}
