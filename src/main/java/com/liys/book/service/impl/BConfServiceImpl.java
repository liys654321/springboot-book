package com.liys.book.service.impl;

import com.liys.book.domain.BConf;
import com.liys.book.mapper.BConfMapper;
import com.liys.book.service.BConfService;
import com.liys.book.utils.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: liys
 * @date: 2019/9/3 18:32
 * @version:1.0v
 */
@Service
public class BConfServiceImpl implements BConfService {
    @Autowired
    protected BConfMapper mapper;

    @Override
    public ResponseBase findById(Integer id) {
        BConf bConf = mapper.selectByPrimaryKey(10);
        return ResponseBase.setResultSuccess(bConf);
    }
}
