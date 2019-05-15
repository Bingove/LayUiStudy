package com.bingove.layui.model.master;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "`ecg`")
public class Ecg {
    /**
     * 心电图ID
     */
    @Column(name = "`ecgId`")
    private String ecgid;

    /**
     * 设备唯一标识
     */
    @Column(name = "`deviceId`")
    private String deviceid;

    /**
     * 事件编码
     */
    @Column(name = "`eventCode`")
    private String eventcode;

    /**
     * 任务编码
     */
    @Column(name = "`taskCode`")
    private String taskcode;

    /**
     * 患者姓名
     */
    @Column(name = "`patientName`")
    private String patientname;

    /**
     * 年龄
     */
    @Column(name = "`patientAge`")
    private String patientage;

    /**
     * 性别
     */
    @Column(name = "`patientSex`")
    private String patientsex;

    /**
     * 病人类型（CPC:胸痛；CSC：卒中；SFGH：创伤；others:其他）
     */
    @Column(name = "`patientType`")
    private String patienttype;

    /**
     * 申请科室
     */
    @Column(name = "`checkDepartment`")
    private String checkdepartment;

    /**
     * 病区
     */
    @Column(name = "`inpatientWard`")
    private String inpatientward;

    /**
     * 床号
     */
    @Column(name = "`bedNum`")
    private Integer bednum;

    /**
     * 检查医生的姓名
     */
    @Column(name = "`checkDoctorName`")
    private String checkdoctorname;

    /**
     * 检查医生
     */
    @Column(name = "`checkDoctor`")
    private String checkdoctor;

    /**
     * 心率
     */
    @Column(name = "`heartRate`")
    private String heartrate;

    /**
     * QRS时限
     */
    @Column(name = "`QRSDuration`")
    private String qrsduration;

    /**
     * QRS电轴
     */
    @Column(name = "`QRS_AXIS`")
    private String qrsAxis;

    /**
     * QT
     */
    @Column(name = "`QT`")
    private String qt;

    /**
     * QTc
     */
    @Column(name = "`QTc`")
    private String qtc;

    @Column(name = "`P_waveDuration`")
    private String pWaveduration;

    /**
     * 脉率
     */
    @Column(name = "`PR`")
    private String pr;

    @Column(name = "`P_AXIS`")
    private String pAxis;

    @Column(name = "`RV1`")
    private Float rv1;

    /**
     * Rv5
     */
    @Column(name = "`Rv5`")
    private String rv5;

    @Column(name = "`RV6`")
    private Float rv6;

    /**
     * Sv1
     */
    @Column(name = "`Sv1`")
    private String sv1;

    @Column(name = "`SV2`")
    private Float sv2;

    @Column(name = "`SV5`")
    private Float sv5;

    @Column(name = "`Rv5_Sv1`")
    private Float rv5Sv1;

    /**
     * T波
     */
    @Column(name = "`T_wave`")
    private String tWave;

    @Column(name = "`T_AXIS`")
    private String tAxis;

    @Column(name = "`P_RInterval`")
    private String pRinterval;

    /**
     * 心室率
     */
    @Column(name = "`ventricularRate`")
    private Integer ventricularrate;

    /**
     * 心房率
     */
    @Column(name = "`atrialRate`")
    private Integer atrialrate;

    /**
     * 发送胸痛中心时间
     */
    @Column(name = "`sendTime`")
    private Date sendtime;

    /**
     * 创建时间
     */
    @Column(name = "`createTime`")
    private Date createtime;

    @Column(name = "`patientBirthTime`")
    private String patientbirthtime;

    @Column(name = "`deviceEcgId`")
    private String deviceecgid;

    @Column(name = "`patientId`")
    private String patientid;

    /**
     * 心电图状态（undiagnosed未诊断，diagnosed已诊断）
     */
    @Column(name = "`ecgStatus`")
    private String ecgstatus;

    /**
     * 检查的时间
     */
    @Column(name = "`measureTime`")
    private Date measuretime;

    /**
     * PC端给的诊断结果
     */
    @Column(name = "`diagnoseResult`")
    private String diagnoseresult;

    /**
     * 诊断医生姓名
     */
    @Column(name = "`diagnoseDoctorName`")
    private String diagnosedoctorname;

    @Column(name = "`diagnoseDoctorId`")
    private String diagnosedoctorid;

    /**
     * 诊断结果编码
     */
    @Column(name = "`diagnoseCode`")
    private Integer diagnosecode;

    /**
     * 报告日期
     */
    @Column(name = "`reportDate`")
    private Date reportdate;

