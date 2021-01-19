import java.io.IOException;
import java.math.BigDecimal;

public class ConversionManager {

    public UserInput userInput;
    private String inputCurrency;
    private BigDecimal amount;
    private String outputCurrency;
    private Converter converter;

    public ConversionManager(UserInput userInput, Converter converter){
        this.userInput = userInput;
        this. converter = converter;
    }
    public void beginConversion() throws IOException{
        inputCurrency = userInput.userInputCurrency();
        amount = userInput. userAmount();
        outputCurrency = userInput.userOutputCerrency();
        converter.getConvertedAmount(inputCurrency,amount,outputCurrency);
    }
}
