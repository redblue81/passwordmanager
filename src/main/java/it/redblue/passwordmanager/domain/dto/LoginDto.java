package it.redblue.passwordmanager.domain.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String username;
    private String password;
}