    /**
     * 心电图来源医院ID
     */
    @Column(name = "`fromStationId`")
    private String fromstationid;

    /**
     * 发送医院ID
     */
    @Column(name = "`toStationId`")
    private String tostationid;

    /**
     * 是否发送（sent：已发送，unsent:未发送，cancel：已取消，recall：撤回）
     */
    @Column(name = "`sendStatus`")
    private String sendstatus;

    /**
     * 操作人员ID
     */
    @Column(name = "`sendUser`")
    private String senduser;

    /**
     * 转诊标识
     */
    @Column(name = "`transferFlag`")
    private Integer transferflag;

    /**
     * APP专家的ID
     */
    @Column(name = "`mobileExpertId`")
    private String mobileexpertid;

    /**
     * APP端专家的姓名
     */
    @Column(name = "`mobileExpertName`")
    private String mobileexpertname;

    @Column(name = "`suggestTime`")
    private Date suggesttime;

    /**
     * 指导状态（suggested,unsuggested）
     */
    @Column(name = "`suggestStatus`")
    private String suggeststatus;

    /**
     * 心电图聊天群组ID
     */
    @Column(name = "`groupId`")
    private String groupid;

    /**
     * 来源设备
     */
    @Column(name = "`fromDevice`")
    private String fromdevice;

    /**
     * 采样率
     */
    @Column(name = "`samplingRate`")
    private Integer samplingrate;

    /**
     * 导联类型
     */
    @Column(name = "`ecgType`")
    private Integer ecgtype;

    /**
     * 采样数据到实际电压的换算值
     */
    @Column(name = "`uVpb`")
    private String uvpb;

    /**
     * 压缩模式
     */
    @Column(name = "`compressionMode`")
    private Integer compressionmode;

    /**
     * 导联名字
     */
    @Column(name = "`leadNameList`")
    private String leadnamelist;

    /**
     * 导联数量
     */
    @Column(name = "`leadNum`")
    private Integer leadnum;

    /**
     * 来源设备名称
     */
    @Column(name = "`fromDeviceName`")
    private String fromdevicename;

    /**
     * 心电图的参数
     */
    @Column(name = "`QRS_TopPoints`")
    private String qrsToppoints;

    /**
     * 自动诊断结果
     */
    @Column(name = "`autoDiagnoseResult`")
    private String autodiagnoseresult;

    /**
     * 自动诊断描述
     */
    @Column(name = "`autoDiagnoseDescription`")
    private String autodiagnosedescription;

    /**
     * 病人年龄的单位
     */
    @Column(name = "`patientAgeUnit`")
    private String patientageunit;

    @Column(name = "`QTcH`")
    private String qtch;

    /**
     * 发送医院
     */
    @Column(name = "`sendStation`")
    private String sendstation;

    @Column(name = "`diagnoseDoctorJobNum`")
    private String diagnosedoctorjobnum;

    @Column(name = "`Q_TInterval`")
    private String qTinterval;

    @Column(name = "`diagnoseDescription`")
    private String diagnosedescription;

    @Column(name = "`DPTcode`")
    private String dptcode;

    /**
     * 放大系数
     */
    @Column(name = "`scale`")
    private String scale;

    @Column(name = "`electricAxis`")
    private String electricaxis;

    /**
     * 心电数据
     */
    @Column(name = "`waveData`")
    private String wavedata;

    @Column(name = "`xmlContent`")
    private String xmlcontent;

    /**
     * PC端描述
     */
    @Column(name = "`description`")
    private String description;

    /**
     * APP给的指导意见
     */
    @Column(name = "`mobileSuggestion`")
    private String mobilesuggestion;

    /**
     * APP端给的描述
     */
    @Column(name = "`mobileDescription`")
    private String mobiledescription;

    /**
     * 诊断报告(废弃)
     */
    @Column(name = "`diagnosticReport`")
    private String diagnosticreport;

    /**
     * 获取心电图ID
     *
     * @return ecgId - 心电图ID
     */
    public String getEcgid() {
        return ecgid;
    }

    /**
     * 设置心电图ID
     *
     * @param ecgid 心电图ID
     */
    public void setEcgid(String ecgid) {
        this.ecgid = ecgid == null ? null : ecgid.trim();
    }

    /**
     * 获取设备唯一标识
     *
     * @return deviceId - 设备唯一标识
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * 设置设备唯一标识
     *
     * @param deviceid 设备唯一标识
     */
    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    /**
     * 获取事件编码
     *
     * @return eventCode - 事件编码
     */
    public String getEventcode() {
        return eventcode;
    }

