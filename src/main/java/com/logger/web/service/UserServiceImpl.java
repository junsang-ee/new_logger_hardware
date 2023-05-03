package com.logger.web.service;

import com.logger.web.model.dto.request.UserSaveRequest;
import com.logger.web.model.entity.UserEntity;
import com.logger.web.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserSerivce {
    private final UserRepository userRepository;

    @Override
    public UserEntity get(String userId) {
        return userRepository.findById(userId).orElseThrow(
                () -> new IllegalArgumentException("not found userId")
        );
    }

    @Transactional
    @Override
    public UserEntity save(UserSaveRequest userSaveRequest) {
        return userRepository.save(toSaveEntity(userSaveRequest));
    }

    private UserEntity toSaveEntity(UserSaveRequest userSaveRequest) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(userSaveRequest.getName());
        userEntity.setEmail(userSaveRequest.getEmail());
        userEntity.setPassword(userSaveRequest.getPassword());
        userEntity.setPhoneNumber(userSaveRequest.getPhoneNumber());
        return userEntity;
    }
}
