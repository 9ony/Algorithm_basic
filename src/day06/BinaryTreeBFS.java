package day06;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBFS {
	Node root;
	class Node{
		int data;
		Node left, right;//왼쪽자식 오른쪽자식 노드를 참조할 변수
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
	public Node MakeTree() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		return root;
	}
	public void BFS(Node root) {
		Queue<Node> q = new LinkedList<>();
		//삽입:add(),offer()
		//삭제:remover(),poll()
		//검사:peek()
		q.offer(root);
		int level=0;
		while(!q.isEmpty()) {
			System.out.print("L"+level+": ");
			for(int i=0;i<q.size();i++) {
				//큐에서 노드를 꺼내 출력하자
				Node item=q.poll();
				System.out.print(item.data+"-> ");
				if(item.left!=null) q.offer(item.left);
				if(item.right!=null) q.offer(item.right);
			}
			System.out.println();
			level++;
		}
	}
	public static void main(String[] args) {
		BinaryTreeBFS app = new BinaryTreeBFS();
		Node root=app.MakeTree();
		app.BFS(root);
	}

}
