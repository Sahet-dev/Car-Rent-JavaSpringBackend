package com.example.carrent.security.jwt;

import org.springframework.security.core.AuthenticationException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface JwtAuthenticationEntry {
    void commence(HttpServletRequest request, HttpServletResponse response,
                  AuthenticationException authException) throws IOException;
}
