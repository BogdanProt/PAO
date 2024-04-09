package Lab7.service;
import Lab7.model.*;

public class ConversionCalculatorImpl implements ConversionCalculator{
    @Override
    public double conversionValutaToEur(Currency currency) {
        switch (currency) {
            case RON:
                return 0.21;
            case USD:
                return 0.92;
            case EUR:
                return 1.0;
            case GBP:
                return 1.16;
            case TRY:
                return 0.12;
            default:
                throw new IllegalArgumentException("Valuta " + currency + " nu are o rata de conversie definita.");
        }
    }

    @Override
    public void calculRata() {
        // Acestă metodă nu va fi utilizată
    }
}
