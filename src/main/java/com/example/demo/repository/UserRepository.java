package com.example.demo.repository;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.cfg.JPAIndexHolder;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.function.Function;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

        User CheckUser(String username,String password);

}
