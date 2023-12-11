package semantic.symbol;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Symbol {
    public SymbolType type;
    private int address;

    public Symbol(SymbolType type, int address) {
        this.type = type;
        this.address = address;
    }

    public int getAddress() {
        return address;
    }
}
