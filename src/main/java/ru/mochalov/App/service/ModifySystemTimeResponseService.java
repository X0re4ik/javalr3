package ru.mochalov.App.service;

import java.util.Date;

import ru.mochalov.App.model.Response;
import ru.mochalov.App.util.DateTimeUtil;

public class ModifySystemTimeResponseService implements ModifyResponseService{
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));
        return response;
    }
}
