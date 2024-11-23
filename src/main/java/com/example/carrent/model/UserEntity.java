package com.example.carrent.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "email_verified_at")
    private LocalDateTime emailVerifiedAt;

    @Column(name = "remember_token")
    private String rememberToken;

    @Column(nullable = false)
    private Boolean enabled;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // Getters and Setters
    public Long getId()
    { return id; }

    public void setId(Long id)
    { this.id = id; }

    public String getUsername()
    { return username; }

    public void setUsername(String username)
    { this.username = username; }

    public String getEmail()
    { return email; }

    public void setEmail(String email)
    { this.email = email; }

    public String getPassword()
    { return password; }

    public void setPassword(String password)
    { this.password = password; }

    public LocalDateTime getEmailVerifiedAt()
    { return emailVerifiedAt; }

    public void setEmailVerifiedAt(LocalDateTime emailVerifiedAt)
    { this.emailVerifiedAt = emailVerifiedAt; }

    public String getRememberToken()
    { return rememberToken; }

    public void setRememberToken(String rememberToken)
    { this.rememberToken = rememberToken; }

    public Boolean getEnabled()
    { return enabled; }

    public void setEnabled(Boolean enabled)
    { this.enabled = enabled; }

    public LocalDateTime getCreatedAt()
    { return createdAt; }

    public void setCreatedAt(LocalDateTime createdAt)
    { this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt()
    { return updatedAt; }

    public void setUpdatedAt(LocalDateTime updatedAt)
    { this.updatedAt = updatedAt; }

    public boolean isEnabled() {
        return enabled;
    }
}
