package com.application.controller.v1.math;

import com.application.application.v1.MathAdditionApplication;
import com.application.application.v1.MathDivisionApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathDivisionRestController {
    @Autowired
    private MathDivisionApplication application;

    @RequestMapping(value="/v1/maths/div/{value1}/{value2}", method = RequestMethod.GET)
    public ResponseModel action(@PathVariable("value1") int value1, @PathVariable("value2") int value2) {
        ResponseModel model = new ResponseModel();
        model.setResult(application.action(value1, value2));
        return model;
    }
}
