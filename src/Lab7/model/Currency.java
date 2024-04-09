package Lab7.model;

public enum Currency {
    RON("Romania", "RO"),
    USD("United States", "US"),
    EUR("European Union", "EU"),
    GBP("United Kingdom", "GB"),
    TRY("Turkey", "TR");

    private final String country;
    private final String symbol;

    Currency(String country, String symbol) {
        this.country = country;
        this.symbol = symbol;
    }

    public String getCountry() {
        return country;
    }

    public String getSymbol() {
        return symbol;
    }
}
