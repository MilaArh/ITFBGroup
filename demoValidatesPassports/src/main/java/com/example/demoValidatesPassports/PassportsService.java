package com.example.demoValidatesPassports;


import org.springframework.stereotype.Service;


import java.time.Period;

@Service
public class PassportsService {



    public Valid validatesPassports(Passports passport){


        // 3-я цифра кода подразделения должна быть 0, 1, 2 или 3
        if(passport.getCode().charAt(2) == '0' || passport.getCode().charAt(2) == '1' ||
                passport.getCode().charAt(2) == '2' || passport.getCode().charAt(2) == '3' ){
            // дата рождения - дата выдачи должно быть 14 лет и больше
            if (Period.between(passport.getBirth(), passport.getIssued()).getYears() >= 14){
                // две последних цифры серии должны быть в диапазоне 91-25 (т.е. бланк паспорта
                // должен быть напечатан в диапазоне с 1991 по 2025 год)
                if (passport.getNumber()%100 <= 25 || passport.getNumber()%100 >= 91){
                    return new Valid(true);
                }
            }
        }
        return new Valid(false);
    }




}
