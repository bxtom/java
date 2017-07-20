package com.tomek.app.logic;

import com.tomek.app.exceptions.DivideByZeroException;

public class MathOps {
    public double multiply(double liczba1, double liczba2) {
        return liczba1 * liczba2;
    }

    public double divide(double liczba1, double liczba2) throws DivideByZeroException {
        if(liczba2 == 0.0) {
            throw new DivideByZeroException("Dzielisz przez zero");
        }
        return liczba1 / liczba2;
    }
}
