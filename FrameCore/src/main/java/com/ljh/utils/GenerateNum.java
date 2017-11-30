package com.ljh.utils;

import com.ljh.dao.ISeqDao;
import com.ljh.model.Sequence;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Calendar;

/**
 * Created by ljh on 2017/11/24.
 * sequence账号生成器组件
 */
@Component
public class GenerateNum {
    private static Logger logger = Logger.getLogger(GenerateNum.class);
    @Resource
    private Sequence sequence;
    @Resource
    private ISeqDao iSeqDao;

    public String getUserId(String seqName) {
        sequence.setSeqName(seqName);
        Integer currentValue = null;
        String currentString = null;
        try {
            currentValue = iSeqDao.selectSeq(sequence);
        } catch (Exception e) {
            logger.error("获取序列号错误！");
            logger.error(e);
        }
        logger.info("序列值为:"+currentValue);
        //四位年份数字+三位随机数+sequence序列生成账号
        if (currentValue < 10 && !currentValue.equals(null)) {
            currentString = "00"+currentValue;
        } else if (currentValue > 10 && currentValue < 100 && !currentValue.equals(null)) {
            currentString = "0"+currentValue;
        }
        StringBuffer randomAllNum = new StringBuffer();
        for (int i = 0; i < 3; i++) {
            int randomNum = (int)Math.abs(Math.random()*10);
            randomAllNum.append(randomNum);
        }
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        String userId = year + currentString + randomAllNum;
        return userId;
    }
}
