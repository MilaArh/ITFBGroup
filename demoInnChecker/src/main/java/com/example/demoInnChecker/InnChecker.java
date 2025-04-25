package com.example.demoInnChecker;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
@Controller
public class InnChecker {
    public  final Integer[] MULT_N1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
    public  final Integer[] MULT_N2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
    public  final Integer[] MULT_N =  {2, 4, 10, 3, 5, 9, 4, 6, 8};

    public String checkInn(Inn innStr) {
        Boolean valid;
        Integer[] inn = stringToIntArray(innStr.getInnStr());
        int firstDigit = Character.digit(innStr.getInnStr().charAt(0), 10);

        Integer innSize = inn.length;

        switch (innSize) {
            case 12:
                Integer N1 = getChecksum(inn,MULT_N1);
                Integer N2 = getChecksum(inn,MULT_N2);

                valid = (inn[inn.length-1].equals(N2) && inn[inn.length-2].equals(N1));
                break;
            case 10:
                Integer N = getChecksum(inn,MULT_N);
                valid = (inn[inn.length-1].equals(N));
                break;
            default:
                valid = false;
                break;
        }
        return valid ? "ИНН прошел проверку  " + getName(firstDigit): "ИНН не прошел проверку";
    }

    public  Integer[] stringToIntArray(String src) {
        char[] chars = src.toCharArray();
        ArrayList<Integer> digits = new ArrayList<Integer>();
        for (char aChar : chars) {
            digits.add(Character.getNumericValue(aChar));
        }
        return digits.toArray(new Integer[digits.size()]);
    }

    public Integer getChecksum(Integer[] digits, Integer[] multipliers) {
        int checksum = 0;
        for (int i=0; i<multipliers.length; i++) {
            checksum+=(digits[i]*multipliers[i]);
        }
        return (checksum % 11) % 10;
    }

    public  String getName(int firstDigit){
        if (firstDigit < 5) {
            return "ООО \"Рога и копыта\"";
        } else if (firstDigit >= 8) {
            return "ООО \"Заглушкасервис\"";
        } else {
            return "ООО \"Волга\"";
        }
    }
}
