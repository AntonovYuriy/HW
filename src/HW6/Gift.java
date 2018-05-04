package HW6;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Gift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		int canNumber = (int) Math.round ( (Math.random() * 20 )) + 120;
		System.out.println("Всего будет " + canNumber + " видов конфет.");
		
//		Sweet [] gift = new Sweet [canNumber];

		
		
		int chocoNumber = Math.round (canNumber /3);
		int caramelNumber = Math.round (canNumber /3);
		int lolNumber = canNumber - 2 * Math.round (canNumber / 3);
		
		System.out.println("Всего будет конфет карамелек - " + caramelNumber );
		System.out.println("Всего будет конфет шоколадок - " + chocoNumber );
		System.out.println("Всего будет конфет леденцов - " + lolNumber );

		Chocolate [] choco = new Chocolate [chocoNumber];
		Caramel [] caramel = new Caramel [caramelNumber];
		Lollipop [] lol = new Lollipop [lolNumber];
		
//		Объявляем все конфеты
		for (int i = 0; i < choco.length; i++) {
			choco[i] = new Chocolate();
		}
		for (int i = 0; i < caramel.length; i++) {
			caramel[i] = new Caramel();
		}
		for (int i = 0; i < lol.length; i++) {
			lol[i] = new Lollipop();
		}
			
				
		Sweet [] allCandies = new Sweet [canNumber];
		System.arraycopy(choco, 0, allCandies, 0, choco.length);
		System.arraycopy(caramel, 0, allCandies, choco.length, caramel.length);
		System.arraycopy(lol, 0, allCandies, choco.length+caramel.length, lol.length);


		for (int i = 0; i < allCandies.length; i++) {
		allCandies[i].createCandy(i);
		}
		
		
		int giftQuantity = (int) Math.round ( (Math.random() * 20 ));
		System.out.println("Подарок будет состоять из - " + giftQuantity + " конфет :");
		Sweet [] sweets = new Sweet [giftQuantity];
	
//		Arrays.sort (sweets , (Sweet o1, Sweet o2) -> {
//			return o1.sugar - o2.sugar; });
		
		for (int i = 0; i < giftQuantity; i++) {
			sweets [i] = allCandies[((int) Math.round ( (Math.random() * allCandies.length )))]	;
			sweets [i] .printCandy(allCandies[i].id);
		}
		
		GiftWeight(sweets);
		GiftSugar(sweets);
		
		Optional<Sweet> minimalWeight = Arrays.stream(sweets)
				.min((o1, o2) -> { return o1.weight - o2.weight;} );

		minimalWeight.get().printCandy(minimalWeight.get().id);
		
//		sweets [ minimalWeight.get().id ].printCandy();
		
		
	}		
		
//		Arrays.sort(sweets, (sweet1, sweet2) -> {
//			
//			return sweet1.sugar - sweet2.sugar;
//		});
//	
//		Arrays.sort(sweets, new Comparator<Sweet>() {
//
//			@Override
//			public int compare(Sweet o1, Sweet o2) {
//				// TODO Auto-generated method stub
//				return o1.sugar - o2.sugar;
//			}
//		});
		
//		int sum = Arrays.stream(gift).sum(gift.weight);



//	private static int FindMinimaSugarlID (Sweet [] s) {
//		int minSugar = s[0].sugar;
//		int id = s[0].id;
//				
//		for (Sweet sweet : s) {
//			if minSugar < sweet.sugar {
//				minSugar = s.sugar;
//				id = s.id;	
//			}
//		}
//		return id;
//	}
	
	
	

	
	
	private static int GiftWeight(Sweet[] sweets) {
		int weight = 0;
		for (Sweet sweet : sweets) {
			weight += sweet.weight;
		}
		System.out.print("Вес всего подарка будет : ");
		System.out.println(weight);
		return weight;
	}

	private static int GiftSugar(Sweet[] sweets) {
		int sugar = 0;
		for (Sweet sweet : sweets) {
			sugar += sweet.sugar;
		}
		System.out.print("В подарке всего сахара будет : ");
		System.out.println(sugar);
		return sugar;
	}
	
}