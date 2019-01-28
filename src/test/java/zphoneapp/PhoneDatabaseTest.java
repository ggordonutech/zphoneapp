package zphoneapp;

import com.zphone.zphoneapp.Phone;
import com.zphone.zphoneapp.PhoneDatabase;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.zphone.zphoneapp.IDatabase;;

public class PhoneDatabaseTest {
	
	@Test
	public void shouldSavePhoneObject() {
		IDatabase<Phone> db = new PhoneDatabase();
		Phone phone = new Phone("BLU001","1233",12000,"BLU");
		boolean success = db.save(phone);
		assertTrue(success);
		//assertions
	}
	
    public void shouldRetrievePhoneObject() {
    	IDatabase<Phone> db = new PhoneDatabase();
		Phone phone =  db.retrieveFirstItem();
		//TODO: assert that the phone object is not null
		//TODO: assert that you retrieved the correct
		    // - model
		    // - price
		    
	}

}
