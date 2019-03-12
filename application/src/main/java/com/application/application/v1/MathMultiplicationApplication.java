package com.application.application.v1;

import com.application.service.v1.MathMultiplication;
import org.springframework.stereotype.Service;

@Service
public class MathMultiplicationApplication implements MathMultiplication {
    @Override
    public double action(double a, double b) {
        return a * b;
    }
}
