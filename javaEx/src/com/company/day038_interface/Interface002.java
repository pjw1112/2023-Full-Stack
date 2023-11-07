package com.company.day038_interface;

interface Board {
	public void exec();
}

class BoardInsert implements Board {
	public void exec() {
		System.out.println("게시판 삽입기능 입니다.");
	}
}

class BoardDelete implements Board {
	public void exec() {
		System.out.println("게시판 삭제기능 입니다.");
	}
}

class BoardSelect implements Board {
	public void exec() {
		System.out.println("게시판 선택기능 입니다.");
	}
}

class BoardUpdate implements Board {
	public void exec() {
		System.out.println("게시판 수정기능 입니다.");
	}
}

public class Interface002 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = null;
		board = new BoardInsert();
		board.exec();
		board = new BoardDelete();
		board.exec();
		board = new BoardSelect();
		board.exec();
		board = new BoardUpdate();
		board.exec();

	}
}
