//import Node.java;
public class MinHeap {
	
		private int maxSize;
		private int size = 0;
		private int total = 0;
		private Node[] heapArray;
		private boolean full = false;
		private boolean empty = true;
		private int current = 1;
		
		public MinHeap(int maxSize){
			this.heapArray = new Node[maxSize];
			this.maxSize = maxSize;
			
		}
		public int getSize(){
			return this.size;
		}
		
		public void insert(Node n){
			if(empty){
				empty = false;
				heapArray[0] = n;
				current++;
				size++;
				total +=n.getQIVal();
			} else if(full) {
				System.out.println("array is full");
				if(worthy(n)){
					popNswap(n);
				}
			} else {
				size++;
				if (size == maxSize){
					full = true;
				}
				heapArrayInsert(n);
				current++;
				total += n.getQIVal();
			}
		}
		
		private void heapArrayInsert(Node n){
			int pos = current;
			if(heapArray[getParent(pos)-1].getQIVal() < n.getQIVal()){
				heapArray[current-1] = n;
			}
			
			while (heapArray[getParent(pos)-1].getQIVal() > n.getQIVal()){
				Node temp = heapArray[getParent(pos)-1];
				heapArray[current-1] = temp;
				heapArray[getParent(pos)-1] = n;
				pos = getParent(pos);
			} 
		}
		
		private void popNswap(Node n){
			heapArray[0] = n;
			int pos = 1;
			int height = (int)(Math.log(maxSize)/Math.log(2));
			while(pos <= height){
				int minChildPos = -1;
				if (size%2==0){
					if(heapArray[pos-1].getQIVal() > heapArray[getLeft(pos)-1].getQIVal() ){
					
						minChildPos = 2*pos;
					}
				} else if(heapArray[pos-1].getQIVal() > heapArray[getLeft(pos)-1].getQIVal() || heapArray[pos-1].getQIVal() > heapArray[getRight(pos)-1].getQIVal()){
				    minChildPos = getMinChildPos(pos);
				}
				if(minChildPos>0){
					Node temp = heapArray[minChildPos-1];
					heapArray[minChildPos-1] = heapArray[pos-1];
					heapArray[pos-1] = temp;
					pos = minChildPos;
				} else {
					pos = height+2;
				}
			}
		}
		
		private int getMinChildPos(int pos){
			if(heapArray[getLeft(pos-1)].getQIVal() < heapArray[getRight(pos-1)].getQIVal()){
				return 2*pos;
			}
			return 2*pos+1;
		}
		
		private boolean worthy(Node n){
			int newTotal = total - getMin() + n.getQIVal();
			if(total > newTotal){
				return false;
			} 
			total = newTotal;
			return true;
		}
		
		public int getMin(){
			return this.heapArray[0].getQIVal();
		}
		
		private int getParent(int pos){
			if (pos/2 == 0){
				return 1;
			}
			return (pos)/2;
		}
		
		private int getLeft(int pos){
			return (pos)*2;
		}
		
		private int getRight(int pos){
			return pos*2 + 1;
		}
		public void print(){
			for(int i = 0; i < size; i++){
				 System.out.println("Name: "+ heapArray[i].getName() + ", QI-VAL: "+ heapArray[i].getQIVal());
			 }
		}

}
