package com.aptsys.android.data.Constant;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Constant {

    public static final String RestaurantID = "28";
    public static final String SapphireID = "13";
    public static final String ProductId = "1";

    /**
     * 配置文件路径
     **/
    public static final String SETTINGSP = "com.aptsys.android.city_preferences";

    /**
     * 设置照片的最大像素为200W像素，照片过大容易出现内存溢出
     **/
    public static final int PhotoMaxSize = 2000000;
    /**
     * 当前屏幕大小
     **/
    public static final int[] ScreenSize = new int[2];

    /**
     * 抓取网页信息时，设置头标识
     */
    public static final Map<String, String> heads = new HashMap<String, String>();
    public static boolean IsNetStatus = false;
    /**
     * 语言参数，用于获取信息
     **/
    public static String LANGUAGE_PARAMETER = "zh-CN";
    /**
     * 缓存存放目录
     **/
    public static String CACHE_PATH = "cache";

    static {
        heads.put("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US)");
    }

    /**
     * 获得当前版本号
     *
     * @param context
     * @return
     * @throws Exception
     */
    public static String getVersionName(Context context) throws Exception {
        // 获取packagemanager的实例
        PackageManager packageManager = context.getPackageManager();
        // getPackageName()是你当前类的包名，0代表是获取版本信息
        PackageInfo packInfo = packageManager.getPackageInfo(
                context.getPackageName(), 0);
        String version = packInfo.versionName;
        return version;
    }

    /**
     * 格式化double数据
     *
     * @param value
     * @return
     */
    public static String formatFloatNumber(double value) {
        if (value != 0.00) {
            java.text.DecimalFormat df = new java.text.DecimalFormat("############.00");
            return df.format(value);
        } else {
            return "0.00";
        }
    }

    /**
     * 验证邮箱格式是否正确
     *
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        String str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(email);

        return m.matches();
    }

    /**
     * json数据，listinfo的Key
     *
     * @author Administrator
     */
    public final class JsonItemsKeys {
        /**
         * ID标识【int】
         **/
        public static final String ID = "ID";
        /**
         * 标题【String】
         **/
        public static final String Title = "Title";
        /**
         * 说明 【String】
         **/
        public static final String Description = "Description";
        /**
         * 价格【double】
         **/
        public static final String Price = "Price";
        /**
         * 图片集【String】
         **/
        public static final String Images = "Images";
        /**
         * 联系方式【String】
         **/
        public static final String Phone = "Phone";
        /**
         * QQ联系方式【String】
         **/
        public static final String QQ_Skype = "QQSkype";
        /**
         * 国家标识【int】
         **/
        public static final String CountryCode = "CountryCode";
        /**
         * 城市【String】
         **/
        public static final String City = "City";
        /**
         * 区域【String】
         **/
        public static final String Region = "Region";
        /**
         * 类别【int】
         **/
        public static final String CategoryID = "CategoryID";
        /**
         * 置顶级别【int】
         **/
        public static final String Rank = "Rank";
        /**
         * 顺序【int】
         **/
        public static final String Sequence = "Sequence";
        /**
         * 发布用户ID【int】
         **/
        public static final String UserID = "UserID";
        /**
         * 创建日期【String】
         **/
        public static final String CreateDate = "CreateDate";
        /**
         * 修改日期【String】
         **/
        public static final String UpdateDate = "UpdateDate";
    }

}