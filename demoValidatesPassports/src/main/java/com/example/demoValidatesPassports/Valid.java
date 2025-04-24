package com.example.demoValidatesPassports;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Valid {

    private boolean isValid ;


    public Valid(boolean isValid) {
        this.isValid = isValid;
    }

    @JsonProperty("isValid")
    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
