package com.arshaa.service;

import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.arshaa.entity.GuestProfile;
import com.arshaa.repository.GuestProfileRepo;

@Service
public class GuestProfileService {

	@Autowired
	GuestProfileRepo gpRepo;
	
	public GuestProfile store(MultipartFile file,String guestId) throws IOException {
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	    //String employeeId1=employeeId;
	    //GuestProfile FileDB = new GuestProfile();
	    GuestProfile newFile=new GuestProfile();
	    newFile.setData(file.getBytes());
	    newFile.setGuestId(guestId);
	    newFile.setName(fileName);
	    newFile.setType(file.getContentType());
	    
	    
	    return gpRepo.save(newFile);
	    
	  }
	  public GuestProfile getFile(String id) {
	    return gpRepo.findById(id).get();
	  }
	  
	  public GuestProfile getFileByID(String id) {
		    return gpRepo.findByGuestId(id);
		  }
	  public Stream<GuestProfile> getAllFiles() {
	    return gpRepo.findAll().stream();
	  }

}