    /**
     * 设置事件编码
     *
     * @param eventcode 事件编码
     */
    public void setEventcode(String eventcode) {
        this.eventcode = eventcode == null ? null : eventcode.trim();
    }

    /**
     * 获取任务编码
     *
     * @return taskCode - 任务编码
     */
    public String getTaskcode() {
        return taskcode;
    }

    /**
     * 设置任务编码
     *
     * @param taskcode 任务编码
     */
    public void setTaskcode(String taskcode) {
        this.taskcode = taskcode == null ? null : taskcode.trim();
    }

    /**
     * 获取患者姓名
     *
     * @return patientName - 患者姓名
     */
    public String getPatientname() {
        return patientname;
    }

    /**
     * 设置患者姓名
     *
     * @param patientname 患者姓名
     */
    public void setPatientname(String patientname) {
        this.patientname = patientname == null ? null : patientname.trim();
    }

    /**
     * 获取年龄
     *
     * @return patientAge - 年龄
     */
    public String getPatientage() {
        return patientage;
    }

    /**
     * 设置年龄
     *
     * @param patientage 年龄
     */
    public void setPatientage(String patientage) {
        this.patientage = patientage == null ? null : patientage.trim();
    }

    /**
     * 获取性别
     *
     * @return patientSex - 性别
     */
    public String getPatientsex() {
        return patientsex;
    }

    /**
     * 设置性别
     *
     * @param patientsex 性别
     */
    public void setPatientsex(String patientsex) {
        this.patientsex = patientsex == null ? null : patientsex.trim();
    }

    /**
     * 获取病人类型（CPC:胸痛；CSC：卒中；SFGH：创伤；others:其他）
     *
     * @return patientType - 病人类型（CPC:胸痛；CSC：卒中；SFGH：创伤；others:其他）
     */
    public String getPatienttype() {
        return patienttype;
    }

    /**
     * 设置病人类型（CPC:胸痛；CSC：卒中；SFGH：创伤；others:其他）
     *
     * @param patienttype 病人类型（CPC:胸痛；CSC：卒中；SFGH：创伤；others:其他）
     */
    public void setPatienttype(String patienttype) {
        this.patienttype = patienttype == null ? null : patienttype.trim();
    }

    /**
     * 获取申请科室
     *
     * @return checkDepartment - 申请科室
     */
    public String getCheckdepartment() {
        return checkdepartment;
    }

    /**
     * 设置申请科室
     *
     * @param checkdepartment 申请科室
     */
    public void setCheckdepartment(String checkdepartment) {
        this.checkdepartment = checkdepartment == null ? null : checkdepartment.trim();
    }

    /**
     * 获取病区
     *
     * @return inpatientWard - 病区
     */
    public String getInpatientward() {
        return inpatientward;
    }

    /**
     * 设置病区
     *
     * @param inpatientward 病区
     */
    public void setInpatientward(String inpatientward) {
        this.inpatientward = inpatientward == null ? null : inpatientward.trim();
    }

    /**
     * 获取床号
     *
     * @return bedNum - 床号
     */
    public Integer getBednum() {
        return bednum;
    }

    /**
     * 设置床号
     *
     * @param bednum 床号
     */
    public void setBednum(Integer bednum) {
        this.bednum = bednum;
    }

    /**
     * 获取检查医生的姓名
     *
     * @return checkDoctorName - 检查医生的姓名
     */
    public String getCheckdoctorname() {
        return checkdoctorname;
    }

    /**
     * 设置检查医生的姓名
     *
     * @param checkdoctorname 检查医生的姓名
     */
    public void setCheckdoctorname(String checkdoctorname) {
        this.checkdoctorname = checkdoctorname == null ? null : checkdoctorname.trim();
    }

    /**
     * 获取检查医生
     *
     * @return checkDoctor - 检查医生
     */
    public String getCheckdoctor() {
        return checkdoctor;
    }

    /**
     * 设置检查医生
     *
     * @param checkdoctor 检查医生
     */
    public void setCheckdoctor(String checkdoctor) {
        this.checkdoctor = checkdoctor == null ? null : checkdoctor.trim();
    }

    /**
     * 获取心率
     *
     * @return heartRate - 心率
     */
    public String getHeartrate() {
        return heartrate;
    }

    /**
     * 设置心率
     *
     * @param heartrate 心率
     */
    public void setHeartrate(String heartrate) {
        this.heartrate = heartrate == null ? null : heartrate.trim();
    }

    /**
     * 获取QRS时限
     *
     * @return QRSDuration - QRS时限
     */
    public String getQrsduration() {
        return qrsduration;
    }

