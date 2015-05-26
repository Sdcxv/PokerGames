package com.sdcxv.pokergames.roles;

import com.sdcxv.pokergames.enums.PID;
import com.sdcxv.pokergames.enums.Points;
import com.sdcxv.pokergames.enums.Suits;
import com.sdcxv.pokergames.poker.Hand;

/**
 * Created by Sdcxv on 2015/5/25.
 * 玩家类
 */
public class Player {
    private Hand hand = new Hand();

    private PID pId;

    public PID getpId() {
        return pId;
    }

    //玩家初始化
    public void initPlayer(PID p) {
        hand.initPoker();
        pId = p;
    }

    //展示手牌
    public void showDown() {
        hand.showPocket(pId);
    }

    //查看所收到的牌并加入手牌
    public void check(Suits suit, Points point) {
        hand.joinHand(suit, point);
    }
}
