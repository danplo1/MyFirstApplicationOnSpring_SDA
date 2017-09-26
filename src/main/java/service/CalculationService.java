package service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public interface CalculationService {

    BigInteger factorial (Long n);
}
