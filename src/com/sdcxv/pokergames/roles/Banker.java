package com.sdcxv.pokergames.roles;

import com.sdcxv.pokergames.enums.PID;
import com.sdcxv.pokergames.poker.Deck;

import java.security.SecureRandom;

import static com.sdcxv.pokergames.utils.Utils.intgerToPoint;
import static com.sdcxv.pokergames.utils.Utils.intgerToSuit;

/**
 * Created by Sdcxv on 2015/5/25.
 * <p>
 * 庄家类
 * One Banker only
 * Lazy initialization
 */
public class Banker {

    private static Banker ourInstance = new Banker();

    public static Banker getInstance() {
        return ourInstance;
    }

    private Banker() {
    }

    private Deck deck = new Deck();
    private SecureRandom secureRandom = new SecureRandom();
    private int counter = 0;
    private Player playerBuffer = new Player();

    //庄家初始化
    public void initBanker() {
        deck.initPoker();
    }

    //打印牌组
    public void checkDeck() {
        deck.checkPoker();
    }

    //庄家给玩家队列发牌
    public void deal(Players players) {
        int r = secureRandom.nextInt(52);
        //牌未发出
        if (deck.checkDeck(intgerToSuit(r % 4), intgerToPoint(r / 4))) {
            playerBuffer = players.getPlayer();
            //若取得的玩家为玩家E
            if (playerBuffer.getpId() == PID.E) {
                players.setPlayer(playerBuffer);
                playerBuffer = players.getPlayer();
            }
            deck.deal(intgerToSuit(r % 4), intgerToPoint(r / 4), playerBuffer);
            players.setPlayer(playerBuffer);
            counter++;
        } else {
            //牌已发出且未发完
            if (counter < 52)
                deal(players);
        }
    }
}
