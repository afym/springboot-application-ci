package com.application.application.v1;

import com.application.service.v1.MathDivision;
import org.springframework.stereotype.Service;

@Service
public class MathDivisionApplication implements MathDivision {
    @Override
    public double action(double a, double b) {
        return a / b;
    }
}
