package com.sdcxv.pokergames.poker;

import com.sdcxv.pokergames.enums.Points;
import com.sdcxv.pokergames.enums.Suits;
import com.sdcxv.pokergames.utils.Utils;
import com.sdcxv.pokergames.roles.Player;

/**
 * Created by Sdcxv on 2015/5/25.
 * 牌组，Deck
 */
public class Deck extends AbstractPoker {
    //牌组初始化
    @Override
    public void initPoker() {
        for (int i = 0; i < 13; i++)
            for (int j = 0; j < 4; j++) {
                poker[i][j] = true;
            }
    }

    //发牌
    public void deal(Suits suit, Points point, Player player) {
        poker[Utils.pointToIntger(point)][Utils.suitToIntger(suit)] = false;
        player.check(suit, point);
    }

    //检查牌组中是否有某张牌
    public boolean checkDeck(Suits suit, Points point) {
        return poker[Utils.pointToIntger(point)][Utils.suitToIntger(suit)];
    }
}
