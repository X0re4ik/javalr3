package ru.mochalov.App.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import ru.mochalov.App.exception.ValidationFailedException;

@Service
public interface ValidationService {
    void isValid(BindingResult result) throws ValidationFailedException;
}
