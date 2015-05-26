package com.sdcxv.pokergames.roles;

import com.sdcxv.pokergames.enums.PID;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Sdcxv on 2015/5/25.
 * 玩家队列只有一个，故采用单例模式
 */
public class Players {
    private static Players ourInstance = new Players();

    public static Players getInstance() {
        return ourInstance;
    }

    private Players() {
    }

    //玩家队列
    private Queue<Player> players = new LinkedList<Player>();
    //初始化四个玩家，牌局玩家ID分别为A，D，B，C
    private Player playerA = new Player();
    private Player playerB = new Player();
    private Player playerC = new Player();
    private Player playerD = new Player();

    //玩家出队
    public Player getPlayer() {
        return players.poll();
    }

    //玩家入队
    public void setPlayer(Player p) {
        players.offer(p);
    }

    //玩家与玩家队列初始化
    public void initPlayers() {
        playerA.initPlayer(PID.A);
        playerB.initPlayer(PID.B);
        playerC.initPlayer(PID.C);
        playerD.initPlayer(PID.D);
        players.offer(playerA);
        players.offer(playerB);
        players.offer(playerC);
        players.offer(playerD);
    }

    public void showDown(){
        playerA.showDown();
        playerB.showDown();
        playerC.showDown();
        playerD.showDown();
    }
}
