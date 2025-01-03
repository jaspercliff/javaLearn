package com.jasper.controller;

import com.jasper.domains.Users;
import com.jasper.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * (learn.Users)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {
  /** 服务对象 */
  private final UserService userService;

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("/{id}")
  public Users selectOne(@PathVariable Integer id) {
    return userService.selectByPrimaryKey(id);
  }

  @GetMapping("/name/{name}")
  public Users selectBySex(@PathVariable String name){
    return userService.selectByName(name);
  }
}
