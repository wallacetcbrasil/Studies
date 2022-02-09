package dio.base;

public class CondictionStructure2 {

    // Other attributes
    private final String code;
    private final int totalValue;

    public CondictionStructure2(String code, int totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    // switch - case -> structure
        public double calculateFee() {
            switch (this.totalValue) {
                case 100:
                return totalValue * 0.99;
                case 200:
                return totalValue * 1.99;
                default:
                return totalValue;
            }
        }
    

    
}
