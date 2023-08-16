package com.tnpay.userservice.exception;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class ApiError {
    List<PsoError> apiErrors;

    public void addError(PsoError error) {
        if (apiErrors == null) {
            apiErrors = new ArrayList<>();
        }
        apiErrors.add(error);
    }
}
