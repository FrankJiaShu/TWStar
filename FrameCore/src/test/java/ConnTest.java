import com.ljh.utils.GenerateNum;
import org.junit.runner.RunWith;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ljh.model.User;
import com.ljh.service.api.IUserService;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Created by ljh on 2017/11/12.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/ApplicationContext.xml"})
public class ConnTest {
    private static Logger logger = Logger.getLogger(ConnTest.class);
    @Resource
    private IUserService userService;
    @Resource
    private User user;
    @Resource
    private GenerateNum generateNum;

    @Test
    public void testSelect() {
        user.setUserId("2");
        user.setPassword("111");
        User userInfo = userService.selectUser(user);
         logger.info("用户名为:"+userInfo.getUserName());
        logger.info(JSON.toJSONString(userInfo));
    }
    @Test
    public void testInsert() {
        user.setUserName("frank");
        user.setPassword("123");
        String s = "UserController";
        String ss = s.split("C")[0]+"Seq";
        String userId = generateNum.getUserId("UserSeq");
        user.setUserId(userId);
        String msg = userService.insertUser(user);
        logger.info("返回结果:"+msg);
    }
    @Test
    public void testSequence() {
        String channelSeqNo = "2017042528";
        System.out.println(channelSeqNo.hashCode());
        BigDecimal hashCodeBig = new BigDecimal(channelSeqNo.hashCode()).abs();
        int routerKey = hashCodeBig.intValue();
        System.out.println(routerKey);
    }
}
