package com.emart.security.model;

/**
 * Scopes
 * 
 * @author krishnarjun.pampana
 *
 * 
 */
public enum Scopes {
    REFRESH_TOKEN;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}
