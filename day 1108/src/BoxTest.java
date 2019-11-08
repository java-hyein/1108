
public class BoxTest {

	public static void wrapBox(Box box) {

		if (box instanceof GoldPaperBox) {
			((GoldPaperBox) box).goldWrap();
		} else if (box instanceof PaperBox) {
			((PaperBox) box).paperWrap();
		} else {
			box.simpleWrap();
		}
	}

}
