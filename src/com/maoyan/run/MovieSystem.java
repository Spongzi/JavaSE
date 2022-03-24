package com.maoyan.run;

import com.maoyan.bean.Business;
import com.maoyan.bean.Customer;
import com.maoyan.bean.Movie;
import com.maoyan.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MovieSystem {
    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");
    /**
     * 定义系统的数据容器用户存储数据
     * 1. 存储很多用户(客户对象，商家对象)
     */
    public static final List<User> ALL_USERS = new ArrayList<>();

    /**
     * 2. 存储系统全部商家和拍片信息
     * 商家1 = [....]
     * 商家2 = [....]
     */
    public static Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    /*
     * 3. 准备一些测试数据
     */
    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassword("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassword("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassword("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b, movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassword("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies3 = new ArrayList<>();
        ALL_MOVIES.put(b2, movies3); // b2 = []
    }

    /**
     * 定义一个扫描器
     */
    public static final Scanner SYS_SC = new Scanner(System.in);

    /**
     * 定义一个登录用户 --> 登录成功
     */
    public static User loginUser;

    /**
     * 定义一个时间格式化工具
     */
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        showMain();
    }

    // 展示主页
    private static void showMain() {
        while (true) {
            System.out.println("==========猫眼电影首页==========");
            System.out.println("1. 登录");
            System.out.println("2. 用户注册");
            System.out.println("3. 商家注册");
            System.out.println("请输入操作命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 登录
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("命令有误，请确认");
            }
        }
    }

    // 登录功能
    private static void login() {
        System.out.println("请输入登录名称：");
        String loginName = SYS_SC.nextLine();
        System.out.println("请输入登录密码：");
        String password = SYS_SC.nextLine();

        // 1. 根据登录名查询用户
        User u = getUserByLoginName(loginName);

        // 2. 判断用户是否存在
        if (u != null) {
            // 3. 比对密码是否正确
            if (u.getPassword().equals(password)) {
                // 登录成功了
                loginUser = u;
                LOGGER.info("登录成功");
                // 判断是用户还是商家
                if (u instanceof Customer) {
                    // 是普通用户
                    showCustomerMain();
                } else {
                    // 是商家用户
                    showBusinessMain();
                }
                return;
            } else {
                LOGGER.error("密码错误！！！");
                System.out.println("密码错误~~~");
            }
        } else {
            LOGGER.error("登录用户名错误");
            System.out.println("登录用户名错误，请确认");
        }

    }

    /**
     *
     */
    private static void showBusinessMain() {
        while (true) {
            System.out.println("============黑马电影商家界面===================");
            LOGGER.info(loginUser.getUserName() + "商家正在看自己的详情页");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "欢迎您进入系统"));
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 展示全部排片信息
                    showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    break;
                case "4":
                    // 修改电影信息
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() + "请您下次再来啊~~~");
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 商家进行电影上映
     */
    private static void addMovie() {
        Business business = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(business);

        System.out.println("请您输入新片名：");
        String name  = SYS_SC.nextLine();
        System.out.println("请您输入主演：");
        String actor  = SYS_SC.nextLine();
        System.out.println("请您输入时长：");
        String time  = SYS_SC.nextLine();
        System.out.println("请您输入票价：");
        String price  = SYS_SC.nextLine();
        System.out.println("请您输入票数：");
        String totalNumber  = SYS_SC.nextLine(); // 200\n
        while (true) {
            try {
                System.out.println("请您输入影片放映时间：");
                String stime = SYS_SC.nextLine();
                // public Movie(String name, String actor, double time, double price, int number, Date startTime)        // 封装成电影对象 ，加入集合movices中去
                Movie movie = new Movie(name, actor, Double.parseDouble(time), Double.parseDouble(price),
                        Integer.parseInt(totalNumber), sdf.parse(stime));
                movies.add(movie);
                System.out.println("您已经成功上架了：《" + movie.getName() + "》");
                return; // 直接退出去
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析出了毛病");
            }
        }
    }

    /**
     * 展示商家的详细信息(当前商家)
     */
    private static void showBusinessInfos() {
        // 根据商家对象，作为Map集合的键，提取对应的值就是其拍片的信息
        Business business = (Business) loginUser;
        System.out.println(business.getShopName() + "\t\t电话:" + business.getPhone() + "\t\t地址:" + business.getAddress());
        List<Movie> movies = ALL_MOVIES.get(business);
        if (movies.size() > 0) {
            System.out.println("片名 \t\t 主演 \t\t 时长 \t\t 评分\t\t 票价 \t\t 余票数量 \t\t 放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t" + movie.getActor() + "\t\t" + movie.getTime() + "\t\t"
                        + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t\t" + movie.getNumber() + "\t\t"
                        + sdf.format(movie.getStartTime()));
            }
        } else {
            System.out.println("当前该影院没有电影上映！！！");
        }

    }

    /**
     * 客户操作界面
     */
    private static void showCustomerMain() {
        while (true) {
            System.out.println("============猫眼电影客户界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士" + "欢迎您进入系统" + "\t余额：" + loginUser.getMoney()));
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 展示全部排片信息
                    break;
                case "2":
                    break;
                case "3":
                    // 评分功能
                    break;
                case "4":
                    // 购票功能
                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    /**
     * 检查用户是否存在
     * @param loginName 登录用户名
     * @return 返回查询的结果！
     */
    public static User getUserByLoginName(String loginName) {
        for (User user : ALL_USERS) {
            // 判断这个用户的登录名是否是我们想要的
            if (user.getLoginName().equals(loginName)) {
                return user;
            }
        }
        return null; // 没有找到用户
    }
}
