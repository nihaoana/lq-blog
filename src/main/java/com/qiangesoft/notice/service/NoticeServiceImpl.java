package com.qiangesoft.notice.service;

import com.qiangesoft.notice.dao.NoticeMapper;
import com.qiangesoft.notice.dao.NoticeUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeMapper noticeMapper;
    @Autowired
    private NoticeUserMapper noticeUserMapper;
}
