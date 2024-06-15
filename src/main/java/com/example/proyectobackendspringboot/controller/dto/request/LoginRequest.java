package com.example.proyectobackendspringboot.controller.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {

    private String userName;

    private String password;
}
