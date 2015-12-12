package com.mason.samples.servants;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by bmason42 on 8/26/15.
 */
@XmlRootElement
public class ResponseOne implements Serializable{
    private String message;
    private int numberField=42;
    public ResponseOne() {
    }

    public ResponseOne(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNumberField() {
        return numberField;
    }

    public void setNumberField(int numberField) {
        this.numberField = numberField;
    }
}
