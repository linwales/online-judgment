package com.yupi.muboj.service;

import com.yupi.muboj.model.entity.PostThumb;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.muboj.model.entity.User;

/**
 * 帖子点赞服务
 *
 * @author <a href="https://github.com/linwales/online-judgment">慕沐白</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostThumbInner(long userId, long postId);
}
