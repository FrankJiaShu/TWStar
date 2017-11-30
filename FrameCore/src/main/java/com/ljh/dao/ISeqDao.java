package com.ljh.dao;

import com.ljh.model.Sequence;
import org.springframework.stereotype.Repository;

/**
 * Created by ljh on 2017/11/24.
 */
@Repository
public interface ISeqDao {
    /*后期如需改造保留*/
    void updateSelectiveSeq(Sequence sequence);

    Integer selectSeq (Sequence sequence) throws Exception;
}
