package com.example.authsvc.model.enums;

/**
 * Enum representing the status of a user account
 */
public enum UserStatus {
    /**
     * User account is active and can be used
     */
    ACTIVE,

    /**
     * User account is inactive
     */
    INACTIVE,

    /**
     * User account is locked due to security reasons
     */
    LOCKED,

    /**
     * User account is pending email verification
     */
    PENDING_VERIFICATION
}
