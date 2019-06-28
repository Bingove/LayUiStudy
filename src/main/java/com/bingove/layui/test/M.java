package com.bingove.layui.test;

/**
 * @projectName LayUiStudy
 * @Author 常冬军
 * @Date 2019/6/25 0025下午 15:02
 * @title: M
 * @ToDo
 */
public class M {
    /*  "noticeUid": "20190613152809myWIQ0ct1",  通知uid 必填
	"stationCode": "4101000005",                           分站编码 必填
	"stationName": "04-郑州市中心医院",              分站名称  必填
    "jobNum": "11111", */
    private String noticeUid;
    private String stationCode;
    private String stationName;
    private String jobNum;

    public M() {
    }

    public M(String noticeUid, String stationCode, String stationName, String jobNum) {
        this.noticeUid = noticeUid;
        this.stationCode = stationCode;
        this.stationName = stationName;
        this.jobNum = jobNum;
    }

    public String getNoticeUid() {
        return noticeUid;
    }

    public void setNoticeUid(String noticeUid) {
        this.noticeUid = noticeUid;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }
}
