package statictest;

public enum Mp3TagStyle {
	Blues,
	Classic_Rock,
	Country,
	Dance,
	Disco,
	Funk,
	Grunge,
	Hip_moins_Hop,
	Jazz,
	Metal,
	NewAge,
	Oldies,
	Other,
	Pop,
	R_et_B,
	Rap,
	Reggae,
	Rock,
	Techno,
	Industrial,
	Alternative,
	Ska,
	Death_Metal,
	Pranks,
	Soundtrack,
	Euro_moins_Techno,
	Ambient,
	Trip_moins_Hop,
	Vocal,
	Jazz_plus_Funk,
	Fusion,
	Trance,
	Classical,
	Instrumental,
	Acid,
	House,
	Game,
	Sound_Clip,
	Gospel,
	Noise,
	AlternRock,
	Bass,
	Soul,
	Punk,
	Space,
	Meditative,
	Instrumental_Pop,
	Instrumental_Rock,
	Ethnic,
	Gothic,
	Darkwave,
	Techno_moins_Industrial,
	Electronic,
	Pop_Folk,
	Eurodance,
	Dream,
	Southern_Rock,
	Comedy,
	Cult,
	Gangsta,
	Top_40,
	Christian_Rap,
	Pop_slash_Funk,
	Jungle,
	Native_American,
	Cabaret,
	New_Wave,
	Psychadelic,
	Rave,
	Showtunes,
	Trailer,
	Lo_moins_Fi,
	Tribal,
	Acid_Punk,
	Acid_Jazz,
	Polka,
	Retro,
	Musical,
	Rock_et_Roll,
	Hard_Rock,
	Folk,
	Folk_moins_Rock,
	National_Folk,
	Swing,
	Fast_Fusion,
	Bebob,
	Latin,
	Revival,
	Celtic,
	Bluegrass,
	Avantgarde,
	Gothic_Rock,
	Progressive_Rock,
	Psychedelic_Rock,
	Symphonic_Rock,
	Slow_Rock,
	Big_Band,
	Chorus,
 	Easy_Listening,
 	Acoustic,
 	Humour,
 	Speech,
 	Chanson,
 	Opera,
 	Chamber_Music,
 	Sonata,
 	Symphony,
 	Booty_Brass,
 	Primus,
 	Porn_Groove,
 	Satire,
 	Slow_Jam,
 	Club,
 	Tango,
 	Samba,
 	Folklore,
 	Ballad,
 	Poweer_Ballad,
 	Rhytmic_Soul,
 	Freestyle,
 	Duet,
 	Punk_Rock,
 	Drum_Solo,
 	A_Capela,
 	Euro_moins_House,
 	Dance_Hall,
 	KIAB_moins_Style;
	



public String toString() {
	String s = super.toString();	
	s = s.replaceAll("_moins_", "-");
	s = s.replaceAll("_et_", "&");
	s = s.replaceAll("_plus_", "+");
	s = s.replaceAll("_slash_", "/");
	s = s.replaceAll("_", " ");	
	return s;


}


}

















