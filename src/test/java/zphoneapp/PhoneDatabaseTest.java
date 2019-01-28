package zphoneapp;

import com.zphone.zphoneapp.Phone;
import com.zphone.zphoneapp.PhoneDatabase;
import com.zphone.zphoneapp.IDatabase;;

public class PhoneDatabaseTest {
	
	public void shouldSavePhoneObject() {
		IDatabase<Phone> db = new PhoneDatabase();
		Phone phone = new Phone("BLU001","1233",12000,"BLU");
		boolean success = db.save(phone);
		//assertions
	}
	
    public void shouldRetrievePhoneObject() {
    	IDatabase<Phone> db = new PhoneDatabase();
		Phone phone =  db.retrieveFirstItem();
	}

}
