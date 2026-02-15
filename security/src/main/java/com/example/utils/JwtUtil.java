package com.example.utils;

import com.example.api.entity.UserEntity;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.Map;

@Service
public class JwtUtil {

    private static final String SECRET_KEY = "mlp-employee-management-super-secret-key";
    private static final long EXPIRATION_TIME = 86400000;// 1 day in milliseconds

    private Key getSigningKey() {
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }

    private final Date expirationTime = new Date(System.currentTimeMillis() + EXPIRATION_TIME);

    public String generateToken(Map<String, Object> claim, UserEntity userEntity) {
        return buildJwtToken(claim, userEntity, expirationTime);
    }

    private String buildJwtToken(Map<String, Object> claim, UserEntity userEntity, Date expirationTime) {
        return Jwts.builder()
                .setClaims(claim)
                .setSubject(userEntity.getEmail())
                .setExpiration(expirationTime)
                .setIssuedAt(DateUtils.getNowInDate())
                .signWith(getSigningKey())
                .compact();
    }
}
