package com.logger.web.controller;

import com.logger.web.model.dto.request.LoginRequest;
import com.logger.web.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/auth")
@RestController
public class AuthController {
    private final UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest login) {
        return null;
    }
}
