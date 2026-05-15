package com.chrisnkl.backend.infrastructure.web.dto;

public record BackendResponse<T>(

        int status,
        long timestamp,
        String message,
        T data

) {
}
