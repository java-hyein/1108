//���� main() �޼ҵ�� ���� ����� �����Ͽ� ColorTV�� ��ӹ޴� IPTV Ŭ������ �ۼ��϶�.
//
//public static void main(String[] args) {
//   IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 
//"192.1.1.2" �ּҿ� 32��ġ, 2048�÷�
//   iptv.printProperty();
//}
//��°��:
//���� IPTV�� 192.1.1.2 �ּ��� 32��ġ 2048�÷�

package day1107;

public class IPTVTest {

	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
