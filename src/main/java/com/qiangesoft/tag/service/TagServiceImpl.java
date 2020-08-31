package com.qiangesoft.tag.service;

import com.qiangesoft.tag.dao.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;
}
