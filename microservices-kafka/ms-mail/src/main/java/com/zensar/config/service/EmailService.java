package com.zensar.config.service;

import com.zensar.config.entity.dto.UserDto;

public interface EmailService {

    void sendSimpleMessage(UserDto input);
}
