package com.bingove.layui.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 *
 * @author 崔兴伟
 * @date 2017/11/18.
 */
public class DateUtil {
    private static Logger logger = LoggerFactory.getLogger(DateUtil.class);


    private final static SimpleDateFormat sdfYear = new SimpleDateFormat("yyyy");
    private final static SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy-MM-dd");
    private final static SimpleDateFormat sdfDays = new SimpleDateFormat("yyyyMMdd");
    private final static SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private final static SimpleDateFormat sdfTimes = new SimpleDateFormat("yyyyMMddHHmmss");
    private final static SimpleDateFormat sdfTimeSSS = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    private final static SimpleDateFormat sdfTimeSSS1 = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    /**
     * 获取yyyyMMddHHmmssSSS格式  精确到毫秒
     * @return
     */
    public static String getSdfTimesSSS(){
        return sdfTimeSSS1.format(new Date());
    }
    /**
     * 获取yyyyMMddHHmmss格式
     * @return
     */
    public static String getSdfTimes() {
        return sdfTimes.format(new Date());
    }

    /**
     * 获取YYYY格式
     * @return
     */
    public static String getYear() {
        return sdfYear.format(new Date());
    }

    /**
     * 获取YYYY-MM-DD格式
     * @return
     */
    public static String getDay() {
        return sdfDay.format(new Date());
    }

    /**
     * 获取YYYYMMDD格式
     * @return
     */
    public static String getDays(){
        return sdfDays.format(new Date());
    }

    /**
     * 获取YYYY-MM-DD HH:mm:ss格式
     * @return
     */
    public static String getTime() {
        return sdfTime.format(new Date());
    }
    /**
     * 获取YYYY-MM-DD HH:mm:ss SSS格式
     * @return
     */
    public static String getTimeSSS() {
        return sdfTimeSSS.format(new Date());
    }



    /**
     * 获取系统当前日期
     * 并格式化成指定格式
     *
     * @param format
     * @return
     */
    public static String getCurrentDateFormat(String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(new Date());
    }

    /**
     * 把指定格式日期字符串转为日期
     *
     * @param dataStr
     * @param format
     * @return
     */
    public static Date strToDate(String dataStr, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = simpleDateFormat.parse(dataStr);
        } catch (ParseException e) {
            logger.error("字符串转为日期出错:" + e.getMessage());
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 根据值班日期和班次返回
     * <p>
     * 值班时间 开始时间和结束时间
     *
     * @param realDate 值班日期
     * @param shift    班次
     * @return
     */

    /**
     * 获取当前时间的值班日期
     *
     * @return
     */


    /**
     * 获取日期格式化指定格式字符串
     *
     * @param date
     * @param format
     * @return
     */
    public static String getDateFormat(Date date, String format) {
        SimpleDateFormat dateFormater = new SimpleDateFormat(format);
        return dateFormater.format(date);
    }

    /**
     * 获取两个日期之间的毫秒差
     *
     * @param date1
     * @param date2
     * @return
     */
    public static long getTwoDateDistance(Date date1, Date date2) {
        if (date1 == null || date2 == null) {
            return 0;
        }
        return Math.abs(date1.getTime() - date2.getTime());
    }

    /**
     * 获取指定时间与当前时间的差距
     *
     * @param date
     * @return
     */
    public static long getDateDistance(Date date) {
        return getTwoDateDistance(date, new Date());
    }

    /**
     * 获取指定时间与当前时间的秒差
     *
     * @param date
     * @return
     */
    public static int getDateSecondDistance(Date date) {
        return (int) (getTwoDateDistance(date, new Date()) / 1000);
    }

    /**
     * 获取指定时间与当前时间的分差
     *
     * @param date
     * @return
     */
    public static int getDateMinutesDistance(Date date) {
        return (int) (getTwoDateDistance(date, new Date()) / 1000 / 60);
    }

    /**
     * 获取两个日期之间的天数
     *
     * @param start
     * @param end
     * @return
     */
    public static int getDateDayDistance(Date start, Date end) {
        if (end.before(start)) {
            return 0;
        }
        return (int) (getTwoDateDistance(start, end) / (24 * 3600 * 1000));
    }

    /**
     * 判断当前时间为白班还是夜班
     * 大于等于8点小于等于20点为白班
     *
     * @return
     */


    /**
     * 两时间的时间差
     * */
    public static String timeDifference(Date startDate,Date endDate){
        try {

            long diff = endDate.getTime() - startDate.getTime();//这样得到的差值是微秒级别
			/*long days = diff / (1000 * 60 * 60 * 24);
			long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);
			long minutes = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60))/(1000* 60);
			long second = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60)-minutes*(1000*60))/(1000* 60);*/
            long second=diff/(1000); //共计秒数
            int minutes = (int)second/60;   //共计分钟数
            int hours=(int)second/3600;  //共计小时数
            int days=(int)hours/24;   //共计天数
            System.out.println(""+days+"天"+hours+"小时"+minutes+"分"+second+"秒");
            String returnTimeDifference = hours +"小时"+minutes+"分"+second+"秒";
            return returnTimeDifference;
        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    /**
     * 两时间的时间差
     * */
    public static String timeDifference(String startDate,String endDate){
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date startDateParse = format.parse(startDate);
            Date endDateParse = format.parse(endDate);
            long diff = endDateParse.getTime() - startDateParse.getTime();//这样得到的差值是微秒级别
			/*long days = diff / (1000 * 60 * 60 * 24);
			long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);
			long minutes = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60))/(1000* 60);
			long second = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60)-minutes*(1000*60))/(1000* 60);*/
            long second=diff/(1000); //共计秒数
            int minutes = (int)second/60;   //共计分钟数
            int hours=(int)second/3600;  //共计小时数
            int days=(int)hours/24;   //共计天数
            System.out.println(""+days+"天"+hours+"小时"+minutes+"分"+second+"秒");
            String returnTimeDifference = hours +"小时"+minutes+"分"+second+"秒";
            return returnTimeDifference;
        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    /**
     * 两个时间相差距离多少天多少小时多少分多少秒
     * @param str1 时间参数 1 格式：1990-01-01 12:00:00
     * @param str2 时间参数 2 格式：2009-01-01 12:00:00
     * @return String 返回值为：xx天xx小时xx分xx秒
     */
    public static String getDistanceTime(String str1, String str2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date one;
        Date two;
        long day = 0;
        long hour = 0;
        long min = 0;
        long sec = 0;
        try {
            one = df.parse(str1);
            two = df.parse(str2);
            long time1 = one.getTime();
            long time2 = two.getTime();
            long diff ;
            if(time1<time2) {
                diff = time2 - time1;
            } else {
                diff = time1 - time2;
            }
            day = diff / (24 * 60 * 60 * 1000);
            hour = (diff / (60 * 60 * 1000) - day * 24);
            min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);
            sec = (diff/1000-day*24*60*60-hour*60*60-min*60);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return day + "天" + hour + "小时" + min + "分" + sec + "秒";
    }


    /*
    * 格式化某日期
    * */
    public static String getTTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }


}
