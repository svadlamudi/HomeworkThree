// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class MtHeap implements IHeap{

	int root;
	
	public MtHeap(){
		this.root = 0;
	}
	
	public IHeap addElt(int elt) {
		return new DataHeap(elt, new MtHeap(), new MtHeap());
	}

	public int findMinElt() {
		return this.root;
	}

	public IHeap removeMinElt() throws RuntimeException{
		 return new MtHeap();
	}

	public int height() {
		return 0;
	}

	public IHeap merge(IHeap heapOne, IHeap heapTwo) throws RuntimeException{
		throw new RuntimeException("Shouldn't call merge on an MtHeap");
	}
	
	public IHeap mergeST(IHeap heap){
		return heap;
	}
}
