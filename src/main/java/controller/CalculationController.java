package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@RestController
@RequestMapping

public class CalculationController {

    public static Logger LOG = Logger.getLogger("CalculationController");

    @Autowired
    private CalculationService calculationService;

    @RequestMapping("/factorial/{n}")
    public logg add (@PathVariable(value = "n") Long n){
        return calculationService.factorial(n);
    }

    @PostConstruct
    private void post (){
        LOG.info("Calculation Controller initialized.");
        LOG.info(restTemplate.toString());
        LOG.info(calculationService.toString());


    }

}
