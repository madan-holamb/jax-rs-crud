package org.madan.Messenger.repository;

import java.util.HashMap;
import java.util.Map;

import org.madan.Messenger.model.Messages;
import org.madan.Messenger.model.Profile;


public class MessageRepository {
   
	private static Map<Long, Messages> messages = new HashMap<Long, Messages>();
	
	private static Map<String, Profile> profiles = new HashMap<String, Profile>();
	
	

	public static Map<Long, Messages> getMessages() {
		return messages;
	}

	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	
	
}
