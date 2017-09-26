package hibernatetest.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * dao层基类，实现增，删，改，查等常用功能。
 * 
 * @author Xiongyan
 * @date 2015年5月6日 下午5:24:08
 * @version 0.0.1
 * @param <T>
 */
@Repository
public class BaseDao<T> {
    @Resource
    private SessionFactory sessionFactory;

    /**
     * 保存数据
     * 
     * @author Xiongyan
     * @date 2015年5月6日 下午5:24:54
     * @throws
     * @return void 返回类型
     */
    public void save(T t) {
        sessionFactory.getCurrentSession().save(t);
    }

    /**
     * 删除数据
     * 
     * @author Xiongyan
     * @date 2015年5月6日 下午5:26:41
     * @throws
     * @return void 返回类型
     */
    public void delete(Serializable id, Class<T> clazz) {
        T t = get(id, clazz);
        if (t != null)
            sessionFactory.getCurrentSession().delete(t);
        else
            new RuntimeException("你要删除的数据不存在").printStackTrace();
        ;
    }

    /**
     * 更新数据
     * 
     * @author Xiongyan
     * @date 2015年5月6日 下午5:29:13
     * @throws
     * @return void 返回类型
     */
    public void update(T t) {
        sessionFactory.getCurrentSession().update(t);
    }

    /**
     * 根据ID查找数据
     * 
     * @author Xiongyan
     * @date 2015年5月6日 下午5:29:46
     * @throws
     * @return T 返回类型
     */
    @SuppressWarnings("unchecked")
    public T get(Serializable id, Class<T> clazz) {
        return (T) sessionFactory.getCurrentSession().get(clazz, id);
    }

    /**
     * 查找所有数据
     * 
     * @author Xiongyan
     * @date 2015年5月6日 下午5:30:16
     * @throws
     * @return List<T> 返回类型
     */
    @SuppressWarnings("unchecked")
    public List<T> getAll(Class<T> clazz) {
        return sessionFactory.getCurrentSession().createQuery(clazz.toString()).list();
    }
}