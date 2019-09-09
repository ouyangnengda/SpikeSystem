package cn.ouyangnengda.spikesystem.Util;

import java.security.MessageDigest;

/**
 * @Description:
 * @Author: 欧阳能达
 * @Created: 2019年09月09日 14:48:00
 **/
public class MD5Util {

    public static String string2MD5(String inStr){
        MessageDigest md5 = null;
        try{
            //1 创建一个提供信息摘要算法的对象，初始化为md5算法对象
            md5 = MessageDigest.getInstance("MD5");
        }catch (Exception e){
            return "";
        }
        //2 将消息变成byte数组
        byte[] input = inStr.getBytes();

        //3 计算后获得字节数组,这就是那128位了
        byte[] md5Bytes = md5.digest(input);

        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++){
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16){
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
}
