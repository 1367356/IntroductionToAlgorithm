package chapter19.ten;

import java.util.Iterator;
import java.util.function.Consumer;

import chapter19.six.Enums;

public class Mail {

	enum GeneralDelivery{
		YES,NO1,NO2,NO3,NO4,NO5
	}
	enum Scannability{
		UNSCANNABLE,YES1,YES2,YES3,YES4
	}
	enum Readability{
		ILLEGIBLE,YES1,YES2,YES3,YES4
	}
	enum Address{
		INCORRECT,OK1,OK2,OK3,OK4,OK5,OK6
	}
	enum ReturnAddress{
		MISSING,OK1,OK2,OK3,OK4,OK5
	}
	GeneralDelivery generalDelivery;
	Scannability scannability;
	Address address;
	Readability readability;
	ReturnAddress returnAddress;
	
	static long counter=0;
	long id=counter++;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mail"+id;
	}
	public String details(){
		return toString()+"general deliver"+generalDelivery+scannability;
	}
	
	public static Mail randomMail(){
		Mail mail=new Mail();
		mail.generalDelivery=Enums.random(GeneralDelivery.class);
		mail.scannability=Enums.random(Scannability.class);
		return mail;
	}
	
	public static Iterable<Mail> generator(final int count){
		return new Iterable<Mail>() {
			int n=count;
			public Iterator<Mail> iterator() {
				// TODO Auto-generated method stub
				return new Iterator<Mail>() {

					public boolean hasNext() {
						// TODO Auto-generated method stub
						return n-->0;
					}

					public Mail next() {
						// TODO Auto-generated method stub
						return randomMail();
					}

					public void remove() {
						// TODO Auto-generated method stub
						throw new UnsupportedOperationException();
					}

					public void forEachRemaining(Consumer<? super Mail> action) {
						// TODO Auto-generated method stub
						
					}
				};
			}
		};
	}
}
