// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class DataHeap implements IHeap{

	int root;
	IHeap left;
	IHeap right;
	
	public DataHeap(int root, IHeap left, IHeap right){
		this.root = root;
		this.left = left;
		this.right = right;
	}

	public IHeap addElt(int elt) {
		if(this.root == elt)
			return this;
		else if(this.root > elt)
			return new DataHeap(elt, this, new MtHeap());
		else //if(this.root < elt)
			return new DataHeap(this.root, this.left.addElt(elt), this.right.addElt(elt));
	}

	public int findMinElt() {
		return this.root;
	}

	public IHeap removeMinElt() {
		return merge(this.left, this.right);
	}

	public int height() {
		if(this.left.height() > this.right.height())
			return 1 + this.left.height();
		else if(this.left.height() < this.right.height())
			return 1 + this.right.height();
		else
			return 1 + this.left.height();
	}

	public IHeap merge(IHeap heapOne, IHeap heapTwo) {		
		if(heapOne.findMinElt() < heapTwo.findMinElt())
			return heapOne.mergeST(heapTwo);
		else
			return heapTwo.mergeST(heapOne);
	}

	public IHeap mergeST(IHeap heap) {
		
		IHeap ST1 = this.left;
		IHeap ST2 = ((DataHeap)heap).right;
		IHeap ST3 = heap;
			
		if(ST1.height() >= ST2.height() && ST1.height() >= ST3.height())
			return new DataHeap(this.root, ST1, merge(ST2, ST3));
		else if(ST2.height() >= ST1.height() && ST2.height() >= ST3.height())
			return new DataHeap(this.root, ST2, merge(ST1, ST3));
		else
			return new DataHeap(this.root, ST3, merge(ST1, ST2));
	}
}
