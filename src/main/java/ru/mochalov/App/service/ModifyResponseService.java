package ru.mochalov.App.service;

import org.springframework.stereotype.Service;

import ru.mochalov.App.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
