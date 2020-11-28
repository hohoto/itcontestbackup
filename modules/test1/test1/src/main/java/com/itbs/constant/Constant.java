package com.itbs.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by shaoxuhang on 20/11/28.
 */
public class Constant {

    /**
     * 资源状态
     */
    @Getter
    @AllArgsConstructor
    public enum ResourceStatus {
        XZ("闲置",10),
        ZY("占用",20),
        SYZ("使用中",30),
        WX("维修",40),
        BF("报废",50);
        private String name;
        private Integer value;
    }

    /**
     * 单据状态
     */
    @Getter
    @AllArgsConstructor
    public enum ApplyStatus {
        DSP("待审批",1),
        YES("同意",2),
        NO("不同意",3);
        private String name;
        private Integer value;
    }


    /**
     * 单据类型
     */
    @Getter
    @AllArgsConstructor
    public enum ApplyType {
        JY("借用",31),
        SY("使用",32),
        GH("归还",61),
        ZY("转移",41),
        TZ("投资",51),
        CS("出售",52),
        DZ("抵债",53),
        DQ("丢弃",54),
        BF("报废",55);
        private String name;
        private Integer value;
    }



}
