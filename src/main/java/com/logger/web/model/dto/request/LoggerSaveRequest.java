package com.logger.web.model.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class LoggerSaveRequest {
    private String name;

    private String macAddress;

    private int serialNumber;
}
