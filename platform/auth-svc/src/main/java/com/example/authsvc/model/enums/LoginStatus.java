package com.example.authsvc.model.enums;

/**
 * Enum representing the status of a login attempt
 */
public enum LoginStatus {
    /**
     * Login attempt was successful
     */
    SUCCESS,

    /**
     * Login attempt failed
     */
    FAILED,

    /**
     * Login attempt was blocked
     */
    BLOCKED
}
