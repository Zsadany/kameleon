package enumeration.cultureclub;

public class OldBand {
	
	CultureClub member;
	public static final String SINGER = "singer";
	public static final String PERCUSSION_INSTRUMENTS = "Percussion instruments";
	public static final String GUITAR = "guitar";
	public static final String BASS_GUITAR = "bass guitar";
	public static final String LEAD_SINGER = "Lead singer";
	
	
	public OldBand(CultureClub member) {
		this.member = member;
	}
	
	public void describeBand() {
		switch(member) {
			case BOY_GEORGE: System.out.println(SINGER);
				break;
			case JON_MOSS: System.out.println(PERCUSSION_INSTRUMENTS);
				break;
			case JOHN_SUEDE: System.out.println(GUITAR);
				break;
			case MIKEY_CRAIG: System.out.println(BASS_GUITAR);
				break;
			case ROY_HAY: System.out.println(GUITAR);
				break;
			case SAM_BUTCHER: System.out.println(SINGER);
				break;
			default: System.out.println("There is not such member");
		}
	}

}
