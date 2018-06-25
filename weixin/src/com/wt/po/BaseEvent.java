package com.wt.po;
/**
 * @Description:
 * @author wt
 * @date 2018年5月25日 下午2:12:05
 */
public class BaseEvent {
	private String ToUserName;			//开发者微信号
	private String FromUserName;		//发送方帐号（一个OpenID）
	private String CreateTime;			//消息创建时间 （整型）
	private String MsgType;				//消息类型，event
	private String Event;				//事件类型，subscribe(订阅)、unsubscribe(取消订阅)
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	public String getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public String getEvent() {
		return Event;
	}
	public void setEvent(String event) {
		Event = event;
	}
	
}
