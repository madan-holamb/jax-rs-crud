package org.madan.Messenger.service;

import java.util.Collection;
import java.util.Map;

import org.madan.Messenger.model.Profile;
import org.madan.Messenger.repository.MessageRepository;

public class ProfileService {
	
	Map<String, Profile> profileMap = MessageRepository.getProfiles();
	

	public Collection<Profile> getAllProfile(){
		Collection<Profile> list = profileMap.values();
		return list;
	}
	
	public Profile getProfile(String name) {
		return profileMap.get(name);
	}
	
	public Profile addProfile(Profile profile) {
		profileMap.put(profile.getProfileName(), profile);
		
		return profile;
	}
	
	public Profile updateProfile(Profile profile,String profileName) {
		if(profileName != null) {
			Profile newProfile = profileMap.get(profileName);
			if(profile.getFirstName() != null) {
				newProfile.setProfileName(profile.getFirstName());
			}
			if(profile.getFirstName() !=null) {
				newProfile.setFirstName(profile.getFirstName());
			}
			if(profile.getCreateDate() != null) {
				newProfile.setCreateDate(profile.getCreateDate());
			}
			if(profile.getLastName() != null) {
				newProfile.setLastName(profile.getLastName());
			}
		
		profileMap.put(profileName, newProfile);
		return newProfile;
		}
		return null;
	}
	
	public String removeProfile(String name) {
		profileMap.remove(name);
		return "removed successfully";
		
	}


}
