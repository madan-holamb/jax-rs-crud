package org.madan.Messenger.resource;

import java.util.Collection;

import org.madan.Messenger.model.Profile;
import org.madan.Messenger.service.ProfileService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/profiles")
public class ProfileResource {

	ProfileService profileService = new ProfileService();

	@GET	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Profile> getAllMessages() {
		return profileService.getAllProfile();
	}

	@GET
	@Path("{profilename}")
	@Produces(MediaType.APPLICATION_JSON)
	public Profile getOneMessage(@PathParam("profilename") String profilename) {
		return profileService.getProfile(profilename);
	}

	@POST
	@Path("addProfile")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Profile addMessage(Profile profile) {
		return profileService.addProfile(profile);
	}

	@PUT
	@Path("{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Profile updateMessage(Profile profile,@PathParam("messageId")String name) {
		return profileService.updateProfile(profile,name);
	}

	@DELETE
	@Path("{deleteprofile}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteMessage(@PathParam("deleteprofile")String name) {
		return profileService.removeProfile(name);

	}




}
