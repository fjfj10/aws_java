package ch18_빌더;

public class KoreaUserMain {
	
	public static void main(String[] args) {
		/*
		 * KoreaUser koreaUser = KoreaUser.builder() .userId(1) .username("aaa")
		 * .password("1234") .name("김준일") .email("aaa@gmail.com") .build(); //build가 대리인
		 * 역할을 해서 객체 생성 KoreaUser koreaUser2 = KoreaUser.builder() .username("bbb")
		 * .name("김채원") .email("bbb") .userId(2) .password("5678") .build();
		 * 
		 * System.out.println(koreaUser); System.out.println(koreaUser2);
		 */
		
		KoreaUser koreaUser = KoreaUser.builder().userId(1).build();
		KoreaUser koreaUser2 =new KoreaUser(1, null, null, null, null);
		KoreaUser koreaUser3 = new KoreaUser();
		koreaUser3.setUserId(1);    //123모두 같음
	}
}
