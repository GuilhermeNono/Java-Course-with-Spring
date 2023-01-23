package me.nono.firststeps;

import me.nono.firststeps.exceptions.UnsupportedMathOperationException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class MathService {

    public Double mult(String numberOne, String numberTwo){
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        return convertToDouble(numberOne) * convertToDouble(numberTwo);
    }

    public Double sum(String numberOne, String numberTwo){
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    public Double div(String numberOne, String numberTwo){
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        if(convertToDouble(numberTwo) == 0) {
            return 0.0D;
        }

        return convertToDouble(numberOne) / convertToDouble(numberTwo);
    }

    public Double sub(String numberOne, String numberTwo){
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        return convertToDouble(numberOne) - convertToDouble(numberTwo);
    }

    public Double sqrt(String numberOne){

        if(!isNumeric(numberOne)){
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        return Math.sqrt(convertToDouble(numberOne));
    }

    public Double avg(String numberOne, String numberTwo) {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value.");
        }

        return (convertToDouble(numberOne) + convertToDouble(numberTwo)) / 2;
    }

    private Double convertToDouble(String strNumber) {
        if(strNumber == null) return 0D;
        String number = strNumber.replaceAll(",", ".");
        if(isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    private boolean isNumeric(String strNumber) {
        if(strNumber == null) return false;
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
