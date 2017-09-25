package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.math.BigInteger;
import java.util.logging.Logger;

@RestController
@RequestMapping("/calculations")
public class CalculationController {

    public static Logger LOG = Logger.getLogger("CalculationController");

    @Autowired
    private CalculationService calculationService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add/{a}/{b}")
    public long add(@PathVariable(value = "a") Long a, @PathVariable(value = "b") Long b) {
        return a + b;
    }

    @RequestMapping("/factorial/{n}")
    public BigInteger add(@PathVariable(value = "n") Long n) {
        return  calculationService.factorial(n);
    }

    @PostConstruct
    private void post() {
        LOG.info("Calculation Controller initialized.");
        LOG.info(restTemplate.toString());
        LOG.info(calculationService.toString());
    }
}