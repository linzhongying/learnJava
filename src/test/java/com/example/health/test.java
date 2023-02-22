package com.example.health;

import com.example.health.util.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@Slf4j
class test {
    /**
     *         //日志级别 由低到高
     *         logger.trace("trace 级别日志");
     *         logger.debug("debug 级别日志");
     *         logger.info("info 级别日志");
     *         logger.warn("warn 级别日志");
     *         logger.error("error 级别日志");
     */
  //  private  final Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    void test(){
        log.info("logdsaljflkdsfj");// slf4j
//        logger.info("info"+1);
    }

    @Test
    void localAPI(){

        String s = HttpClientUtil.doGet("http://api.map.baidu.com/location/ip?ak=TVclBEUd0APgn21Da5XrN4QglmU0webG&ip=47.113.186.16&coor=bd09ll");
         //GET请求
        System.out.println(s);
    }
}
