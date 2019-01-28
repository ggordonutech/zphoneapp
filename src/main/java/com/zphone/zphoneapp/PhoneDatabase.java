package com.zphone.zphoneapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PhoneDatabase
   implements IDatabase<Phone> {
	
	private static final String DB_NAME="phones.db";

	public boolean save(Phone item) {
		boolean success = false;
        ObjectOutputStream os = null;
        try {
			os = new ObjectOutputStream(
					new FileOutputStream(DB_NAME)
					);
			os.writeObject(item);
			success = true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(os != null)os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return success;
	}

	public Phone retrieveFirstItem() {
		Phone data = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(
					new FileInputStream(DB_NAME)
					);
			data = (Phone) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(ois!=null)ois.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return data;
	}//end method

}
