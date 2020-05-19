package com.emart.security.auth.jwt.verifier;

/**
 * 
 * @author krishnarjun.pampana
 *
 *
 */
public interface TokenVerifier {
    public boolean verify(String jti);
}
