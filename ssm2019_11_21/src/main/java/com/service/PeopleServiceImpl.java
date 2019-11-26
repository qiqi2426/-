package com.service;

import com.domain.People;
import com.mapper.PeopleMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class PeopleServiceImpl implements PeopleService{

    @Resource
    private PeopleMapper peopleMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return peopleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(People record) {
        return peopleMapper.insert(record);
    }

    @Override
    @Transactional
    public int insertSelective(People record) { return peopleMapper.insertSelective(record); }

    @Override
    public People selectByPrimaryKey(Integer id) {
        return peopleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(People record) {
        return peopleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(People record) {
        return peopleMapper.updateByPrimaryKey(record);
    }

}
