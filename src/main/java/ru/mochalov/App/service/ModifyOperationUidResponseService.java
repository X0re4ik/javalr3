package ru.mochalov.App.service;

import java.util.UUID;

import ru.mochalov.App.model.Response;

public class ModifyOperationUidResponseService implements ModifyResponseService {
    @Override
    public Response modify(Response response) {
        UUID uuid = UUID.randomUUID();

        response.setOperationUid(uuid.toString());

        return response;
    }
}
