package simsim;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class RanDom_ArrayList_While {
	
	int ranDom;
	ArrayList<Integer> roto = new ArrayList<Integer>();
	
	public void looF() {	
		
		System.out.println("횟수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int counT = sc.nextInt();
		
		int i = 0;
		while (i<counT) {
			System.out.println("==========" + (i + 1) + " 번째 실행 ==========");
			
			while (roto.size()<=6) {
				ranDom = (int)(Math.random()*100);
				
				if (ranDom > 0 && ranDom <46 && !roto.contains(ranDom)) roto.add(ranDom);
			}
			
			Collections.sort(roto);
			System.out.println(roto);
			roto.clear();
			i++;
		}
		
//		Collections.sort(roto);
//		System.out.println(roto);
//		roto.clear();
		
//		for (int i = 1; i <= counT; i++) {
//			
//			System.out.println("==========" + i + " 번째 실행 ==========");
//			
//			for (int j = 0; j < 6; j++) {
//				
//				ranDom = (int)(Math.random()*100);
//				
//				while (ranDom > 0 && ranDom <46 && !roto.contains(ranDom)) {
//					roto.add(ranDom);
//				}
//				
//			}
//			Collections.sort(roto);
//			System.out.println(roto);
//			roto.clear();
//		}
		
	}

}
