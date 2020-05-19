package com.emart.dtos;

/**
 * Enumerated {@link User} roles.
 * 
 * @author krishnarjun.pampana
 *
 * 
 */
public enum Role {
    Admin, Buyer, Seller;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}
