package com.wt.po;
/**
 * @Description:
 * @author wt
 * @date 2018年5月25日 下午2:08:58
 */
public class LinkMessage extends BaseMessage {
	private String Title;			//消息标题
	private String Description;		//消息描述
	private String Url;				//消息链接
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
	
}
