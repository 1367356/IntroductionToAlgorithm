package chapter19.ten;

public class PostOffice {

	enum MailHandler{
		GENERAL_DELIVERY{
			boolean handler(Mail m){
				switch (m.generalDelivery) {
				case YES:
					System.out.println("Using general deliery for"+m);
					return true;

				default:
					return false;
				}
			}

		},
		MACHINE_SCAN{
			boolean handler(Mail m){
				switch (m.scannability) {
				case UNSCANNABLE:
					return false;

				default:
					switch (m.address) {
					case INCORRECT:
						return false;

					default:
						System.out.println("Delivering"+ m+"automatically");;
						return true;
					}
				}
			}
		};
		abstract boolean handler(Mail m);
	}
	
	static void handler(Mail m){
		for(MailHandler handler:MailHandler.values()){
			if(handler.handler(m)){
				return ;
			}
		}
		System.out.println(m+"is a dead letter");
	}
	
	public static void main(String[] args) {
		for(Mail mail:Mail.generator(10)){
			handler(mail);
			System.out.println("**************88888");
		}
	}
}
