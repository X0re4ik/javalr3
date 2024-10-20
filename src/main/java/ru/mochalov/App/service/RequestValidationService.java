package ru.mochalov.App.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import ru.mochalov.App.exception.ValidationFailedException;

@Service
public class RequestValidationService implements ValidationService {
    @Override
    public void isValid(BindingResult result) throws ValidationFailedException {
        if (result.hasErrors()) {
            throw new ValidationFailedException(result.getFieldError().toString());
        }
    }
}
