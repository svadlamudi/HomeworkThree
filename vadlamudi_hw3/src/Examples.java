import tester.Tester;

// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class Examples {
	
	Examples() {}
	
	DataHeap<MenuItem> lunchMenu= new DataHeap<MenuItem>(new MenuItem("Salad", 10), 
														 new DataHeap<MenuItem>(new MenuItem("Rice", 13), 
																 				new DataHeap<MenuItem>(new MenuItem("Chicken", 15), 
										 												   			   new DataHeap<MenuItem>(new MenuItem("Steak", 16), 
										 												   					   				  new MtHeap<MenuItem>(), 
										 												   					   				  new MtHeap<MenuItem>()), 
										 												   			   new MtHeap<MenuItem>()), 
																 				new DataHeap<MenuItem>(new MenuItem("Fish", 16), 
							 												   			   			   new DataHeap<MenuItem>(new MenuItem("Shrimp", 18), 
							 												   			   					   				  new MtHeap<MenuItem>(), 
							 												   			   					   				  new MtHeap<MenuItem>()), 
							 												   			   			   new MtHeap<MenuItem>())), 
														 new DataHeap<MenuItem>(new MenuItem("Dessert", 14), 
													 							new DataHeap<MenuItem>(new MenuItem("Chocalate", 16), 
													 												   new MtHeap<MenuItem>(), 
													 												   new MtHeap<MenuItem>()), 
													 							new DataHeap<MenuItem>(new MenuItem("Vanilla", 17), 
										 												   			   new MtHeap<MenuItem>(), 
										 												   			   new MtHeap<MenuItem>())));
}	
