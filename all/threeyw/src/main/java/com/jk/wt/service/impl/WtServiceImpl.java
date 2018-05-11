package com.jk.wt.service.impl;

import com.jk.wt.dao.WtDao;
import com.jk.wt.service.WtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WtServiceImpl implements WtService {
    @Autowired
    private WtDao dao;
}
