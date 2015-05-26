package com.sdcxv.pokergames.poker;

import com.sdcxv.pokergames.enums.PID;
import com.sdcxv.pokergames.enums.Points;
import com.sdcxv.pokergames.enums.Suits;
import com.sdcxv.pokergames.utils.Utils;

/**
 * Created by Sdcxv on 2015/5/25.
 * 手牌，Hand
 */
public class Hand extends AbstractPoker {
    //初始化玩家手牌
    @Override
    public void initPoker() {
        for (int i = 0; i < 13; i++)
            for (int j = 0; j < 4; j++) {
                poker[i][j] = false;
            }
    }

    //展示手牌
    public void showPocket(PID pID) {
        System.out.println("\nPlayer_" + pID + " has:");
        int k =0;
        for (int i = 0; i < 13; i++)
            for (int j = 0; j < 4; j++) {
                if (poker[i][j] == true) {
                    System.out.println(k++ +"."+ "the " + Utils.intgerToSuit(j) + " of " + Utils.intgerToPoint(i));
                }
            }
    }

    //加入手牌
    public void joinHand(Suits suit, Points point) {
        poker[Utils.pointToIntger(point)][Utils.suitToIntger(suit)] = true;
    }
}
