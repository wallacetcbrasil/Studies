package dio.base;

import java.math.BigDecimal;

/**
 * @author Wallace Teixeira Correia Brasil
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 1.0.0
 */

public class Order {
    
    // Represent the code of order
    private final String code;
    private final BigDecimal totalValue;

    /**
     * Contructor of class
     * 
     * @param code          Request code
     * @param totalValue    Total amout of order
     */
    public Order(String code, BigDecimal totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

    /**
     * Calculate the total value according to the order value. If the amount exceeds BRL 100.00, a fee will billing.
     * 
     * @return Total amount of order with billing.
     * @throws RuntimeException If order amount to negative.
     */
    public BigDecimal calculateFee() throws RuntimeException {
        if (this.totalValue.signum() < 0) {
            throw new RuntimeException("O pedido nao pode ter valor negativo");
        }
        if (this.totalValue.compareTo(new BigDecimal("100.00"))> 100) {
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return this.totalValue;
    }

}
