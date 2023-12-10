package it.redblue.passwordmanager.domain.dto;

import lombok.Data;

@Data
public class RegisterDto {
    private String username;
    private String password;
    private String name;
    private String surname;
    private String email;
}
