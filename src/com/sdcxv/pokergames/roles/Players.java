package com.sdcxv.pokergames.roles;

import com.sdcxv.pokergames.enums.PID;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Sdcxv on 2015/5/25.
 * ��Ҷ���ֻ��һ�����ʲ��õ���ģʽ
 */
public class Players {
    private static Players ourInstance = new Players();

    public static Players getInstance() {
        return ourInstance;
    }

    private Players() {
    }

    //��Ҷ���
    private Queue<Player> players = new LinkedList<Player>();
    //��ʼ���ĸ���ң��ƾ����ID�ֱ�ΪA��D��B��C
    //���E���ڷ�ֹ���зǿ�
    private Player playerA = new Player();
    private Player playerB = new Player();
    private Player playerC = new Player();
    private Player playerD = new Player();
    private Player playerE = new Player();

    //��ҳ���
    public Player getPlayer() {
        return players.poll();
    }

    //������
    public void setPlayer(Player p) {
        players.offer(p);
    }

    //�������Ҷ��г�ʼ��
    public void initPlayers() {
        playerA.initPlayer(PID.A);
        playerB.initPlayer(PID.B);
        playerC.initPlayer(PID.C);
        playerD.initPlayer(PID.D);
        playerE.initPlayer(PID.E);
        players.offer(playerA);
        players.offer(playerB);
        players.offer(playerC);
        players.offer(playerD);
        players.offer(playerE);
    }

    public void showDown(){
        playerA.showDown();
        playerB.showDown();
        playerC.showDown();
        playerD.showDown();
    }
}
