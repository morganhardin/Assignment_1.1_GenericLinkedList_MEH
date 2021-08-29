/** 
 * 
 * @author morganhardin
 *
 */
public class LinkedList 
{
	/** This instantiates head as a Node.
	 */
	@SuppressWarnings("rawtypes")
	Node head;
	/** This instantiates length as in integer.
	 */
	int length;
	/** This instantiates tail as a Node.
	 */
	@SuppressWarnings("rawtypes")
	Node tail;
	
	/** This is an empty constructor that sets
	 * head equal to null, length equal
	 * to 0, and tail equal to head.
	 */
	public LinkedList()
	{
		head = null;
		length = 0;
		tail = head;
	}
	/** This is a boolean method that returns
	 * true if head is null and false if head 
	 * is not null.
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		if (head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/** This getter Node method will
	 * return the Node head.
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Node getList()
	{
		return head;
	}
	/** This method passes in aNode into head 
	 * Node, sets head equal to tail, tail 
	 * equal to tail.nextNode, tail.nextNode
	 * equal to null, and returns the Node.
	 * Overall, this adds the inputed Node
	 * value and shifts the previous Nodes
	 * so the new data does not override the
	 * previous inputed data.
	 * 
	 * @param aNode
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addNode(Node aNode)
	{
		if (isEmpty())
		{
			head = aNode;
			tail = head;
			return;
		}
		tail.nextNode = aNode;
		tail = tail.nextNode;
		tail.nextNode = null;
		length++;
	}
}
