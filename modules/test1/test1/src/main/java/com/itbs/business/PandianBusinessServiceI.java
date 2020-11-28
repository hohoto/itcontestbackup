package com.itbs.business;

import com.itbs.persistence.entity.TCenterPandian;
import com.itbs.persistence.entity.TCenterPandianDetail;

/**
 * Created by shaoxuhang on 20/11/29.
 */
public interface PandianBusinessServiceI {
    boolean insertPandian(TCenterPandian tCenterPandian) throws Exception;
    boolean pandian(TCenterPandianDetail tCenterPandianDetail) throws Exception;
}
