package com.redbird.wehelp.utils;

import java.sql.Timestamp;
import java.util.List;

import com.redbird.wehelp.pojo.Message;

/**
 * 
 * @author cennanfang
 *
 */
public class MessagesModel {
	// 当前记录
	private Timestamp markPublishedDate;
	// 返回结果数据条数
	private int mesgsTotal;
	
	// 信息链表
	private List<Message> messages;
	
	@Override
	public String toString() {
		String str = "currentMsgPoint=" + markPublishedDate + "\r\nmessages: \r\n";
		for (Message message : messages) {
			str += (message + "\r\n");
		}
		return str;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	
	public int getMesgsTotal() {
		return mesgsTotal;
	}

	public void setMesgsTotal(int mesgsTotal) {
		this.mesgsTotal = mesgsTotal;
	}

	public Timestamp getMarkPublishedDate() {
		return markPublishedDate;
	}

	public void setMarkPublishedDate(Timestamp markPublishedDate) {
		this.markPublishedDate = markPublishedDate;
	}
}
