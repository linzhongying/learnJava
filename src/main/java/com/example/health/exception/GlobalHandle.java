package com.example.health.exception;

import com.example.health.common.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 自定义异常统一处理器
 */
@ControllerAdvice
@Slf4j
public class GlobalHandle {


    /**
     * 处理不可知异常
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResult handlerException(Exception e){
        log.error(e.getMessage(),e);
        return CommonResult.failed("请求异常,请重新操作");
    }

    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public CommonResult handlerCustomException(CustomException e){
        log.error(e.getMessage());
        return CommonResult.failed(e.getMessage());
    }
}
