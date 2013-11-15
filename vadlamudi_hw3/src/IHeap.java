// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public interface IHeap {

	IHeap addElt(int elt);
	
	int findMinElt();
	
	IHeap removeMinElt();
	
	int height();
	
	IHeap merge(IHeap heapOne, IHeap heapTwo);	
	
	IHeap mergeST(IHeap heap);
}
