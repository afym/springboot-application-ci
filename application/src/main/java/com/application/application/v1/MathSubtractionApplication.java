package com.application.application.v1;

import com.application.service.v1.MathSubtraction;
import org.springframework.stereotype.Service;

@Service
public class MathSubtractionApplication implements MathSubtraction {
    @Override
    public double action(double a, double b) {
        return a - b;
    }
}
