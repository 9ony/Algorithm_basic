package day06;
/*이진 검색 트리는 이진 트리가 다음 조건을 만족하면 된다.
 * 1. 어떤 노드 N을 기준으로 왼쪽 서브 트리 노드의 모든 키 값은 
 * 노드 N의 키값 보다 작아야 한다.
 * 2. 오른쪽 서브트리 노드의 키 값은 노드 N의 키 값 보다 커야 한다
 * 3. 같은 키 값을 갖는 노드는 없다.
 * */

import java.util.Comparator;

public class BinaryTree<K,V> {
	private Node<K,V> root;
	//키값의 대소관계 비교를 위한 멤버변수
	private Comparator <? super K> comparator;
	static class Node<K,V>{
		K key;
		V data;
		
		Node<K,V> left;
		Node<K,V> right;
		
		public Node(K key,V data,Node<K,V> left,Node<K,V> right) {
			this.key=key;
			this.data=data;
			this.left=left;
			this.right=right;
		}
		public void print() {
			System.out.println(data);
		}
	}
	public BinaryTree(){
		root=null;
	}
	public BinaryTree( Comparator<? super K> comparator) {
		this.comparator=comparator;
	}
	private int comp(K key1, K key2) {
		if(this.comparator!=null) {
			return comparator.compare(key1, key2);
		}else {
			return ((Comparable<K>)key1).compareTo(key2);
		}
	}
	public void add(K key,V data) {
		if(root==null) {
			root=new Node<K,V>(key,data,null,null);
		}else {
			addNode(root,key,data);
		}
	}
	public void addNode(Node<K,V> node , K key, V data) {
		int condition=comp(key,node.key);
		if(condition==0) {//key가 이진트리에 이미 존재하는 경우
			return;
		}else if(condition<0) {
			if(node.left==null) {
				node.left=new Node<K,V>(key,data,null,null);
			}else {
				addNode(node.left,key,data);
			}
		}else {
			if(node.right==null) {
				node.right=new Node<K,V>(key,data,null,null);
			}else {
				addNode(node.right,key,data);
			}
		}	
	}
	public V search(K key) {
		Node<K,V> ptr=root;
		while(true) {
			if(ptr==null) {
				return null;
			}
			int condition=comp(key,ptr.key);
			if(condition==0) {//검색성공인경우
				return ptr.data;
			}else if(condition<0) {//왼쪽 서브트리에서 계속 검색
				ptr=ptr.left;
			}else if(condition>0) {//오른쪽서브트리에서 계속 검색
				ptr=ptr.right;
			}
			
		}
	}
	public void print() {
		printSubTree(root);
	}
	public void printSubTree(Node<K,V> node) {
		if(node!=null) {
			printSubTree(node.left);
			System.out.println(node.key+": "+node.data);
			printSubTree(node.right);
		}
	}
}
