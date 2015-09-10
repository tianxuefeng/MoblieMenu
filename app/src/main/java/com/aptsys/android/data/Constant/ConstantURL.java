package com.aptsys.android.data.Constant;

public class ConstantURL {

    /**
     * 服务器路径
     */
    public static final String URL_SERVER = "http://gemscms.aptsys.com.sg/";
    // /srvs/categorysrv.asmx/getCategoryList?LanguageCode=en&ParentID=0

    /**
     * ftp服务器路径
     **/
    public static final String FTP_SERVER = "k3.namepu.com";
    /**
     * ftp 账号
     **/
    public static final String FTP_NAME = "xuefengjushi";
    /**
     * ftp 密码
     **/
    public static final String FTP_PAWD = "66C362D7724a13";

    /**
     * ftp 图片目录
     **/
    public static final String FTP_DIR = "web/userImages";

    /**
     * 通过传入img资源名称，在资源路径获取对应的图片
     *
     * @param imgName
     * @return
     */
    public static String getUploadImageUrl(String imgName) {
        return URL_SERVER + "userImages/" + imgName;
    }

    public static String getUploadSmallImageUrl(String imgName) {
        String fileName = imgName.substring(0, imgName.lastIndexOf("."));
        fileName += "_thumbnail";
        String suffix = imgName.substring(imgName.lastIndexOf("."), imgName.length());
        return URL_SERVER + "userImages/" + fileName + suffix;
    }

    /**
     * 通过传入img资源名称，在资源路径获取对应的图片
     *
     * @param imgName
     * @return
     */
    public static String getImageUrl(String imgName) {
        return URL_SERVER + "images/" + imgName;
    }

}
