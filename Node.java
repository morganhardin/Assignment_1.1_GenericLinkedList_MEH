/**
 * 
 * @author morganhardin
 *
 * @param <T>
 */
public class Node <T>
{
	/** This is a generic data type 
	 * that can be called, used, and
	 * manipulated.
	 */
	public T data;
	/** The nextNode variable is what 
	 * is the next in the already 
	 * instantiated Node.
	 */
	@SuppressWarnings("rawtypes")
	Node nextNode;
	
	/** This is an empty constructor 
	 * that sets nextNode equal to null.
	 */
	public Node()
	{
		nextNode = null;
	}
	/** This is a setter that holds generic 
	 * data and sets this data equal to the
	 * inputed data.
	 * 
	 * @param data
	 */
	public void setData(T data)
	{
		this.data = data;
	}
	/** This getter will return
	 * this Node.
	 * 
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Node getNode()
	{
		return this;
	}
	/** This setter sets the inputed 
	 * nextNode equal to this nextNode.
	 * 
	 * @param nextNode
	 */
	@SuppressWarnings("rawtypes")
	public void setNextNode(Node nextNode)
	{
		this.nextNode = nextNode;
	}
}
