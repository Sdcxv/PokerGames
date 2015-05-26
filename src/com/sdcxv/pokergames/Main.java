package com.sdcxv.pokergames;

import com.sdcxv.pokergames.roles.Banker;
import com.sdcxv.pokergames.roles.Players;

public class Main {

    public static void main(String[] args) {
        //��ȡׯ��ʵ��
        Banker banker = Banker.getInstance();
        //ׯ�ҳ�ʼ��
        banker.initBanker();
        //��ȡ��Ҷ���ʵ��
        Players players = Players.getInstance();
        //��ҳ�ʼ��
        players.initPlayers();
        //ׯ�ҷ��ƣ���52��
        for (int i = 0; i < 52; i++) {
            banker.deal(players);
        }
        players.showDown();
    }
}
