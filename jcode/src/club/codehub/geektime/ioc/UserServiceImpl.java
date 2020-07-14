package club.codehub.geektime.ioc;

/**
 * 描述:
 * 实现框架
 *
 * @author lil
 * @create 2020-07-14 下午11:19
 */
public class UserServiceImpl extends UserService{

    @Override
    public boolean doProcess() {
        // to do something
        return true;
    }

    // 注册操作还可以通过配置的方式来实现，不需要程序员显示调用register()
    public void init() {
        JunitApplication.register(new UserServiceImpl());
    }
}
