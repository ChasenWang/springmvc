package com.wang.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    public List<String> queryUser();
}
