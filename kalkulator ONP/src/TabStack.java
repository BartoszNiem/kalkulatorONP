import java.util.EmptyStackException;
import java.util.*;
//import static org.junit.Assert.*;
public class TabStack {
		private LinkedList<String> stack=new LinkedList<String>();
	
		
		public String pop()  throws EmptyStackException{
			if(stack.size() == 0) {
				throw new EmptyStackException();		
			}
			else {	
			return stack.removeLast();
			}
		}
		public String top()  throws EmptyStackException{
			if(stack.size() == 0) {
				throw new EmptyStackException();		
			}
			else {	
			return stack.peekLast();
			}
		}
		
		public void push(String a){		
			stack.add(a);		
		}
		
		public String toString(){
			String tmp = "";
			for(int i = 0; i < stack.size(); i++)
				tmp += stack.get(i) + " ";
			return tmp;
		}
		
		public int getSize(){
			return stack.size();
		}
		
		public void clear() {
			stack.clear();;
		}
		public boolean isEmpty() {
			if(stack.isEmpty()==true) {
				return true;
			}
			else
				return false;
		}
		
		public String showValue(int i){
			if(i < stack.size())
				return stack.get(i);
			else return null;
		}
		
	}

