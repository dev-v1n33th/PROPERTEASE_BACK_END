package com.arshaa.service;

import com.arshaa.common.Bed;
import com.arshaa.dtos.GuestDto;
import com.arshaa.entity.Guest;
import com.arshaa.model.GuestsInNotice;
import com.arshaa.model.PreviousGuests;
import com.arshaa.model.VacatedGuests;



import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

public interface GuestInterface {

    public List<GuestDto> getGuests(String field);

    public Guest getGuestById(String guestId);

    public Guest addGuest(Guest guest) ;
    
    public Guest addPostGuest(PreviousGuests guest) ;


    public double updateGuest(Guest guest);
    
    

    public void deleteGuest(String guestId);
    public List<Guest> getByGuestId(String guestId) ;
    
    public List<Guest>  getTotalDue();
    
    public List<Guest> getPendingByBuildingId(int buildingId);
    public List<Guest> getCheckOutAmountByGuestId(String id);
 
    public List<Guest> getFinalDueAmountById(String id);
    
    public List<Guest> getOnlyDues(String id);
    
    public List<VacatedGuests> findByGuestStatus(String guestStatus);
    
    public List<Guest> getTotalPaidByGuestId(String id);
    
    public ResponseEntity getGuestData(int buildingId);
	public double calculateDueAmount(String id);

	public ResponseEntity paymentRemainder(int buildingId);

}