    /**
     * 设置QRS时限
     *
     * @param qrsduration QRS时限
     */
    public void setQrsduration(String qrsduration) {
        this.qrsduration = qrsduration == null ? null : qrsduration.trim();
    }

    /**
     * 获取QRS电轴
     *
     * @return QRS_AXIS - QRS电轴
     */
    public String getQrsAxis() {
        return qrsAxis;
    }

    /**
     * 设置QRS电轴
     *
     * @param qrsAxis QRS电轴
     */
    public void setQrsAxis(String qrsAxis) {
        this.qrsAxis = qrsAxis == null ? null : qrsAxis.trim();
    }

    /**
     * 获取QT
     *
     * @return QT - QT
     */
    public String getQt() {
        return qt;
    }

    /**
     * 设置QT
     *
     * @param qt QT
     */
    public void setQt(String qt) {
        this.qt = qt == null ? null : qt.trim();
    }

    /**
     * 获取QTc
     *
     * @return QTc - QTc
     */
    public String getQtc() {
        return qtc;
    }

    /**
     * 设置QTc
     *
     * @param qtc QTc
     */
    public void setQtc(String qtc) {
        this.qtc = qtc == null ? null : qtc.trim();
    }

    /**
     * @return P_waveDuration
     */
    public String getpWaveduration() {
        return pWaveduration;
    }

    /**
     * @param pWaveduration
     */
    public void setpWaveduration(String pWaveduration) {
        this.pWaveduration = pWaveduration == null ? null : pWaveduration.trim();
    }

    /**
     * 获取脉率
     *
     * @return PR - 脉率
     */
    public String getPr() {
        return pr;
    }

    /**
     * 设置脉率
     *
     * @param pr 脉率
     */
    public void setPr(String pr) {
        this.pr = pr == null ? null : pr.trim();
    }

    /**
     * @return P_AXIS
     */
    public String getpAxis() {
        return pAxis;
    }

    /**
     * @param pAxis
     */
    public void setpAxis(String pAxis) {
        this.pAxis = pAxis == null ? null : pAxis.trim();
    }

    /**
     * @return RV1
     */
    public Float getRv1() {
        return rv1;
    }

    /**
     * @param rv1
     */
    public void setRv1(Float rv1) {
        this.rv1 = rv1;
    }

    /**
     * 获取Rv5
     *
     * @return Rv5 - Rv5
     */
    public String getRv5() {
        return rv5;
    }

    /**
     * 设置Rv5
     *
     * @param rv5 Rv5
     */
    public void setRv5(String rv5) {
        this.rv5 = rv5 == null ? null : rv5.trim();
    }

    /**
     * @return RV6
     */
    public Float getRv6() {
        return rv6;
    }

    /**
     * @param rv6
     */
    public void setRv6(Float rv6) {
        this.rv6 = rv6;
    }

    /**
     * 获取Sv1
     *
     * @return Sv1 - Sv1
     */
    public String getSv1() {
        return sv1;
    }

    /**
     * 设置Sv1
     *
     * @param sv1 Sv1
     */
    public void setSv1(String sv1) {
        this.sv1 = sv1 == null ? null : sv1.trim();
    }

    /**
     * @return SV2
     */
    public Float getSv2() {
        return sv2;
    }

    /**
     * @param sv2
     */
    public void setSv2(Float sv2) {
        this.sv2 = sv2;
    }

    /**
     * @return SV5
     */
    public Float getSv5() {
        return sv5;
    }

    /**
     * @param sv5
     */
    public void setSv5(Float sv5) {
        this.sv5 = sv5;
    }

    /**
     * @return Rv5_Sv1
     */
    public Float getRv5Sv1() {
        return rv5Sv1;
    }

    /**
     * @param rv5Sv1
     */
    public void setRv5Sv1(Float rv5Sv1) {
        this.rv5Sv1 = rv5Sv1;
    }

    /**
     * 获取T波
     *
     * @return T_wave - T波
     */
    public String gettWave() {
        return tWave;
    }

    /**
     * 设置T波
     *
     * @param tWave T波
     */
    public void settWave(String tWave) {
        this.tWave = tWave == null ? null : tWave.trim();
    }

    /**
     * @return T_AXIS
     */
    public String gettAxis() {
        return tAxis;
    }

    /**
     * @param tAxis
     */
    public void settAxis(String tAxis) {
        this.tAxis = tAxis == null ? null : tAxis.trim();
    }

    /**
     * @return P_RInterval
     */
    public String getpRinterval() {
        return pRinterval;
    }

    /**
     * @param pRinterval
     */
    public void setpRinterval(String pRinterval) {
        this.pRinterval = pRinterval == null ? null : pRinterval.trim();
    }

