package enumeration.cultureclub;

public class OldBand {
	
	CultureClub member;
	
	public OldBand(CultureClub member) {
		this.member = member;
	}
	
	public void describeBand() {
		switch(member) {
			case BOY_GEORGE: System.out.println("Lead singer");
				break;
			case JON_MOSS: System.out.println("Percussion instruments");
				break;
			case JOHN_SUEDE: System.out.println("guitar");
				break;
			case MIKEY_CRAIG: System.out.println("bass guitar");
				break;
			case ROY_HAY: System.out.println("guitar");
				break;
			case SAM_BUTCHER: System.out.println("singer");
				break;
			default: System.out.println("There is not such member");
		}
	}

}
