/*
*
* 스타트링크에서 판매하는 어린이용 장난감 중에서 가장 인기가 많은 제품은 구슬 탈출이다. 구슬 탈출은 직사각형 보드에 빨간 구슬과 파란 구슬을 하나씩 넣은 다음, 빨간 구슬을 구멍을 통해 빼내는 게임이다.

보드의 세로 크기는 N, 가로 크기는 M이고, 편의상 1×1크기의 칸으로 나누어져 있다. 가장 바깥 행과 열은 모두 막혀져 있고, 보드에는 구멍이 하나 있다. 빨간 구슬과 파란 구슬의 크기는 보드에서 1×1크기의 칸을 가득 채우는 사이즈이고, 각각 하나씩 들어가 있다. 게임의 목표는 빨간 구슬을 구멍을 통해서 빼내는 것이다. 이때, 파란 구슬이 구멍에 들어가면 안 된다.

이때, 구슬을 손으로 건드릴 수는 없고, 중력을 이용해서 이리 저리 굴려야 한다. 왼쪽으로 기울이기, 오른쪽으로 기울이기, 위쪽으로 기울이기, 아래쪽으로 기울이기와 같은 네 가지 동작이 가능하다.

각각의 동작에서 공은 동시에 움직인다. 빨간 구슬이 구멍에 빠지면 성공이지만, 파란 구슬이 구멍에 빠지면 실패이다. 빨간 구슬과 파란 구슬이 동시에 구멍에 빠져도 실패이다. 빨간 구슬과 파란 구슬은 동시에 같은 칸에 있을 수 없다. 또, 빨간 구슬과 파란 구슬의 크기는 한 칸을 모두 차지한다. 기울이는 동작을 그만하는 것은 더 이상 구슬이 움직이지 않을 때 까지이다.

보드의 상태가 주어졌을 때, 최소 몇 번 만에 빨간 구슬을 구멍을 통해 빼낼 수 있는지 구하는 프로그램을 작성하시오.
* */

import java.util.Scanner;

class Stack{
    int top = -1;
    int [] stack = new int[500];
    static final int ERR_KEY = -1;
    public void push(int a) {
        if(top>=499) {
            System.out.println("Stack full!");
            return;
        }
        stack[++top] = a;
    }
    public int pop() {
        if(top<0) {
            System.out.println("Stack empty!");
            return ERR_KEY;
        }
        return stack[top--];
    }
}


public class bj13460 {
    static final int ERR_KEY = -1;

    static int finding_line(String[] board, int n, char c){
        for(int i = 1; i < n-1; i++)
            if(board[i].indexOf(c)!=-1) return i;
        return ERR_KEY;
    }
    static int finding_block(String line, char c){
        return line.indexOf(c);
    }

    public static void main(String [] args){
        // setting board
        Scanner s = new Scanner(System.in);
        Stack stack = new Stack();
        int n, m, i, j;
        n = s.nextInt();    // 줄 수(line)
        m = s.nextInt();    // 칸 수(block)
        String [] board = new String[n];
        for(i = 0; i<n; i++)
            board[i] = s.next();

        // finding answer
        boolean succ = false;
        while(!succ){

        }

    }
}
