package dio.base;

// Condiction structure
public class CondictionStructure1 {

    // Other attributes
    private final String code;
    private final double totalValue;

    public CondictionStructure1(String code, double totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    // if - else -> structure
    public double calculateFee() {
        if (totalValue > 100) {
            return totalValue * 0.99;
        } else {
            return this.totalValue;
        }
    }
    
}
