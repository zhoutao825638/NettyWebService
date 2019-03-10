package com.seven.web.example.controller;

import com.seven.web.core.annotation.Bean;
import com.seven.web.core.annotation.Controller;
import com.seven.web.core.annotation.Mapping;
import com.seven.web.core.common.enums.HttpRequestMethod;
import com.seven.web.core.common.enums.RenderType;

/**
 * @author Seven zhoutao825638@vip.qq.com
 * @version 0.0.1
 * @data 2019-03-09 23:51
 */
@Bean
@Controller("/user")
public class UserController {

  @Mapping(value = "/tao", method = HttpRequestMethod.GET, renderType = RenderType.HTML)
  public String getIndexPage() {
    return null;
  }

  @Mapping(value = "/tom", method = HttpRequestMethod.POST, renderType = RenderType.JSON)
  public String renderJsonString() {
    return null;
  }
}