    /**
     * 获取心室率
     *
     * @return ventricularRate - 心室率
     */
    public Integer getVentricularrate() {
        return ventricularrate;
    }

    /**
     * 设置心室率
     *
     * @param ventricularrate 心室率
     */
    public void setVentricularrate(Integer ventricularrate) {
        this.ventricularrate = ventricularrate;
    }

    /**
     * 获取心房率
     *
     * @return atrialRate - 心房率
     */
    public Integer getAtrialrate() {
        return atrialrate;
    }

    /**
     * 设置心房率
     *
     * @param atrialrate 心房率
     */
    public void setAtrialrate(Integer atrialrate) {
        this.atrialrate = atrialrate;
    }

    /**
     * 获取发送胸痛中心时间
     *
     * @return sendTime - 发送胸痛中心时间
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * 设置发送胸痛中心时间
     *
     * @param sendtime 发送胸痛中心时间
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return patientBirthTime
     */
    public String getPatientbirthtime() {
        return patientbirthtime;
    }

    /**
     * @param patientbirthtime
     */
    public void setPatientbirthtime(String patientbirthtime) {
        this.patientbirthtime = patientbirthtime == null ? null : patientbirthtime.trim();
    }

    /**
     * @return deviceEcgId
     */
    public String getDeviceecgid() {
        return deviceecgid;
    }

    /**
     * @param deviceecgid
     */
    public void setDeviceecgid(String deviceecgid) {
        this.deviceecgid = deviceecgid == null ? null : deviceecgid.trim();
    }

    /**
     * @return patientId
     */
    public String getPatientid() {
        return patientid;
    }

    /**
     * @param patientid
     */
    public void setPatientid(String patientid) {
        this.patientid = patientid == null ? null : patientid.trim();
    }

    /**
     * 获取心电图状态（undiagnosed未诊断，diagnosed已诊断）
     *
     * @return ecgStatus - 心电图状态（undiagnosed未诊断，diagnosed已诊断）
     */
    public String getEcgstatus() {
        return ecgstatus;
    }

    /**
     * 设置心电图状态（undiagnosed未诊断，diagnosed已诊断）
     *
     * @param ecgstatus 心电图状态（undiagnosed未诊断，diagnosed已诊断）
     */
    public void setEcgstatus(String ecgstatus) {
        this.ecgstatus = ecgstatus == null ? null : ecgstatus.trim();
    }

    /**
     * 获取检查的时间
     *
     * @return measureTime - 检查的时间
     */
    public Date getMeasuretime() {
        return measuretime;
    }

    /**
     * 设置检查的时间
     *
     * @param measuretime 检查的时间
     */
    public void setMeasuretime(Date measuretime) {
        this.measuretime = measuretime;
    }

    /**
     * 获取PC端给的诊断结果
     *
     * @return diagnoseResult - PC端给的诊断结果
     */
    public String getDiagnoseresult() {
        return diagnoseresult;
    }

    /**
     * 设置PC端给的诊断结果
     *
     * @param diagnoseresult PC端给的诊断结果
     */
    public void setDiagnoseresult(String diagnoseresult) {
        this.diagnoseresult = diagnoseresult == null ? null : diagnoseresult.trim();
    }

    /**
     * 获取诊断医生姓名
     *
     * @return diagnoseDoctorName - 诊断医生姓名
     */
    public String getDiagnosedoctorname() {
        return diagnosedoctorname;
    }

    /**
     * 设置诊断医生姓名
     *
     * @param diagnosedoctorname 诊断医生姓名
     */
    public void setDiagnosedoctorname(String diagnosedoctorname) {
        this.diagnosedoctorname = diagnosedoctorname == null ? null : diagnosedoctorname.trim();
    }

    /**
     * @return diagnoseDoctorId
     */
    public String getDiagnosedoctorid() {
        return diagnosedoctorid;
    }

    /**
     * @param diagnosedoctorid
     */
    public void setDiagnosedoctorid(String diagnosedoctorid) {
        this.diagnosedoctorid = diagnosedoctorid == null ? null : diagnosedoctorid.trim();
    }

    /**
     * 获取诊断结果编码
     *
     * @return diagnoseCode - 诊断结果编码
     */
    public Integer getDiagnosecode() {
        return diagnosecode;
    }

    /**
     * 设置诊断结果编码
     *
     * @param diagnosecode 诊断结果编码
     */
    public void setDiagnosecode(Integer diagnosecode) {
        this.diagnosecode = diagnosecode;
    }

    /**
     * 获取报告日期
     *
     * @return reportDate - 报告日期
     */
    public Date getReportdate() {
        return reportdate;
    }

