
public class FriendTest {

	public static void main(String[] args) {
		Friend[] frns = new Friend[10];
		int cnt = 0;

		frns[cnt++] = new UnivFriend("LEE", "Computer", "010-333-5555");
		frns[cnt++] = new UnivFriend("SEO", "Electromics", "010-234-3467");
		frns[cnt++] = new CompFriend("YOON", "R&D 1 ", "02-865-333");
		frns[cnt++] = new CompFriend("PARK", "R&D 2 ", "02-865-3337");

		for (int i = 0; i < cnt; i++) {
			frns[i].showInfo();
			System.out.println();
		}	
	}
}
