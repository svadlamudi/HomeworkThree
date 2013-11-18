import tester.Tester;

// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class Examples {
	
	Examples() {}
	
//////////////////////////////////////////////////////////////////////MenuItem///////////////////////////////////////////////////////////////////////////////////
	
	DataHeap<MenuItem> lunchMenu= new DataHeap<MenuItem>(new MenuItem("Salad", 10), 
			 					   						 new DataHeap<MenuItem>(new MenuItem("Rice", 13), 
			 					   								 				new DataHeap<MenuItem>(new MenuItem("Chicken", 15), 
			 					   								 									   new DataHeap<MenuItem>(new MenuItem("Steak", 21), 
			 					   								 											   				  new MtHeap<MenuItem>(), 
			 					   								 											   				  new MtHeap<MenuItem>()), 
			 					   								 									   new MtHeap<MenuItem>()), 
			 					   								 				new DataHeap<MenuItem>(new MenuItem("Fish", 16), 
			 					   								 									   new MtHeap<MenuItem>(),
			 					   								 									   new DataHeap<MenuItem>(new MenuItem("Shrimp", 18), 
			 					   								 											   				  new MtHeap<MenuItem>(), 
			 					   								 											   				  new MtHeap<MenuItem>()))), 
			 					   						 new DataHeap<MenuItem>(new MenuItem("Dessert", 14), 
			 					   								 				new DataHeap<MenuItem>(new MenuItem("Chocalate", 19), 
			 					   								 									   new MtHeap<MenuItem>(), 
			 					   								 									   new MtHeap<MenuItem>()), 
			 					   								 				new DataHeap<MenuItem>(new MenuItem("Vanilla", 20), 
			 					   								 						               new MtHeap<MenuItem>(), 
			 					   								 						               new MtHeap<MenuItem>())));
	
	DataHeap<MenuItem> lunchMenuAfter = new DataHeap<MenuItem>(new MenuItem("Rice", 13), 
			                                                   new DataHeap<MenuItem>(new MenuItem("Chicken", 15), 
			                                                		                  new DataHeap<MenuItem>(new MenuItem("Steak", 21), 
			                                                		                		                 new MtHeap<MenuItem>(), 
			                                                		                		                 new MtHeap<MenuItem>()), 
			                                                		                  new MtHeap<MenuItem>()), 
			                                                   new DataHeap<MenuItem>(new MenuItem("Dessert", 14), 
			                                                		                  new DataHeap<MenuItem>(new MenuItem("Fish", 16), 
					                                                		                                 new MtHeap<MenuItem>(), 
					                                                		                                 new DataHeap<MenuItem>(new MenuItem("Shrimp", 18), 
					                                                		                                		                new MtHeap<MenuItem>(), 
					                                                		                                		                new MtHeap<MenuItem>())), 
			                                                		                  new DataHeap<MenuItem>(new MenuItem("Chocalate", 19), 
		                                                		                                             new DataHeap<MenuItem>(new MenuItem("Vanilla", 20), 
                                         		                                		                                            new MtHeap<MenuItem>(), 
                                         		                                		                                            new MtHeap<MenuItem>()), 
		                                                		                                             new MtHeap<MenuItem>())));

//////////////////////////////////////////////////////////////////////Book///////////////////////////////////////////////////////////////////////////////////////
	
	DataHeap<Book> books= new DataHeap<Book>(new Book("Animal Farm", "Orwell", 5), 
											 new DataHeap<Book>(new Book("1984", "Orwell", 15), 
																new DataHeap<Book>(new Book("The Things They Carried", "O'Brien", 20), 
																		           new MtHeap<Book>(),
																		           new MtHeap<Book>()), 
										 						new MtHeap<Book>()), 
										     new DataHeap<Book>(new Book("A Seperate Peace", "Knowles", 10), 
													 			new DataHeap<Book>(new Book("Autobiography of Malcolm X", "Haley", 30), 
													 							   new DataHeap<Book>(new Book("Hamlet", "Shakespeare", 40), 
													 												  new MtHeap<Book>(), 
													 												  new DataHeap<Book>(new Book("Harry Potter", "Rowling", 50),
													 														   			 new MtHeap<Book>(), 
													 														   			 new MtHeap<Book>())), 
													 							   new MtHeap<Book>()), 	
													 							   new DataHeap<Book>(new Book("The Painted Veil", "Maugham", 25), 
													 									              new MtHeap<Book>(), 
										 												   		   	  new MtHeap<Book>())));
	
	DataHeap<Book> booksAfter = new DataHeap<Book>(new Book("A Seperate Peace", "Knowles", 10), 
												   new DataHeap<Book>(new Book("Autobiography of Malcolm X", "Haley", 30), 
														              new DataHeap<Book>(new Book("Hamlet", "Shakespeare", 40), 
														            		             new MtHeap<Book>(), 
														            		             new DataHeap<Book>(new Book("Harry Potter", "Rowling", 50), 
														            		            		            new MtHeap<Book>(), 
														            		            		            new MtHeap<Book>())), 
														              new MtHeap<Book>()), 
												   new DataHeap<Book>(new Book("1984", "Orwell", 15), 
														              new DataHeap<Book>(new Book("The Things They Carried", "O'Brien", 20), 
														            		             new MtHeap<Book>(), 
														            		             new MtHeap<Book>()), 
														              new DataHeap<Book>(new Book("The Painted Veil", "Maugham", 25), 
												            		                     new MtHeap<Book>(), 
												            		                     new MtHeap<Book>())));
	
//////////////////////////////////////////////////////////////////////Tests//////////////////////////////////////////////////////////////////////////////////////
	
	boolean testRemoveMinElt(Tester t){
		return t.checkExpect(lunchMenu.removeMinElt().areEqual(lunchMenuAfter), true)                                   &&
			   t.checkExpect(lunchMenu.removeMinElt().findMinElt().same(new MenuItem("Rice", 13)), true)                &&
			   t.checkExpect(lunchMenu.removeMinElt().height() == 4, true)                                              &&
			   t.checkExpect(books.removeMinElt().areEqual(booksAfter), true)                                           &&
			   t.checkExpect(books.removeMinElt().findMinElt().same(new Book("A Seperate Peace", "Knowles", 10)), true) &&			   
			   t.checkExpect(books.removeMinElt().height() == 4, true);
	}	
}	