    /**
     * 设置报告日期
     *
     * @param reportdate 报告日期
     */
    public void setReportdate(Date reportdate) {
        this.reportdate = reportdate;
    }

    /**
     * 获取心电图来源医院ID
     *
     * @return fromStationId - 心电图来源医院ID
     */
    public String getFromstationid() {
        return fromstationid;
    }

    /**
     * 设置心电图来源医院ID
     *
     * @param fromstationid 心电图来源医院ID
     */
    public void setFromstationid(String fromstationid) {
        this.fromstationid = fromstationid == null ? null : fromstationid.trim();
    }

    /**
     * 获取发送医院ID
     *
     * @return toStationId - 发送医院ID
     */
    public String getTostationid() {
        return tostationid;
    }

    /**
     * 设置发送医院ID
     *
     * @param tostationid 发送医院ID
     */
    public void setTostationid(String tostationid) {
        this.tostationid = tostationid == null ? null : tostationid.trim();
    }

    /**
     * 获取是否发送（sent：已发送，unsent:未发送，cancel：已取消，recall：撤回）
     *
     * @return sendStatus - 是否发送（sent：已发送，unsent:未发送，cancel：已取消，recall：撤回）
     */
    public String getSendstatus() {
        return sendstatus;
    }

    /**
     * 设置是否发送（sent：已发送，unsent:未发送，cancel：已取消，recall：撤回）
     *
     * @param sendstatus 是否发送（sent：已发送，unsent:未发送，cancel：已取消，recall：撤回）
     */
    public void setSendstatus(String sendstatus) {
        this.sendstatus = sendstatus == null ? null : sendstatus.trim();
    }

    /**
     * 获取操作人员ID
     *
     * @return sendUser - 操作人员ID
     */
    public String getSenduser() {
        return senduser;
    }

    /**
     * 设置操作人员ID
     *
     * @param senduser 操作人员ID
     */
    public void setSenduser(String senduser) {
        this.senduser = senduser == null ? null : senduser.trim();
    }

    /**
     * 获取转诊标识
     *
     * @return transferFlag - 转诊标识
     */
    public Integer getTransferflag() {
        return transferflag;
    }

    /**
     * 设置转诊标识
     *
     * @param transferflag 转诊标识
     */
    public void setTransferflag(Integer transferflag) {
        this.transferflag = transferflag;
    }

    /**
     * 获取APP专家的ID
     *
     * @return mobileExpertId - APP专家的ID
     */
    public String getMobileexpertid() {
        return mobileexpertid;
    }

    /**
     * 设置APP专家的ID
     *
     * @param mobileexpertid APP专家的ID
     */
    public void setMobileexpertid(String mobileexpertid) {
        this.mobileexpertid = mobileexpertid == null ? null : mobileexpertid.trim();
    }

    /**
     * 获取APP端专家的姓名
     *
     * @return mobileExpertName - APP端专家的姓名
     */
    public String getMobileexpertname() {
        return mobileexpertname;
    }

    /**
     * 设置APP端专家的姓名
     *
     * @param mobileexpertname APP端专家的姓名
     */
    public void setMobileexpertname(String mobileexpertname) {
        this.mobileexpertname = mobileexpertname == null ? null : mobileexpertname.trim();
    }

    /**
     * @return suggestTime
     */
    public Date getSuggesttime() {
        return suggesttime;
    }

    /**
     * @param suggesttime
     */
    public void setSuggesttime(Date suggesttime) {
        this.suggesttime = suggesttime;
    }

    /**
     * 获取指导状态（suggested,unsuggested）
     *
     * @return suggestStatus - 指导状态（suggested,unsuggested）
     */
    public String getSuggeststatus() {
        return suggeststatus;
    }

    /**
     * 设置指导状态（suggested,unsuggested）
     *
     * @param suggeststatus 指导状态（suggested,unsuggested）
     */
    public void setSuggeststatus(String suggeststatus) {
        this.suggeststatus = suggeststatus == null ? null : suggeststatus.trim();
    }

    /**
     * 获取心电图聊天群组ID
     *
     * @return groupId - 心电图聊天群组ID
     */
    public String getGroupid() {
        return groupid;
    }

    /**
     * 设置心电图聊天群组ID
     *
     * @param groupid 心电图聊天群组ID
     */
    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    /**
     * 获取来源设备
     *
     * @return fromDevice - 来源设备
     */
    public String getFromdevice() {
        return fromdevice;
    }

