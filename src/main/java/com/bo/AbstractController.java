package com.bo;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

/**
 * Class AbstractController.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
@ManagedResource
public class AbstractController {

    private int interval;

    public AbstractController() {
    }

    @ManagedAttribute
    public int getInterval() {
        return interval;
    }

    @ManagedAttribute
    public void setInterval(int interval) {
        this.interval = interval;
    }

}
