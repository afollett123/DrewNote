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
	

	
	// Node class imported from other projects; modified to stores note ids and Text
	private class Node {
	  private int id; // Note's id
	  private Note note; // Note Obj
	  private Node next; // Pointer to next note in the dictionary

		private Node(long id, Note note) {
			this(id, note, null);	
		} 
		
		private Node(long id, Note note, Node nextNode) {
			id = id; // Unique ID of note
			note = note; // Note stored here
			next = nextNode; // Pointer to next note
		} 
	}



	@Override
	public boolean add(Note newNote) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Note lookup(long ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(long ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Note note) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(Note note) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(long ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Note[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

}