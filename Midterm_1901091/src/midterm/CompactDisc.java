package midterm;
import java.util.*;
public class CompactDisc {
	public void printMenu() {
		System.out.println("--------------------");
		System.out.println("<성적 처리 프로그램>");
		System.out.println("1. CompactDisc 데이터 입력");
		System.out.println("2. CompactDisc 리스트 보기");
		System.out.println("3. CompactDisc 바코드 번호로 보기");
		System.out.println("4. 가장 오래된 CD, 가장 최근 출시 CD 보기 ");
		System.out.println("5. 평균 가격, 중위 가격 보기 ");
		System.out.println("6. 출시년도순 정렬해서 보기 "); //array.sort(~~)
		System.out.println("7. 음반명으로 검색 "); //if(name.equals("name2")
		System.out.println("8. 음반 정보 수정하기"); // 음반정보 수정하기 화면 캡쳐
		System.out.println("0. 종료");
		System.out.println();
		System.out.print("선택 : ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String compactdisc;
		CompactDisc cd = new CompactDisc();
		cd.printMenu();
		String list[] = { "바코드번호","음반명","음악가","가격","출시년도"};
		String barcord;
		String sing;
		String singer;
		String money;
		String launch;
		int num;
		int idx;
		Scanner scanner = new Scanner(System.in);
		String arr[]=new String[5];
		while(true) {
			num = scanner.nextInt();
			
			switch(num){
				System.out.print("입력할 CD의 갯수를 넣으세요 : ");
				idx = scanner.nextInt();
				case 1 :
					for(int i=0; i<idx; i++) {
						System.out.print(idx+"번쨰 CD");
						barcord = scanner.next();
						sing = scanner.next();
						singer = scanner.next();
						money = scanner.next();
						launch = scanner.next();
						setStorage(i,barcord, sing,singer,money,lauch);
						
					}
					cd.printMenu();
					break;
				
				case 2:
					for(int i=0; i<5; i++) {
						System.out.print(list[i]+" ");
					}
					System.out.println();
					cd.getStorage();
					cd.printMenu();
					break;
					
				case 3:
					System.out.print("=> 검색할 바코드 번호 : ");
					int serial = scanner.nextInt();
					for(int i=0; i<cd.getLength(); i++) {
						if(serial.equlas(cd.getBarcord())){
							arr = cd.getStorage_2(serial);
							for(int j=0; j<5; j++) {
								System.out.print(arr[i]+" ");
							}
						}
					}
					cd.getStorage_2(serial);
					cd.printMenu();
					break;
					
				case 4:
					System.out.println("=> 가장 오래된 CD : "+getLaunch_min+"년 출시 후"+ (2023-getLaunch_min));
					System.out.print("가장 최근 출시 CD"+getLaunch_max+"년 출시 후"+ (2023-getLaunch_max) );
			}
		}
		
	}

}
