package com.example.authsvc.dto.response;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Accessors(chain = true)
public class ApiResponse<T> {
    int code = 200;
    String message;
    T data;
    int errorCode;
    String errorMessage;

    public ApiResponse(int code, String message, T data) {
        this(code, message);
        this.data = data;
    }

    public ApiResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
