package service.impl;



import org.springframework.stereotype.Service;

import java.math.BigInteger;


    @Service
    public class CalculationServiceImpl implements service.CalculationService {

        @Override
        public BigInteger factorial(Long n) {
            return factorial(BigInteger.valueOf(n));
        }

        private BigInteger factorial(BigInteger n) {
            if (n.equals(BigInteger.ZERO)) {
                return BigInteger.ONE;
            }
            return factorial(n.subtract(BigInteger.ONE)).multiply(n);
        }
    }



