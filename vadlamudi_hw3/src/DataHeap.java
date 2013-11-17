// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class DataHeap<T extends IObject<T>> implements IHeap<T>{

	// DataHeap Object Fields
	T root;
	IHeap<T> left;
	IHeap<T> right;
	
	// DataHeap Object Constructor
	public DataHeap(T root, IHeap<T> left, IHeap<T> right){
		this.root = root;
		this.left = left;
		this.right = right;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Adds given element to Activation heap
	public IHeap<T> addElt(T elt) {
		if(this.root.same(elt))
			return this;
		else if(this.root.lessThan(elt))
			return new DataHeap<T>(this.root, this.left, this.right.addElt(elt));
		else //if(this.root < elt)
			return new DataHeap<T>(elt, this, new MtHeap<T>());
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Finds the smallest element (Root) of in the Activating heap
	public T findMinElt() {
		return this.root;
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Returns the height of the Activating heap
	public int height() {
		if(this.left.height() > this.right.height())
			return 1 + this.left.height();
		else if(this.left.height() < this.right.height())
			return 1 + this.right.height();
		else
			return 1 + this.left.height();
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Removes the smallest element (Root) of the Activating heap
	public IHeap<T> removeMinElt() {
		return merge(this.left, this.right);
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Merges the two sub-heaps of the Activating heap
	public IHeap<T> merge(IHeap<T> leftHeap, IHeap<T> rightHeap) {				
		return leftHeap.mergeST(rightHeap);		
	}
	
	// this -> Left Heap
	// Returns new Heap with the two sub-heaps merged if both trees are DataHeaps
	public IHeap<T> mergeST(IHeap<T> rightHeap){
		return rightHeap.mergeRemST(this);
	}
	
	// Checks the root of which sub-heap is smaller and removes the root from that heap
	public IHeap<T> mergeRemST(IHeap<T> heap){
		
		IHeap<T> ST1;
		IHeap<T> ST2;
		IHeap<T> ST3;
		
		if(this.findMinElt().lessThan(heap.findMinElt())){
				ST1 = this.left;
				ST2 = this.right;
				ST3 = heap;
				
				return mergeSTS(ST1, ST2, ST3, this.root);
		}
		else{
				return heap.mergeRemST(this);
		}
	}
	
	// Creates new heap with the new root and three sub-heaps
	public IHeap<T> mergeSTS(IHeap<T> ST1, IHeap<T> ST2, IHeap<T> ST3, T newroot){
		
		if(ST1.height() >= ST2.height() && ST1.height() >= ST3.height())
			return new DataHeap<T>(newroot, ST1, merge(ST2, ST3));
		
		else if(ST2.height() >= ST1.height() && ST2.height() >= ST3.height())
			return new DataHeap<T>(newroot, ST2, merge(ST1, ST3));
		
		else
			return new DataHeap<T>(newroot, ST3, merge(ST1, ST2));
	}
}
