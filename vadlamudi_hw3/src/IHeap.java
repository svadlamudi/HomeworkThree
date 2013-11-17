// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public interface IHeap<T extends IObject<T>>{

	// Adds the given element to the Activating heap
	IHeap<T> addElt(T elt);
	
	// Finds the smallest element (Root) of the Activating heap
	T findMinElt();
	
	// Removes the smallest element (Root) of the Activating heap
	IHeap<T> removeMinElt();
	
	// Returns the height of the Activating heap
	int height();
	
	// Merges the two sub-heaps of the Activating heap
	IHeap<T> merge(IHeap<T> leftHeap, IHeap<T> rightHeap);	
	
	// Checks whether the leftHeap is an MtHeap or DataHeap
	IHeap<T> mergeST(IHeap<T> rightHeap);
	
	// Checks whether the rightHeap is an MtHeap or DataHeap
	IHeap<T> mergeRemST(IHeap<T> leftHeap);
}
