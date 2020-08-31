package com.qiangesoft.accessory.service;

import com.qiangesoft.accessory.dao.AccessoryMapper;
import com.qiangesoft.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessoryServiceImpl implements AccessoryService {

    @Autowired
    private AccessoryMapper accessoryMapper;
    @Autowired
    private UserService userService;
}
