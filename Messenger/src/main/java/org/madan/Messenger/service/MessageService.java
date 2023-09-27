package org.madan.Messenger.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.madan.Messenger.model.Messages;
import org.madan.Messenger.repository.MessageRepository;

public class MessageService {
  
	private Map<Long, Messages> messageMap = MessageRepository.getMessages();
	
	
	public Collection<Messages> getAllMessages(){
		Collection<Messages> list = messageMap.values();
		return list;
	}
	
	public Messages getMessage(long id) {
		return messageMap.get(id);
	}
	
	public Messages addMessages(Messages msg) {
		msg.setId(messageMap.size()+1);
		messageMap.put(msg.getId(), msg);
		
		return msg;
	}
	
	public Messages updateMessages(Messages msg,Long messageId) {
		if(messageId != null) {
			Messages message = messageMap.get(messageId);
			if(msg.getAuthor() != null) {
				message.setAuthor(msg.getAuthor());
			}
			if(msg.getMessage()!=null) {
				message.setMessage(msg.getMessage());
			}
			if(msg.getCreateDate() != null) {
				message.setCreateDate(msg.getCreateDate());
			}
		
		messageMap.put(message.getId(), message);
		return message;
		}
		return null;
	}
	
	public String removeMessages(long id) {
		messageMap.remove(id);
		return "removed successfully";
		
	}
	
	
	
}
