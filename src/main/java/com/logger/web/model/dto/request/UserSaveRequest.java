package com.logger.web.model.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserSaveRequest {
    private String name;

    private String email;

    private String password;

    private String phoneNumber;
}
