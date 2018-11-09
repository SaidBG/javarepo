package statictest;

public enum Mp3Enum {
	TAB_LEN(128),
	TAG_LEN(3),
	TITLE_LEN(30),
	ARTIST_LEN(30),
	ALBUM_LEN(30),
	YEAR_LEN(4),
	COMMENT_LEN(30),
	GENRE_LEN(1);

	private int value;

	Mp3Enum(int value) {
		this.value = value;

	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}




}