    /**
     * 设置来源设备
     *
     * @param fromdevice 来源设备
     */
    public void setFromdevice(String fromdevice) {
        this.fromdevice = fromdevice == null ? null : fromdevice.trim();
    }

    /**
     * 获取采样率
     *
     * @return samplingRate - 采样率
     */
    public Integer getSamplingrate() {
        return samplingrate;
    }

    /**
     * 设置采样率
     *
     * @param samplingrate 采样率
     */
    public void setSamplingrate(Integer samplingrate) {
        this.samplingrate = samplingrate;
    }

    /**
     * 获取导联类型
     *
     * @return ecgType - 导联类型
     */
    public Integer getEcgtype() {
        return ecgtype;
    }

    /**
     * 设置导联类型
     *
     * @param ecgtype 导联类型
     */
    public void setEcgtype(Integer ecgtype) {
        this.ecgtype = ecgtype;
    }

    /**
     * 获取采样数据到实际电压的换算值
     *
     * @return uVpb - 采样数据到实际电压的换算值
     */
    public String getUvpb() {
        return uvpb;
    }

    /**
     * 设置采样数据到实际电压的换算值
     *
     * @param uvpb 采样数据到实际电压的换算值
     */
    public void setUvpb(String uvpb) {
        this.uvpb = uvpb == null ? null : uvpb.trim();
    }

    /**
     * 获取压缩模式
     *
     * @return compressionMode - 压缩模式
     */
    public Integer getCompressionmode() {
        return compressionmode;
    }

    /**
     * 设置压缩模式
     *
     * @param compressionmode 压缩模式
     */
    public void setCompressionmode(Integer compressionmode) {
        this.compressionmode = compressionmode;
    }

    /**
     * 获取导联名字
     *
     * @return leadNameList - 导联名字
     */
    public String getLeadnamelist() {
        return leadnamelist;
    }

    /**
     * 设置导联名字
     *
     * @param leadnamelist 导联名字
     */
    public void setLeadnamelist(String leadnamelist) {
        this.leadnamelist = leadnamelist == null ? null : leadnamelist.trim();
    }

    /**
     * 获取导联数量
     *
     * @return leadNum - 导联数量
     */
    public Integer getLeadnum() {
        return leadnum;
    }

    /**
     * 设置导联数量
     *
     * @param leadnum 导联数量
     */
    public void setLeadnum(Integer leadnum) {
        this.leadnum = leadnum;
    }

    /**
     * 获取来源设备名称
     *
     * @return fromDeviceName - 来源设备名称
     */
    public String getFromdevicename() {
        return fromdevicename;
    }

    /**
     * 设置来源设备名称
     *
     * @param fromdevicename 来源设备名称
     */
    public void setFromdevicename(String fromdevicename) {
        this.fromdevicename = fromdevicename == null ? null : fromdevicename.trim();
    }

    /**
     * 获取心电图的参数
     *
     * @return QRS_TopPoints - 心电图的参数
     */
    public String getQrsToppoints() {
        return qrsToppoints;
    }

    /**
     * 设置心电图的参数
     *
     * @param qrsToppoints 心电图的参数
     */
    public void setQrsToppoints(String qrsToppoints) {
        this.qrsToppoints = qrsToppoints == null ? null : qrsToppoints.trim();
    }

    /**
     * 获取自动诊断结果
     *
     * @return autoDiagnoseResult - 自动诊断结果
     */
    public String getAutodiagnoseresult() {
        return autodiagnoseresult;
    }

    /**
     * 设置自动诊断结果
     *
     * @param autodiagnoseresult 自动诊断结果
     */
    public void setAutodiagnoseresult(String autodiagnoseresult) {
        this.autodiagnoseresult = autodiagnoseresult == null ? null : autodiagnoseresult.trim();
    }

    /**
     * 获取自动诊断描述
     *
     * @return autoDiagnoseDescription - 自动诊断描述
     */
    public String getAutodiagnosedescription() {
        return autodiagnosedescription;
    }

    /**
     * 设置自动诊断描述
     *
     * @param autodiagnosedescription 自动诊断描述
     */
    public void setAutodiagnosedescription(String autodiagnosedescription) {
        this.autodiagnosedescription = autodiagnosedescription == null ? null : autodiagnosedescription.trim();
    }

    /**
     * 获取病人年龄的单位
     *
     * @return patientAgeUnit - 病人年龄的单位
     */
    public String getPatientageunit() {
        return patientageunit;
    }

    /**
     * 设置病人年龄的单位
     *
     * @param patientageunit 病人年龄的单位
     */
    public void setPatientageunit(String patientageunit) {
        this.patientageunit = patientageunit == null ? null : patientageunit.trim();
    }

