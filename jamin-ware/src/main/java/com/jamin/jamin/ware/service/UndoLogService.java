package com.jamin.jamin.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jamin.jamin.common.utils.PageUtils;
import com.jamin.jamin.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author chanjamin
 * @email jamin7597@163.com
 * @date 2022-09-10 14:29:07
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

