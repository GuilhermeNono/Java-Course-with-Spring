package me.nono.firststeps;

import lombok.RequiredArgsConstructor;
import me.nono.firststeps.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequiredArgsConstructor
public class MathController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final MathService mathService;

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        return mathService.sum(numberOne, numberTwo);
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws Exception{
        return mathService.sub(numberOne, numberTwo);
    }

    @RequestMapping(value = "/sqrt/{numberOne}", method = RequestMethod.GET)
    public Double sqrt(
            @PathVariable(value = "numberOne") String numberOne
    ) throws Exception{
        return mathService.sqrt(numberOne);
    }

    @RequestMapping(value = "/avg/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double avg(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) {
        return mathService.avg(numberOne, numberTwo);
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) {
        return mathService.div(numberOne, numberTwo);
    }

    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multi(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) {
        return mathService.mult(numberOne, numberTwo);
    }


}
