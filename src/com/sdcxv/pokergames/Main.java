package com.sdcxv.pokergames;

import com.sdcxv.pokergames.roles.Banker;
import com.sdcxv.pokergames.roles.Players;

public class Main {

    public static void main(String[] args) {
        //获取庄家实例
        Banker banker = Banker.getInstance();
        //庄家初始化
        banker.initBanker();
        //获取玩家队列实例
        Players players = Players.getInstance();
        //玩家初始化
        players.initPlayers();
        //庄家发牌，共52次
        for (int i = 0; i < 52; i++) {
            banker.deal(players);
        }
        players.showDown();
    }
}
