package edu.drew.note;

//import edu.drew.note.BinarySearchSortedArray.Node;

public class BinarySearchSortedArray implements NoteCollection{

	private int SIZE;
	private Note[] NoteArray;
	
	public BinarySearchSortedArray(){
		SIZE = 100;
		NoteArray = new Note[SIZE];
	}
	
	public BinarySearchSortedArray(int size){
		SIZE= size;
		NoteArray = new Note[SIZE];
	}
	

	
	public boolean binarySearch(Note[]note, int first, int last, long ID){ //O(log n)
		int mid = (first + last) / 2; //splits list in half
		if (first > last) 
			return false;
		else if (ID == note[mid].getID()) //if the ID and middle number are the same
			return true;
		else if (ID < note[mid].getID())//if the ID is less than the middle number
			return binarySearch (note, first, mid - 1, ID);
		else //if the middle number is more than the middle number
			return binarySearch(note, mid + 1, last, ID);
		}
	

	@Override
	public boolean add(Note newNote) {
		if(newNote > SIZE);
			SIZE++;
			newNote.add(Note);
		return false;
	}

	@Override
	public Note lookup(long ID) {
		// CALL A SORT INTERFACE, CREATE A SORT OBJECT AND CALL IT
		//CALL BINARY SEARCH
		return null;
	}

	@Override
	public boolean remove(long ID) {
		//BinarySearchSortedArray 
		return false;
	}

	@Override
	public boolean remove(Note note) {
		//BINARY SEARCH 
		//HAVE THIS ONE CALL NOTE.GETiD with other remove
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (SIZE == 0);
		return false;
	}

	@Override
	public int getSize() {
		get.Size(newNote);
		return 0;
	}

	@Override
	public boolean contains(Note note) {
		// CALLING ID
		return false;
	}

	@Override
	public boolean contains(long ID) {
		// CALLING BINARY SEACRH
		return false;
	}

	@Override
	public Note[] toArray() {
		return null;
	}

}