    /**
     * @return QTcH
     */
    public String getQtch() {
        return qtch;
    }

    /**
     * @param qtch
     */
    public void setQtch(String qtch) {
        this.qtch = qtch == null ? null : qtch.trim();
    }

    /**
     * 获取发送医院
     *
     * @return sendStation - 发送医院
     */
    public String getSendstation() {
        return sendstation;
    }

    /**
     * 设置发送医院
     *
     * @param sendstation 发送医院
     */
    public void setSendstation(String sendstation) {
        this.sendstation = sendstation == null ? null : sendstation.trim();
    }

    /**
     * @return diagnoseDoctorJobNum
     */
    public String getDiagnosedoctorjobnum() {
        return diagnosedoctorjobnum;
    }

    /**
     * @param diagnosedoctorjobnum
     */
    public void setDiagnosedoctorjobnum(String diagnosedoctorjobnum) {
        this.diagnosedoctorjobnum = diagnosedoctorjobnum == null ? null : diagnosedoctorjobnum.trim();
    }

    /**
     * @return Q_TInterval
     */
    public String getqTinterval() {
        return qTinterval;
    }

    /**
     * @param qTinterval
     */
    public void setqTinterval(String qTinterval) {
        this.qTinterval = qTinterval == null ? null : qTinterval.trim();
    }

    /**
     * @return diagnoseDescription
     */
    public String getDiagnosedescription() {
        return diagnosedescription;
    }

    /**
     * @param diagnosedescription
     */
    public void setDiagnosedescription(String diagnosedescription) {
        this.diagnosedescription = diagnosedescription == null ? null : diagnosedescription.trim();
    }

    /**
     * @return DPTcode
     */
    public String getDptcode() {
        return dptcode;
    }

    /**
     * @param dptcode
     */
    public void setDptcode(String dptcode) {
        this.dptcode = dptcode == null ? null : dptcode.trim();
    }

    /**
     * 获取放大系数
     *
     * @return scale - 放大系数
     */
    public String getScale() {
        return scale;
    }

    /**
     * 设置放大系数
     *
     * @param scale 放大系数
     */
    public void setScale(String scale) {
        this.scale = scale == null ? null : scale.trim();
    }

    /**
     * @return electricAxis
     */
    public String getElectricaxis() {
        return electricaxis;
    }

    /**
     * @param electricaxis
     */
    public void setElectricaxis(String electricaxis) {
        this.electricaxis = electricaxis == null ? null : electricaxis.trim();
    }

    /**
     * 获取心电数据
     *
     * @return waveData - 心电数据
     */
    public String getWavedata() {
        return wavedata;
    }

    /**
     * 设置心电数据
     *
     * @param wavedata 心电数据
     */
    public void setWavedata(String wavedata) {
        this.wavedata = wavedata == null ? null : wavedata.trim();
    }

    /**
     * @return xmlContent
     */
    public String getXmlcontent() {
        return xmlcontent;
    }

    /**
     * @param xmlcontent
     */
    public void setXmlcontent(String xmlcontent) {
        this.xmlcontent = xmlcontent == null ? null : xmlcontent.trim();
    }

    /**
     * 获取PC端描述
     *
     * @return description - PC端描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置PC端描述
     *
     * @param description PC端描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取APP给的指导意见
     *
     * @return mobileSuggestion - APP给的指导意见
     */
    public String getMobilesuggestion() {
        return mobilesuggestion;
    }

    /**
     * 设置APP给的指导意见
     *
     * @param mobilesuggestion APP给的指导意见
     */
    public void setMobilesuggestion(String mobilesuggestion) {
        this.mobilesuggestion = mobilesuggestion == null ? null : mobilesuggestion.trim();
    }

    /**
     * 获取APP端给的描述
     *
     * @return mobileDescription - APP端给的描述
     */
    public String getMobiledescription() {
        return mobiledescription;
    }

    /**
     * 设置APP端给的描述
     *
     * @param mobiledescription APP端给的描述
     */
    public void setMobiledescription(String mobiledescription) {
        this.mobiledescription = mobiledescription == null ? null : mobiledescription.trim();
    }

    /**
     * 获取诊断报告(废弃)
     *
     * @return diagnosticReport - 诊断报告(废弃)
     */
    public String getDiagnosticreport() {
        return diagnosticreport;
    }

    /**
     * 设置诊断报告(废弃)
     *
     * @param diagnosticreport 诊断报告(废弃)
     */
    public void setDiagnosticreport(String diagnosticreport) {
        this.diagnosticreport = diagnosticreport == null ? null : diagnosticreport.trim();
    }
}