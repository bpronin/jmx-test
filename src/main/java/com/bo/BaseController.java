package com.bo;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

/**
 * Class com.bo.Controller.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
@ManagedResource
public class BaseController extends AbstractController {

    private String parameter;

    public BaseController() {
    }

    @ManagedAttribute
    public String getParameter() {
        return parameter;
    }

    @ManagedAttribute
    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    @ManagedOperation
    public String show() {
        return parameter;
    }

}
