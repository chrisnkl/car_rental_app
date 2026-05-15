package com.chrisnkl.backend.infrastracture.web.dto;

public record BackendResponse<T>(

        int status,
        long timestamp,
        String message,
        T data

) {
}
