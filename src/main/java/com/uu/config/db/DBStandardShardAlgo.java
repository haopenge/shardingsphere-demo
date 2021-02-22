package com.uu.config.db;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * @desc  按季节 【0,1,2,3】
 * @author liuph
 * @date 2021/02/22 16:01
 */
public class DBStandardShardAlgo implements PreciseShardingAlgorithm<LocalDateTime> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<LocalDateTime> preciseShardingValue) {
        String logicTable = "active_user";

        LocalDateTime value = preciseShardingValue.getValue();
        int monthValue = value.getMonthValue();

        return logicTable + monthValue/4;
    }
}
