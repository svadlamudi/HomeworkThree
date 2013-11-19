// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class MtHeap<T extends ISame<T>> implements IHeap<T>{

		
	public MtHeap(){}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Adds the given element to the Activating heap
	public IHeap<T> addElt(T elt) {
		return new DataHeap<T>(elt, new MtHeap<T>(), new MtHeap<T>());
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Finds the smallest element (Root) of the Activation heap; 
	// MtHeap doesn't have a smallest element as it doesn't have any elements
	public T findMinElt() {
		throw new RuntimeException("Shouldn't call findMinElt on MtHeap");
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Removes the smallest element of the Activating heap
	// MtHeap doesn't have any elements so removing an element doesn't change the Activating heap 
	public IHeap<T> removeMinElt(){
		 return this;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Returns the height of the Activating heap
	// MtHeap doesn't have any elements so the height of the Activating heap is 0
	public int height() {
		return 0;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Returns new heap with the two sub-heaps of the Activating heap merged
	// MtHeap doesn't contain any sub-heaps so merge shouldn't be called on an MtHeap
	public IHeap<T> merge(IHeap<T> lefHeap, IHeap<T> rightHeap) throws RuntimeException{
		throw new RuntimeException("Shouldn't call merge on an MtHeap");
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Returns the rightHeap if the leftHeap is an MtHeap
	public IHeap<T> mergeST(IHeap<T> rightHeap){
		return rightHeap;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Returns the leftHeap is the rightHeap is an MtHeap
	public IHeap<T> mergeRemST(IHeap<T> leftHeap){
		return leftHeap;
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	// Returns true if the Activating heap and parameter heap are equal
	public boolean areEqual(IHeap<T> that){
		return that.height() == 0;
	}
}