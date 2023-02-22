package com.example.health.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.example.health.common.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

      @Override
      public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
          Object o = request.getSession().getAttribute("security");
          // 登录判断
          if(o==null) {
              CommonResult result = CommonResult.unauthorized("该用户未登录");
              response.setCharacterEncoding("utf-8");
              response.setContentType("application/json;charset=utf-8");
              response.getWriter().write(JSONObject.toJSONString(result));
              return false;
          }
          return true;
      }

      @Override
      public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

      }

      @Override
      public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

      }
  }