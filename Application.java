/** 
 * 
 * @author morganhardin
 *
 */
public class Application 
{
	/** This main method instantiates a new 
	 * variation of the LinkedList class
	 * and passes various data types into 
	 * the Node to then be printed. It does
	 * this by calling the methods from the
	 * LinkedList class.
	 * 
	 * @param args
	 */
	@SuppressWarnings({"rawtypes","unchecked"})
	public static void main(String[] args) 
	{
		LinkedList myList = new LinkedList();
		
		Node aNode = new Node();
		aNode.setData("yes");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData(2);
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData(1.8);
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData(true);
		myList.addNode(aNode);
		
		Node tempnode = myList.getList();
		do
		{
			System.out.println(tempnode.data);
			tempnode = tempnode.nextNode;
		}
		while (tempnode != null);
	}
}
