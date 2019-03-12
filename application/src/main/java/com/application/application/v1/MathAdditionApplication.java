package com.application.application.v1;

import com.application.service.v1.MathAddition;
import org.springframework.stereotype.Service;

@Service
public class MathAdditionApplication implements MathAddition {
    @Override
    public double action(double a, double b) {
        return a + b;
    }
}
