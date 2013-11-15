import tester.Tester;

// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class Examples {
	
	Examples() {}
	
	DataHeap ex1 = new DataHeap(5,
								new DataHeap(15, 
										new DataHeap(20, 
												new MtHeap(), 
												new MtHeap()), 
										new MtHeap()),
								new DataHeap(10, 
										new DataHeap(30, 
												new DataHeap(40, 
														new MtHeap(), 
														new DataHeap(50, 
																new MtHeap(), 
																new MtHeap())), 
												new MtHeap()), 
										new DataHeap(25, 
												new MtHeap(), 
												new MtHeap())));

	DataHeap ex2 = new DataHeap(10, 
								new DataHeap(30, 
										new DataHeap(40, 
												new MtHeap(), 
												new DataHeap(50, 
														new MtHeap(), 
														new MtHeap())), 
										new MtHeap()), 
								new DataHeap(15, 
										new DataHeap(20, 
												new MtHeap(), 
												new MtHeap()),
										new DataHeap(25, 
												new MtHeap(), 
												new MtHeap())));
	
	boolean testRemoveMinElt(Tester t){
		return (t.checkExpect(ex1.removeMinElt().height() == ex2.height(), true) &&
			   (t.checkExpect(ex1.removeMinElt().findMinElt() == 10, true)));	
	}
}
