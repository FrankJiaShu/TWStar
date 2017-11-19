import org.junit.runner.RunWith;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ljh.model.User;
import com.ljh.service.api.IUserService;

import javax.annotation.Resource;

/**
 * Created by ljh on 2017/11/12.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/ApplicationContext.xml"})
public class ConnTest {
    private static Logger logger = Logger.getLogger(ConnTest.class);
    @Resource
    private IUserService userService;

    @Test
    public void testService() {
        User user = userService.getUser("1","123");
         logger.info("得到的用户名为:"+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}
