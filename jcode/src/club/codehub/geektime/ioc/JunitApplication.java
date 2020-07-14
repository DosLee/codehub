package club.codehub.geektime.ioc;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 启动类
 *
 * @author lil
 * @create 2020-07-14 下午11:12
 */
public class JunitApplication {
    private static final List<UserService> testCases = new ArrayList<>();

    public static void register(UserService userService) {
        testCases.add(userService);
    }

    public static void main(String[] args) {
        for (UserService service : testCases) {
            service.doProcess();
        }
    }
}
