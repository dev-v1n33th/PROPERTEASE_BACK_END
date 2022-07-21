package com.payment.repos;

import com.payment.common.PostPayments;
import com.payment.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PayRepos extends JpaRepository<Payments, Integer> {
    Payments findByGuestId(String guestId);

    Payments findDueAmountByGuestId(String guestId);

   

    List<Payments> findPaymentsByGuestId(String guestId);

    @Query(value = "select sum(due_amount) from Payments ", nativeQuery = true)
    public double getTotalDue();


    @Query(value = "SELECT COUNT(*) FROM payments WHERE due_amount>0 ", nativeQuery = true)
    public int getCount();

    //List<Payment> findAllByOrderByTransactionDateDesc(Date transactionDate);
//List<Payment> findAll(Date transactionDate);
    Optional<List<Payments>> findTop30AllByOrderByTransactionDateDesc();

	List<Payments> findAllPaymentsByGuestId(String guestId);

	List<Payments> getDueAmountByGuestId(String guestId);
	Optional<List<Payments>> findPaymentsByBuildingId(int buildingId) ;
	
	    @Query(value="SELECT SUM(amount_paid) FROM Payments u WHERE guest_id=:id",nativeQuery = true)
	    long getCountOfAmount(@Param("id") String guestId);
	    
	    @Query(value="SELECT SUM(refund_amount) FROM Payments u WHERE guest_id=:id",nativeQuery = true)
	    long getCountOfRefundAmount(@Param("id") String guestId);

		
	    
}


//@Query(
//		value = "Select transaction_id,guest_id,amount_paid  from payments p where p.building_id =  ?1  " ,
//				nativeQuery = true )

